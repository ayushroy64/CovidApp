package com.example.covidapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GuidelineFragment extends Fragment {
    @Nullable
    View view;
    WebView webView;
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragment_home,null);
        //load_background_colour();

        webView = (WebView) view.findViewById(R.id.home_webview);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);

        /*WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        WebViewClientImpl webViewClient = new WebViewClientImpl(this);*/


        webView.loadUrl("https://www.who.int/emergencies/diseases/novel-coronavirus-2019/technical-guidance");


        return view;

    }

/*    private
    RecyclerView faqsRecyclerView;
    private
    ArrayList<FaqsModel>faqsList ;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_guideline, container, false);

        faqsRecyclerView=view.findViewById(R.id.faqsRecyclerView);
        faqsList=new ArrayList<>();
        faqsList.add(new FaqsModel(R.string.faq_q1,R.string.faq_a1));
        faqsList.add(new FaqsModel(R.string.faq_q2,R.string.faq_a2));
        faqsList.add(new FaqsModel(R.string.faq_q3,R.string.faq_a3));
        faqsList.add(new FaqsModel(R.string.faq_q4,R.string.faq_a4));
        faqsList.add(new FaqsModel(R.string.faq_q5,R.string.faq_a5));
        *//*faqsList.add(new FaqsModel(R.string.faq_q6,R.string.faq_a6));
        faqsList.add(new FaqsModel(R.string.faq_q7,R.string.faq_a7));
        faqsList.add(new FaqsModel(R.string.faq_q8,R.string.faq_a8));
        faqsList.add(new FaqsModel(R.string.faq_q9,R.string.faq_a9));
        faqsList.add(new FaqsModel(R.string.faq_q10,R.string.faq_a10));
        faqsList.add(new FaqsModel(R.string.faq_q11,R.string.faq_a11));*//*

        int resId = R.anim.list_item_animation;
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(getContext(), resId);

        FaqsAdapter faqsAdapter = new FaqsAdapter(faqsList);
        faqsRecyclerView.setAdapter(faqsAdapter);
        faqsRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        faqsRecyclerView.setLayoutAnimation(animation);


        return view;
    }*/
}
