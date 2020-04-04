package com.example.covidapp;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NewsFragment extends Fragment {

   /* public static final String TAG = "NewsFragment";
    private static final String baseURL = "http://twitter.com";
    private static final String widgetInfo = "<a class=\"twitter-timeline\" href=\"https://twitter.com/MoHFW_INDIA?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor\" data-widget-id=\"394415351972114432\">Tweets about \"@MOHFW\"</a> " +
            "<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+\"://platform.twitter.com/widgets.js\";fjs.parentNode.insertBefore(js,fjs);}}(document,\"script\",\"twitter-wjs\");</script>";*/
    @Nullable
    View view;
    WebView webView;
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragment_news,null);
        //load_background_colour();

        webView = (WebView) view.findViewById(R.id.timeline_webview);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);

        /*WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        WebViewClientImpl webViewClient = new WebViewClientImpl(this);*/


        webView.loadUrl("https://twitter.com/MoHFW_INDIA?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");


        return view;

    }


    /*public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && this.webView.canGoBack()) {
            this.webView.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }*/

   /* private void load_background_colour(){
        WebView webView = view.findViewById(R.id.timeline_webview);
        //webView.setBackgroundColor(getResources().getColor(R.color.twitter_dark));
        webView.setBackgroundColor(0); // transparent
    }*/

   /* public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return true;
    }*/
}
