package net.lemonsoft.lemonmix;

import android.content.Context;
import android.util.AttributeSet;

import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebViewClient;

import java.util.Map;

/**
 * Created by LiuRi on 2017/2/20.
 */

public class LMWebView extends com.tencent.smtt.sdk.WebView {

    public LMWebView(Context context) {
        super(context);
        this._init();
    }

    public LMWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this._init();
    }

    public LMWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._init();
    }

    public LMWebView(Context context, AttributeSet attributeSet, int i, boolean b) {
        super(context, attributeSet, i, b);
        this._init();
    }

    public LMWebView(Context context, AttributeSet attributeSet, int i, Map<String, Object> map, boolean b) {
        super(context, attributeSet, i, map, b);
        this._init();
    }

    private void _init() {
        this.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(com.tencent.smtt.sdk.WebView webView, String s) {
                webView.loadUrl(s);
                return true;
            }
        });
        WebSettings webSettings = getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

}
