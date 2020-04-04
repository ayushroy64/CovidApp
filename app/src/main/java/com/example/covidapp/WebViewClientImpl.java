package com.example.covidapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

public class WebViewClientImpl extends WebViewClient {
    private Fragment activity = null;
    public WebViewClientImpl(Fragment fragment){
        this.activity = fragment;
    }
    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url){
        if(url.indexOf("https://twitter.com/MoHFW_INDIA?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor")>-1) return false;
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        activity.startActivity(intent);
        return true;
    }
}
