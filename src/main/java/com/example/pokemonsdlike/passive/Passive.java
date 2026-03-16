package com.example.pokemonsdlike.passive;

import com.example.pokemonsdlike.pokemons.Pokemon;

import java.util.HashMap;
import java.util.Map;

public class Passive implements IPassive {
    private String name;
    private String description;
    private Map<String, Boolean> isActive = new HashMap<>();

    public Passive(String name, String description) {
        this.name = name;
        this.description = description;
        //this.isActive.putAll(isActive);
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