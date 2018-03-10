package com.dhims.stickerview.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.dhims.stickerview.StickerImageView;
import com.dhims.stickerview.StickerTextView;

/**
 * @author Dhimant Desai (dhimant1990@gmail.com)
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        FrameLayout canvas = (FrameLayout) findViewById(R.id.canvasView);

        // add a stickerImage to canvas
        StickerImageView iv_sticker = new StickerImageView(MainActivity.this);
        iv_sticker.setImageDrawable(getResources().getDrawable(R.drawable.c10));
        // iv_sticker.setControlItemsHidden(true); // for hide controls
        canvas.addView(iv_sticker);

        // add a stickerText to canvas
        StickerTextView tv_sticker = new StickerTextView(MainActivity.this);
        tv_sticker.setText("Hi Dhims!");
        // tv_sticker.setControlItemsHidden(false);
        canvas.addView(tv_sticker);
    }
}
