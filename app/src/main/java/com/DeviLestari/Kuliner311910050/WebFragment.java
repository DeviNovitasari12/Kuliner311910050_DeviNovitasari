package com.DeviLestari.Kuliner311910050;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class WebFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_web, container, false);
        WebView myWebView = myView.findViewById(R.id.web_view);

        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setLoadsImagesAutomatically(true);
        myWebView.getSettings().setDomStorageEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://open.spotify.com/");
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        // Inflate the layout for this fragment
        return myView;
    }

}