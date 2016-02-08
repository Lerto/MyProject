package com.example.darkheroes;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class DeckActivity extends AppCompatActivity {
    public String deckCLass = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deck);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void onClick(View v) {
        finish();
    }
    public void onClick2(View v) {
        Button rv2 = (Button) findViewById(R.id.ChouseDeck1);
        rv2.setVisibility(View.INVISIBLE);
        Button rv1 = (Button) findViewById(R.id.ChouseDeck2);
        rv1.setVisibility(View.INVISIBLE);
        Button rv3 = (Button) findViewById(R.id.ChouseDeck3);
        rv3.setVisibility(View.VISIBLE);
    }
    public void onClickVarvar(View v) {
        Intent intent = new Intent(DeckActivity.this, Chouse2DeckActivity.class);
        startActivity(intent);
        String deckClass = "Varrior";
    }
}
