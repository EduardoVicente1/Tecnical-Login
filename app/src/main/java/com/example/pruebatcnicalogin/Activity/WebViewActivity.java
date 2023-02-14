package com.example.pruebatcnicalogin.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import com.example.pruebatcnicalogin.R;
import com.example.pruebatcnicalogin.util.Singleton;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;
    private ConstraintLayout constraintLayout, clInfo;
    private TextView tvnrodocumento, tvPass;
    String url = "https://alliotec.com";
    Singleton singleton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        singleton = Singleton.getInstance();

        webView = (WebView) findViewById(R.id.webView);
        constraintLayout = (ConstraintLayout) findViewById(R.id.clLayout);
        clInfo = (ConstraintLayout) findViewById(R.id.clInfo);
        tvnrodocumento = (TextView) findViewById(R.id.tvnroDocumento);
        tvPass = (TextView) findViewById(R.id.tvPass);

        tvnrodocumento.setText(singleton.getUsuario());
        tvPass.setText(singleton.getPassword());

        final WebSettings ajustesVisorWeb = webView.getSettings();
        ajustesVisorWeb.setJavaScriptEnabled(true);
        webView.loadUrl(url);


    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
            constraintLayout.setVisibility(View.GONE);
            clInfo.setVisibility(View.GONE);
            Log.d("LightWriter", "I WORK BRO.");
            return true;
        } else if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
            constraintLayout.setVisibility(View.VISIBLE);
            clInfo.setVisibility(View.VISIBLE);
        }

        return super.onKeyDown(keyCode, event);
    }
}