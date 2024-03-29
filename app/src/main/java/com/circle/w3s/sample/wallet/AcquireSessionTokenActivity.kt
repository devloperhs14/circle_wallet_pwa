package com.circle.w3s.sample.wallet

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.circle.w3s.sample.wallet.databinding.AcquireSessionTokenBinding
import java.io.IOException
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import com.google.gson.Gson
import android.content.Intent

data class UserTokenResponse(
    val data: UserData
)

data class UserData(
    val userToken: String,
    val encryptionKey: String
)
class AcquireSessionTokenActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = AcquireSessionTokenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tokenResponseText = binding.tokenResponseText
        val loadingProgressBar = binding.loadingProgressBar

        tokenResponseText.visibility = android.view.View.INVISIBLE
        loadingProgressBar.visibility = android.view.View.VISIBLE

        // Retrieve apiKey and userId from the intent extras
        val apiKey = intent.getStringExtra("apiKey")
        val userId = intent.getStringExtra("userId")
        val appId = intent.getStringExtra("appId")

        Log.d("AcquireSessionTokenActivity", "Msg: ${apiKey}, $userId")
        //api call

        GlobalScope.launch(Dispatchers.IO) {
              //Step 3 - PASTE CODE HERE FOR "CREATE SESSION TOKEN" API
            val client = OkHttpClient()
            val mediaType = "application/json".toMediaTypeOrNull()
            val body = "{\"userId\":\"$userId\"}".toRequestBody(mediaType)
            val request = Request.Builder()
                .url("https://api.circle.com/v1/w3s/users/token")
                .post(body)
                .addHeader("accept", "application/json")
                .addHeader("content-type", "application/json")
                .addHeader("authorization", "Bearer $apiKey")
                .build()

            try {
                val response = client.newCall(request).execute()
                runOnUiThread {
                    if (response.isSuccessful) {
                        val responseBody = response.body?.string()
                        // Process the response data
                        Log.d("AcquireSessionTokenActivity", "ResponseBody: $responseBody")

                        // Use Gson to parse the JSON response into your data class
                        // Step 4 - PARSE JSON RESPONSE TO INITIALISE WALLET ON NEXT PAGE
                        val gson = Gson()
                        val responseObject = gson.fromJson(responseBody, UserTokenResponse::class.java)

                        // Now you can access the parsed data
                        val userToken = responseObject.data.userToken
                        val encryptionKey = responseObject.data.encryptionKey
                        Log.d("AcquireSessionTokenActivity", "parseData: $userToken, $encryptionKey")

                        tokenResponseText.visibility = android.view.View.VISIBLE
                        tokenResponseText.text = "Successfully Acquired session token."

                        //redirect to next page with the userToken and encryption key values
                        val intent = Intent(this@AcquireSessionTokenActivity, InitialiseUserWalletActivity::class.java)

                        //pass data to next page
                        intent.putExtra("apiKey", apiKey)
                        intent.putExtra("userId", userId)
                        intent.putExtra("userToken", userToken)
                        intent.putExtra("encryptionKey", encryptionKey)
                        intent.putExtra("appId", appId)
                        // Start the new activity
                        startActivity(intent)

                        // Finish the current activity if needed
                        finish()

                    } else {
                        // Handle error response
                        Log.e("AcquireSessionTokenActivity", "Error: ${response}")
                        loadingProgressBar.visibility = android.view.View.INVISIBLE

                    }
                }

            } catch (e: IOException) {
                Log.e("AcquireSessionTokenActivity", "Error: ${e.message}", e)

            }



        }
    }
}