package com.example.darkheroes;

public class Card {
    public String name;
    public int hp;
    public int mana;
    public int attack;
    public String clas;
    Card(){
        this.hp = 1;
        this.mana = 0;
        this.attack = 0;
        this.name = "Card";
        this.clas = "Basic";
    }
    Card(String name, int mana, int hp, int attack) {
        this.hp = hp;
        this.mana = mana;
        this.attack = attack;
        this.name = name;
    }
    public void doDamage(int oponattack) {
        this.hp = this.hp - oponattack;}
    int getHp(){return hp;};
    int getAttack(){return attack;};
    String getName(){return name; };
}
