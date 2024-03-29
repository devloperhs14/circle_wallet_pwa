// Generated by view binder compiler. Do not edit!
package com.circle.w3s.sample.wallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.circle.w3s.sample.wallet.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HomepageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button SendBtn;

  @NonNull
  public final ImageView avaxlogoImageView;

  @NonNull
  public final ImageView avaxlogoImageView2;

  @NonNull
  public final TextView circleHeader4;

  @NonNull
  public final Button copyButton;

  @NonNull
  public final TextView ethTokenBalanceText;

  @NonNull
  public final ImageView homePagelogo;

  @NonNull
  public final Button logoutButton;

  @NonNull
  public final Button receiveBtn;

  @NonNull
  public final Button refreshbutton;

  @NonNull
  public final TextView statusLoadingTextView;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView tokenBalance;

  @NonNull
  public final TextView usdcTokenBalanceText;

  @NonNull
  public final ImageView usdclogoImageView;

  @NonNull
  public final Button viewTransactionBtn;

  @NonNull
  public final TextView walletAddressTextView;

  private HomepageBinding(@NonNull ConstraintLayout rootView, @NonNull Button SendBtn,
      @NonNull ImageView avaxlogoImageView, @NonNull ImageView avaxlogoImageView2,
      @NonNull TextView circleHeader4, @NonNull Button copyButton,
      @NonNull TextView ethTokenBalanceText, @NonNull ImageView homePagelogo,
      @NonNull Button logoutButton, @NonNull Button receiveBtn, @NonNull Button refreshbutton,
      @NonNull TextView statusLoadingTextView, @NonNull TextView textView,
      @NonNull TextView tokenBalance, @NonNull TextView usdcTokenBalanceText,
      @NonNull ImageView usdclogoImageView, @NonNull Button viewTransactionBtn,
      @NonNull TextView walletAddressTextView) {
    this.rootView = rootView;
    this.SendBtn = SendBtn;
    this.avaxlogoImageView = avaxlogoImageView;
    this.avaxlogoImageView2 = avaxlogoImageView2;
    this.circleHeader4 = circleHeader4;
    this.copyButton = copyButton;
    this.ethTokenBalanceText = ethTokenBalanceText;
    this.homePagelogo = homePagelogo;
    this.logoutButton = logoutButton;
    this.receiveBtn = receiveBtn;
    this.refreshbutton = refreshbutton;
    this.statusLoadingTextView = statusLoadingTextView;
    this.textView = textView;
    this.tokenBalance = tokenBalance;
    this.usdcTokenBalanceText = usdcTokenBalanceText;
    this.usdclogoImageView = usdclogoImageView;
    this.viewTransactionBtn = viewTransactionBtn;
    this.walletAddressTextView = walletAddressTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HomepageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomepageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.homepage, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomepageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.SendBtn;
      Button SendBtn = ViewBindings.findChildViewById(rootView, id);
      if (SendBtn == null) {
        break missingId;
      }

      id = R.id.avaxlogoImageView;
      ImageView avaxlogoImageView = ViewBindings.findChildViewById(rootView, id);
      if (avaxlogoImageView == null) {
        break missingId;
      }

      id = R.id.avaxlogoImageView2;
      ImageView avaxlogoImageView2 = ViewBindings.findChildViewById(rootView, id);
      if (avaxlogoImageView2 == null) {
        break missingId;
      }

      id = R.id.circleHeader4;
      TextView circleHeader4 = ViewBindings.findChildViewById(rootView, id);
      if (circleHeader4 == null) {
        break missingId;
      }

      id = R.id.copyButton;
      Button copyButton = ViewBindings.findChildViewById(rootView, id);
      if (copyButton == null) {
        break missingId;
      }

      id = R.id.ethTokenBalanceText;
      TextView ethTokenBalanceText = ViewBindings.findChildViewById(rootView, id);
      if (ethTokenBalanceText == null) {
        break missingId;
      }

      id = R.id.homePagelogo;
      ImageView homePagelogo = ViewBindings.findChildViewById(rootView, id);
      if (homePagelogo == null) {
        break missingId;
      }

      id = R.id.logoutButton;
      Button logoutButton = ViewBindings.findChildViewById(rootView, id);
      if (logoutButton == null) {
        break missingId;
      }

      id = R.id.receiveBtn;
      Button receiveBtn = ViewBindings.findChildViewById(rootView, id);
      if (receiveBtn == null) {
        break missingId;
      }

      id = R.id.refreshbutton;
      Button refreshbutton = ViewBindings.findChildViewById(rootView, id);
      if (refreshbutton == null) {
        break missingId;
      }

      id = R.id.statusLoadingTextView;
      TextView statusLoadingTextView = ViewBindings.findChildViewById(rootView, id);
      if (statusLoadingTextView == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.tokenBalance;
      TextView tokenBalance = ViewBindings.findChildViewById(rootView, id);
      if (tokenBalance == null) {
        break missingId;
      }

      id = R.id.usdcTokenBalanceText;
      TextView usdcTokenBalanceText = ViewBindings.findChildViewById(rootView, id);
      if (usdcTokenBalanceText == null) {
        break missingId;
      }

      id = R.id.usdclogoImageView;
      ImageView usdclogoImageView = ViewBindings.findChildViewById(rootView, id);
      if (usdclogoImageView == null) {
        break missingId;
      }

      id = R.id.viewTransactionBtn;
      Button viewTransactionBtn = ViewBindings.findChildViewById(rootView, id);
      if (viewTransactionBtn == null) {
        break missingId;
      }

      id = R.id.walletAddressTextView;
      TextView walletAddressTextView = ViewBindings.findChildViewById(rootView, id);
      if (walletAddressTextView == null) {
        break missingId;
      }

      return new HomepageBinding((ConstraintLayout) rootView, SendBtn, avaxlogoImageView,
          avaxlogoImageView2, circleHeader4, copyButton, ethTokenBalanceText, homePagelogo,
          logoutButton, receiveBtn, refreshbutton, statusLoadingTextView, textView, tokenBalance,
          usdcTokenBalanceText, usdclogoImageView, viewTransactionBtn, walletAddressTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
