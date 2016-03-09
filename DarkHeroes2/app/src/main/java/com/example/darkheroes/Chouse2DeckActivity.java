package com.example.darkheroes;

import android.content.pm.ActivityInfo;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Switch;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.SimpleTimeZone;

public class Chouse2DeckActivity extends AppCompatActivity {

    public String deckClass;
    public int tic = 1;
    public Deck Deck1;
    private Card carttt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chouse2_deck);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        final LinkedList<Card> linkedList2 = new LinkedList<Card>();
        final LinkedList<Card> linkedList = new LinkedList<Card>();
        linkedList.add(new Card("Карта1", 1, 1, 1));
        linkedList.add(new Card("Карта2", 1, 1, 2));
        linkedList.add(new Card("Карта3", 1, 2, 1));
        linkedList.add(new Card("Карта4", 1, 1, 3));
        linkedList.add(new Card("Карта5", 1, 3, 1));
        linkedList.add(new Card("Карта6", 1, 1, 4));
        linkedList.add(new Card("Карта7", 1, 4, 1));
        linkedList.add(new Card("Карта8", 1, 1, 5));
        linkedList.add(new Card("Карта9", 1, 5, 1));
        linkedList.add(new Card("Карта10", 1, 1, 6));
        linkedList.add(new Card("Карта11", 1, 6, 1));
        linkedList.add(new Card("Карта12", 1, 1, 7));
        linkedList.add(new Card("Карта13", 1, 7, 1));
        linkedList.add(new Card("Карта14", 1, 1, 8));
        linkedList.add(new Card("Карта15", 1, 8, 1));
        linkedList.add(new Card("Карта16", 1, 1, 9));
        linkedList.add(new Card("Карта17", 1, 9, 1));
        linkedList.add(new Card("Карта18", 1, 1, 10));
        linkedList.add(new Card("Карта19", 1, 10, 1));
        linkedList.add(new Card("Карта20", 1, 1, 11));
        Deck1 = (Deck) new Deck(deckClass);

        ArrayList<HashMap<String, Object>> deckList = new ArrayList<HashMap<String, Object>>();
        for (int i = 0; i < linkedList.size(); i++) {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("name", linkedList.get(i).name);
            map.put("hp", "Здоровье карты: " + linkedList.get(i).hp);
            map.put("mana", "Стоимость карты: " + linkedList.get(i).mana);
            map.put("attack", "Аттака карты: " + linkedList.get(i).attack);
            deckList.add(map);
        }
        String from[] = {"name","mana","hp","attack"};
        int to[] = {R.id.itemname, R.id.itemmana, R.id.itemhp, R.id.itemattack};
        SimpleAdapter adapter = new SimpleAdapter(this, deckList, R.layout.itemcard, from, to);
        ListView listView = (ListView) findViewById(R.id.chouseDeck);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            ArrayList<HashMap<String, Object>> deckList = new ArrayList<HashMap<String, Object>>();
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                linkedList2.add(linkedList.get(position));
                HashMap<String, Object> map = new HashMap<String, Object>();
                map.put("name", linkedList2.get(position).name);
                deckList.add(map);
                String from[] = {"name","mana","hp","attack"};
                int to[] = {R.id.itemname, R.id.itemmana, R.id.itemhp, R.id.itemattack};
                ListView listView = (ListView) findViewById(R.id.chouseDeck2);
                SimpleAdapter adapter = new SimpleAdapter(this, deckList, R.layout.itemcard, from, to); //TODO Aktivity (this)?
                listView.setAdapter(adapter);
            }
        });
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
}
