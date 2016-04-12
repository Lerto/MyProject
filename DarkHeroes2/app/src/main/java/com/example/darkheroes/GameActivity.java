package com.example.darkheroes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

public class GameActivity extends AppCompatActivity {


    Button[] butDeck = new Button[10];
    Button butMap[] = new Button[7];
    int i = 0;
    int iCard = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }
    public void onClick(View v){
       int s = Integer.parseInt(v.getTag().toString());
        s--;
        Button plauBut = butMap[i];
        Button deccBut = butDeck[s];
        plauBut.setVisibility(View.VISIBLE);
        plauBut.setText(deccBut.getText());

        for(int j = s; j < iCard; j++){
            butDeck[j] = butDeck[j+1];
        }
        Random rn = new Random();
        int i = rn.nextInt();
        i /= 10;
        plauBut = butDeck[iCard];
        plauBut.setVisibility(View.INVISIBLE);
        plauBut.setText("Карта " + Integer.toString(i));
        iCard--;
        i++;

    }
    public void endTurn(View v) {
    iCard++;
        butDeck[iCard].setVisibility(View.VISIBLE);
    }
}
