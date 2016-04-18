package com.example.darkheroes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class GameActivity extends AppCompatActivity {


    Button[] butDeck = new Button[10];
    Button butMap[] = new Button[7];
    Button butET;
    int iDeck = 25;
    TextView tv;
    int i = 0;
    int iCard = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        butDeck[0] = (Button) findViewById(R.id.deckCard1);
        butDeck[1] = (Button) findViewById(R.id.deckCard2);
        butDeck[2] = (Button) findViewById(R.id.deckCard3);
        butDeck[3] = (Button) findViewById(R.id.deckCard4);
        butDeck[4] = (Button) findViewById(R.id.deckCard5);
        butDeck[5] = (Button) findViewById(R.id.deckCard6);
        butDeck[6] = (Button) findViewById(R.id.deckCard7);
        butDeck[7] = (Button) findViewById(R.id.deckCard8);
        butDeck[8] = (Button) findViewById(R.id.deckCard9);
        butDeck[9] = (Button) findViewById(R.id.deckCard10);
        butMap[0] = (Button) findViewById(R.id.mapCard1);
        butMap[1] = (Button) findViewById(R.id.mapCard2);
        butMap[2] = (Button) findViewById(R.id.mapCard3);
        butMap[3] = (Button) findViewById(R.id.mapCard4);
        butMap[4] = (Button) findViewById(R.id.mapCard5);
        butMap[5] = (Button) findViewById(R.id.mapCard6);
        butMap[6] = (Button) findViewById(R.id.mapCard7);
        tv = (TextView) findViewById(R.id.textViewDeck);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics metricsB = new DisplayMetrics();
        for(int i = 0; i < 7; i++){
            butMap[i].setHeight(displayMetrics.heightPixels/10);
            butMap[i].setWidth(displayMetrics.widthPixels/10);
        }
        for(int i = 0; i < 10; i++){
            butDeck[i].setHeight(displayMetrics.heightPixels/8);
            butDeck[i].setWidth(displayMetrics.widthPixels/12);
        }
        butET = (Button) findViewById(R.id.butEndTurn);
        butET.setHeight(displayMetrics.heightPixels / 10);
        butET.setWidth(displayMetrics.widthPixels / 10);
    }
    public void onClick(View v){
        int s = Integer.parseInt(v.getTag().toString());
        s--;
        if(i != 7){
            Button plauBut = butMap[i];
            Button deccBut = butDeck[s];
            plauBut.setVisibility(View.VISIBLE);
            plauBut.setText(deccBut.getText());
            Random rn = new Random();
            int i1 = rn.nextInt() % 20 + 1;
            plauBut = butDeck[iCard];
            plauBut.setVisibility(View.INVISIBLE);
            plauBut.setText("Карта" + Integer.toString(Math.abs(i1)));
        }
    }
    public void endTurn(View v) {
        if (iCard != 9 && iDeck != 0) {
            iCard++;
            butDeck[iCard].setVisibility(View.VISIBLE);
        }
        if(iDeck != 0){
            iDeck--;
            tv.setText("В вашей колоде: " + iCard + " карт");
        }
    }
}
