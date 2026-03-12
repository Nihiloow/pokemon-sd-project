package com.example.pokemonsdlike.pokemons.stats;

public abstract class Stat {
    protected String name;
    protected int stat;

    protected Stat(String name, int stat){
        this.name = name;
        this.stat = stat;
    }

    protected int getStat(){
        return this.stat;
    }

    protected void setStat(int stat){
        this.stat = stat;
    }
}
