package com.example.darkheroes;

public class Card {
    public String name;
    public int hp;
    public int mana;
    public int attack;
    public String effect;
    public String clas;
    public boolean inDeck;
    Card(){
        this.inDeck = false;
        this.hp = 1;
        this.mana = 0;
        this.attack = 0;
        this.name = "Card";
        this.effect = "";
        this.clas = "Basic";
    }
    Card(int hp, int mana, int attack, String name, String effect) {
        this.hp = hp;
        this.mana = mana;
        this.attack = attack;
        this.name = name;
        this.effect = effect;
        this.inDeck = true;
    }
    public void doDamage(int oponattack) {
        this.hp = this.hp - oponattack;}
    int getHp(){return hp;};
    int getAttack(){return attack;};
    String getName(){return name; };
    String getEffect(){return effect; };
}
