package com.example.darkheroes;

public class Deck {
    public Card[] arrayCard = new Card[20];
    public String name;
    public String clas;

    Deck(){
        this.clas = "Basic";
        this.name = "Noname";
    }
    Deck(String clas){
        this.clas = clas;
        this.name = clas;
    }
    Deck(String clas, String name){
        this.clas = clas;
        this.name = name;
    }

}
