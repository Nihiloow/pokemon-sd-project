package com.example.pokemonsdlike.moves;

import com.example.pokemonsdlike.pokemons.Pokemon;
import com.example.pokemonsdlike.types.Type;

public abstract class Move implements Imove {
    private String name;
    private String description;
    private Type type;
    private int damages = 0;

    public Move(String name,String description, Type type, int damages) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.damages = damages;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Type getType() {
        return type;
    }

    @Override
    public void mainEffect(Pokemon pokemon){

    }

    @Override
    public void sideEffect(Pokemon pokemon){

    }
}
