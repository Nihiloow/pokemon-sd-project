package com.example.pokemonsdlike.objects;

import com.example.pokemonsdlike.pokemons.Pokemon;

import java.util.ArrayList;

public class Object implements IObject{
    private String name;
    private ArrayList<Boolean> triggers;

    @Override
    public void mainEffect(Pokemon pokemon) {

    }

    @Override
    public void sideEffect(Pokemon pokemon) {

    }
}
