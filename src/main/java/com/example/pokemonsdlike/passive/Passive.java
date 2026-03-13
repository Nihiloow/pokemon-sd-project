package com.example.pokemonsdlike.passive;

import com.example.pokemonsdlike.pokemons.Pokemon;

public abstract class Passive implements IPassive {
    private String name;
    private String description;

    public Passive(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void mainEffect(Pokemon pokemon) {

    }

    @Override
    public void sideEffect(Pokemon pokemon) {

    }
}
