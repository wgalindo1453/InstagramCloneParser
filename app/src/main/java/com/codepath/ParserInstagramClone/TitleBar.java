package com.codepath.ParserInstagramClone;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class TitleBar extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final boolean customTitleSupported =
                requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_main);
        if (customTitleSupported) {
            getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,
                    R.menu.menu_top_navigation);
        }

    }
}