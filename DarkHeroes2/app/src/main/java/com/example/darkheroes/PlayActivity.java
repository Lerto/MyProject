package com.example.darkheroes;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class PlayActivity extends AppCompatActivity {

    Button but1;
    Button but2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        but1 = (Button) findViewById(R.id.buttonDontOnly);
        but2 = (Button) findViewById(R.id.buttonOnly);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics metricsB = new DisplayMetrics();
        but1.setWidth(displayMetrics.widthPixels / 2);
        but2.setWidth(displayMetrics.widthPixels / 2);
    }


    public void onClick21(View v){
        Intent intent = new Intent(PlayActivity.this, GameActivity.class);
        startActivity(intent);
    }
    public void onClick(View v) {
        finish();
    }
}
