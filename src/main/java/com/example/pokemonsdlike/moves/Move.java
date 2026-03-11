package com.example.pokemonsdlike.moves;

import com.example.pokemonsdlike.pokemons.Pokemon;

public abstract class Move implements Imove {
    private String name;
    private String type;
    private int damages = 0;

    public Move(String name,String type, int damages) {
        this.name = name;
        this.type = type;
        this.damages = damages;
    }

    @Override
    public void mainEffect(Pokemon pokemon){

    }

    @Override
    public void sideEffect(Pokemon pokemon){

    }
}
