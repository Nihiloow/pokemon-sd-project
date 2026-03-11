package com.example.pokemonsdlike.pokemons;

import com.example.pokemonsdlike.moves.Move;

import java.util.ArrayList;

public abstract class Pokemon implements IPokemon{
    private String name = "";
    private int hp = 1;
    private int attack = 0;
    private int specialAttack = 0;
    private int defense = 0;
    private int specialDefense = 0;
    private int speed = 0;
    private ArrayList<String> types = new ArrayList<String>();
    private ArrayList<Boolean> statuses = new ArrayList<>();

    public Pokemon(String name, int hp,
                   int attack, int specialAttack,
                   int defense, int specialDefense,
                   int speed, ArrayList<String> types){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.specialAttack = specialAttack;
        this.defense = defense;
        this.specialDefense = specialDefense;
        this.speed = speed;
        this.types = types;
    }

    @Override
    public ArrayList<Move> getMoves(){
        return new ArrayList<Move>();
    }

    @Override
    public void setMoves(){

    }

    @Override
    public void attack(Move move){

    }

    @Override
    public void takeDamages(Move move){

    }
}
