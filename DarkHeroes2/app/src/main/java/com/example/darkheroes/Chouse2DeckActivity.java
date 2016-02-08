package com.example.darkheroes;

import android.content.pm.ActivityInfo;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import org.w3c.dom.Text;

public class Chouse2DeckActivity extends AppCompatActivity {

    public String deckClass;
    public int tic = 1;
    private Button TextButton1;
    private Button TextButton11;
    private Button TextButton2;
    private Button TextButton12;
    private Button TextButton3;
    private Button TextButton13;
    private Button TextButton4;
    private Button TextButton14;
    private Button TextButton5;
    private Button TextButton15;
    private Button TextButton6;
    private Button TextButton16;
    private Button TextButton7;
    private Button TextButton17;
    private Button TextButton8;
    private Button TextButton18;
    private Button TextButton9;
    private Button TextButton19;
    private Button TextButton10;
    private Button TextButton20;
    private Button Buttion1;
    public Deck Deck1;
    private Card carttt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chouse2_deck);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        TextButton1 = (Button) findViewById(R.id.but1);
        TextButton11 = (Button) findViewById(R.id.but11);
        TextButton2 = (Button) findViewById(R.id.but2);
        TextButton12 = (Button) findViewById(R.id.but12);
        TextButton3 = (Button) findViewById(R.id.but3);
        TextButton13 = (Button) findViewById(R.id.but13);
        TextButton4 = (Button) findViewById(R.id.but4);
        TextButton14 = (Button) findViewById(R.id.but14);
        TextButton5 = (Button) findViewById(R.id.but5);
        TextButton15 = (Button) findViewById(R.id.but15);
        TextButton6 = (Button) findViewById(R.id.but6);
        TextButton16 = (Button) findViewById(R.id.but16);
        TextButton7 = (Button) findViewById(R.id.but7);
        TextButton17 = (Button) findViewById(R.id.but17);
        TextButton8 = (Button) findViewById(R.id.but8);
        TextButton18 = (Button) findViewById(R.id.but18);
        TextButton9 = (Button) findViewById(R.id.but9);
        TextButton19 = (Button) findViewById(R.id.but19);
        TextButton10 = (Button) findViewById(R.id.but10);
        TextButton20 = (Button) findViewById(R.id.but20);
        Buttion1 = (Button) findViewById(R.id.button2);
        Deck1 = (Deck) new Deck(deckClass);
    }

    public void Delete(View v){
        for(int i = 1; i <= 20; i++){
            Deck1.arrayCard[i] = new Card();
        }

    }
    public void onClick(View v) {
        finish();
    }

    public void incTic(View v) {
        tic++;
    }

    public void decTic(View v) {
        tic--;
    }

    public void doVisible1(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card1", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards1);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards1);
                TextButton2.setVisibility(View.VISIBLE);

                break;
            case 3:
                TextButton3.setText(R.string.cards1);
                TextButton3.setVisibility(View.VISIBLE);

                break;
            case 4:
                TextButton4.setText(R.string.cards1);
                TextButton4.setVisibility(View.VISIBLE);

                break;
            case 5:
                TextButton5.setText(R.string.cards1);
                TextButton5.setVisibility(View.VISIBLE);

                break;
            case 6:
                TextButton6.setText(R.string.cards1);
                TextButton6.setVisibility(View.VISIBLE);

                break;
            case 7:
                TextButton7.setText(R.string.cards1);
                TextButton7.setVisibility(View.VISIBLE);

                break;
            case 8:
                TextButton8.setText(R.string.cards1);
                TextButton8.setVisibility(View.VISIBLE);

                break;
            case 9:
                TextButton9.setText(R.string.cards1);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards1);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards1);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards1);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards1);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards1);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards1);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards1);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards1);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards1);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards1);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards1);
                TextButton19.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible2(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card2", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards2);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards2);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards2);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards2);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards2);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards2);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards2);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards2);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards2);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards2);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards2);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards2);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards2);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards2);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards2);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards2);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards2);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards2);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards2);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards2);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible3(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card3", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards3);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards3);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards3);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards3);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards3);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards3);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards3);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards3);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards3);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards3);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards3);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards3);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards3);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards3);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards3);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards3);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards3);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards3);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards3);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards3);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible4(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card4", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards4);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards4);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards4);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards4);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards4);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards4);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards4);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards4);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards4);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards4);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards4);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards4);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards4);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards4);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards4);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards4);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards4);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards4);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards4);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards4);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible5(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card5", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards5);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards5);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards5);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards5);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards5);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards5);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards5);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards5);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards5);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards5);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards5);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards5);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards5);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards5);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards5);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards5);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards5);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards5);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards5);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards5);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible6(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card6", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards6);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards6);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards6);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards6);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards6);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards6);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards6);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards6);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards6);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards6);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards6);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards6);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards6);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards6);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards6);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards6);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards6);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards6);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards6);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards6);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible7(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card7", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards7);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards7);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards7);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards7);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards7);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards7);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards7);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards7);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards7);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards7);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards7);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards7);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards7);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards7);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards7);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards7);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards7);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards7);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards7);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards7);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible8(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card8", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards8);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards8);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards8);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards8);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards8);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards8);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards8);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards8);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards8);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards8);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards8);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards8);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards8);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards8);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards8);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards8);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards8);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards8);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards8);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards8);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible9(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card9", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards9);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards9);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards9);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards9);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards9);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards9);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards9);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards9);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards9);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards9);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards9);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards9);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards9);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards9);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards9);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards9);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards9);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards9);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards9);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards9);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible10(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card10", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards10);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards10);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards10);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards10);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards10);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards10);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards10);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards10);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards10);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards10);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards10);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards10);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards10);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards10);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards10);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards10);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards10);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards10);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards10);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards10);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible11(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card11", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards11);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards11);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards11);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards11);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards11);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards11);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards11);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards11);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards11);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards11);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards11);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards11);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards11);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards11);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards11);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards11);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards11);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards11);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards11);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards11);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible12(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card12", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards12);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards12);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards12);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards12);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards12);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards12);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards12);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards12);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards12);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards12);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards12);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards12);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards12);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards12);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards12);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards12);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards12);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards12);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards12);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards12);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible13(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card13", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards13);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards13);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards13);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards13);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards13);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards13);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards13);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards13);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards13);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards13);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards13);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards13);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards13);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards13);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards13);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards13);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards13);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards13);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards13);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards13);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible14(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card14", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards14);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards14);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards14);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards14);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards14);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards14);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards14);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards14);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards14);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards14);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards14);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards14);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards14);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards14);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards14);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards14);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards14);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards14);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards14);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards14);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible15(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card15", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards15);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards15);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards15);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards15);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards15);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards15);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards15);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards15);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards15);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards15);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards15);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards15);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards15);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards15);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards15);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards15);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards15);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards15);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards15);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards15);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible16(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card16", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards16);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards16);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards16);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards16);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards16);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards16);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards16);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards16);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards16);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards16);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards16);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards16);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards16);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards16);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards16);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards16);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards16);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards16);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards16);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards16);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible17(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card17", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards17);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards17);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards17);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards17);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards17);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards17);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards17);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards17);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards17);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards17);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards17);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards17);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards17);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards17);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards17);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards17);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards17);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards17);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards17);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards17);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible18(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card18", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards18);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards18);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards18);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards18);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards18);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards18);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards18);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards18);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards18);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards18);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards18);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards18);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards18);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards18);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards18);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards18);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards18);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards18);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards18);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards18);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible19(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card19", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards19);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards19);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards19);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards19);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards19);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards19);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards19);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards19);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards19);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards19);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards19);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards19);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards19);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards19);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards19);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards19);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards19);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards19);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards19);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards19);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doVisible20(View v) {
        Deck1.arrayCard[tic] = new Card(0, 0, 0, "Card20", "");
        switch (tic) {
            case 1:
                TextButton1.setText(R.string.cards20);
                TextButton1.setVisibility(View.VISIBLE);
                break;
            case 2:
                TextButton2.setText(R.string.cards20);
                TextButton2.setVisibility(View.VISIBLE);
                break;
            case 3:
                TextButton3.setText(R.string.cards20);
                TextButton3.setVisibility(View.VISIBLE);
                break;
            case 4:
                TextButton4.setText(R.string.cards20);
                TextButton4.setVisibility(View.VISIBLE);
                break;
            case 5:
                TextButton5.setText(R.string.cards20);
                TextButton5.setVisibility(View.VISIBLE);
                break;
            case 6:
                TextButton6.setText(R.string.cards20);
                TextButton6.setVisibility(View.VISIBLE);
                break;
            case 7:
                TextButton7.setText(R.string.cards20);
                TextButton7.setVisibility(View.VISIBLE);
                break;
            case 8:
                TextButton8.setText(R.string.cards20);
                TextButton8.setVisibility(View.VISIBLE);
                break;
            case 9:
                TextButton9.setText(R.string.cards20);
                TextButton9.setVisibility(View.VISIBLE);
                break;
            case 10:
                TextButton10.setText(R.string.cards20);
                TextButton10.setVisibility(View.VISIBLE);
                break;
            case 11:
                TextButton11.setText(R.string.cards20);
                TextButton11.setVisibility(View.VISIBLE);
                break;
            case 12:
                TextButton12.setText(R.string.cards20);
                TextButton12.setVisibility(View.VISIBLE);
                break;
            case 13:
                TextButton13.setText(R.string.cards20);
                TextButton13.setVisibility(View.VISIBLE);
                break;
            case 14:
                TextButton14.setText(R.string.cards20);
                TextButton14.setVisibility(View.VISIBLE);
                break;
            case 15:
                TextButton15.setText(R.string.cards20);
                TextButton15.setVisibility(View.VISIBLE);
                break;
            case 16:
                TextButton16.setText(R.string.cards20);
                TextButton16.setVisibility(View.VISIBLE);
                break;
            case 17:
                TextButton17.setText(R.string.cards20);
                TextButton17.setVisibility(View.VISIBLE);
                break;
            case 18:
                TextButton18.setText(R.string.cards20);
                TextButton18.setVisibility(View.VISIBLE);
                break;
            case 19:
                TextButton19.setText(R.string.cards20);
                TextButton19.setVisibility(View.VISIBLE);
                break;
            case 20:
                TextButton20.setText(R.string.cards20);
                TextButton20.setVisibility(View.VISIBLE);
                break;
        }
        incTic(v);
    }

    public void doInvisible1(View v) {
        decTic(v);
        switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
       // for(int i = 1; i < tic; i++) {
         //   Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
           // switch (i) {
             //   case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
               //     break;
    //            case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
      //              break;
          //      case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
        //            break;
            //    case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                //    break;
              //  case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
         //           break;
           //     case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
         //           break;
        //        case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
       //             break;
       //         case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
      //             break;
    //            case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                //    break;
              //  case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
            //        break;
          //      case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
        //            break;
      //          case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
    //                break;
  //              case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
  //                 break;
 //              case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
               //     break;
             //   case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
           //         break;
         //       case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
       //             break;
     //           case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
   //                 break;
 //               case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                 //   break;
               // case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
             //       break;
           // }
    }
    public void doInvisible2(View v) {
        decTic(v);
        switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i =2; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
            switch (i) {
                case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }

    }
    public void doInvisible3(View v) {
        decTic(v);
        switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i = 3; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
            switch (i) {
                case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }
    }
    public void doInvisible4(View v) {
        decTic(v);
        switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i = 4; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
            switch (i) {
                case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }
    }
    public void doInvisible5(View v) {
        decTic(v);
        switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i = 5; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
            switch (i) {
                case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }
    }
    public void doInvisible6(View v) {
        decTic(v);
        switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i = 6; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i + 1];
            switch (i) {
                case 1:
                    TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2:
                    TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3:
                    TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4:
                    TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5:
                    TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6:
                    TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7:
                    TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8:
                    TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9:
                    TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10:
                    TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11:
                    TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12:
                    TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13:
                    TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14:
                    TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15:
                    TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16:
                    TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17:
                    TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18:
                    TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19:
                    TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }
    }
    public void doInvisible7(View v) {
        decTic(v);    switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i = 7; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
            switch (i) {
                case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }
    }
    public void doInvisible8(View v) {
        decTic(v);  switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i = 8; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
            switch (i) {
                case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }
    }
    public void doInvisible9(View v) {
        decTic(v);   switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i = 9; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
            switch (i) {
                case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }
    }
    public void doInvisible10(View v) {
        decTic(v);   switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i = 10; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
            switch (i) {
                case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }
    }
    public void doInvisible11(View v) {
        decTic(v);   switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i = 11; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
            switch (i) {
                case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }
    }
    public void doInvisible12(View v) {
        decTic(v);   switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i = 12; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
            switch (i) {
                case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }
    }
    public void doInvisible13(View v) {
        decTic(v);   switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i = 13; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
            switch (i) {
                case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }
    }
    public void doInvisible14(View v) {
        decTic(v);   switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i = 14; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
            switch (i) {
                case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }
    }
    public void doInvisible15(View v) {
        decTic(v);    switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i = 15; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
            switch (i) {
                case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }
    }
    public void doInvisible16(View v) {
        decTic(v);    switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i = 16; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
            switch (i) {
                case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }
    }
    public void doInvisible17(View v) {
        decTic(v);    switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i = 17; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
            switch (i) {
                case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }
    }
    public void doInvisible18(View v) {
        decTic(v);   switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i = 18; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
            switch (i) {
                case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }
    }
    public void doInvisible19(View v) {
        decTic(v);   switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i = 19; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
            switch (i) {
                case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }
    }
    public void doInvisible20(View v) {
        decTic(v);   switch (tic) {
            case 1:
                TextButton1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                TextButton2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                TextButton3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                TextButton4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                TextButton5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                TextButton6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                TextButton7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                TextButton8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                TextButton9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                TextButton10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                TextButton11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                TextButton12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                TextButton13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                TextButton14.setVisibility(View.INVISIBLE);
                break;
            case 15:
                TextButton15.setVisibility(View.INVISIBLE);
                break;
            case 16:
                TextButton16.setVisibility(View.INVISIBLE);
                break;
            case 17:
                TextButton17.setVisibility(View.INVISIBLE);
                break;
            case 18:
                TextButton18.setVisibility(View.INVISIBLE);
                break;
            case 19:
                TextButton19.setVisibility(View.INVISIBLE);
                break;
            case 20:
                TextButton20.setVisibility(View.INVISIBLE);
                break;
        }
        for(int i = 20; i < tic; i++) {
            Deck1.arrayCard[i] = Deck1.arrayCard[i+1];
            switch (i) {
                case 1: TextButton1.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 2: TextButton2.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 3: TextButton3.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 4: TextButton4.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 5: TextButton5.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 6: TextButton6.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 7: TextButton7.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 8: TextButton8.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 9: TextButton9.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 10: TextButton10.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 11: TextButton11.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 12: TextButton12.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 13: TextButton13.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 14: TextButton14.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 15: TextButton15.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 16: TextButton16.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 17: TextButton17.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 18: TextButton18.setText(Deck1.arrayCard[i + 1].getName());
                    break;
                case 19: TextButton19.setText(Deck1.arrayCard[i + 1].getName());
                    break;
            }
        }
    }
}
