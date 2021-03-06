package net.lemonsoft.lemonmix_samples;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import net.lemonsoft.lemonmix.LMWebView;

public class MainActivity extends Activity {

    private LMWebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout root = new RelativeLayout(this);
        this.setContentView(root);
        webView = new LMWebView(this);
        root.addView(webView, new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        webView.setBackgroundColor(Color.RED);
        webView.loadUrl("http://www.baidu.com");
    }
}
