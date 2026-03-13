package com.example.pokemonsdlike.passive;

import com.example.pokemonsdlike.pokemons.Pokemon;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Passive implements IPassive {
    private String name;
    private String description;
    private HashMap<String, Boolean> isActive = new HashMap<String, Boolean>();

    public Passive(String name, String description, ArrayList<String> isActive){
        this.name = name;
        this.description = description;

        for (String trigger: this.isActive.keySet()){
            this.isActive[trigger] = true;
        }
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
