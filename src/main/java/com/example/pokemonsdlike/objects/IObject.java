package com.example.pokemonsdlike.objects;

import com.example.pokemonsdlike.pokemons.Pokemon;

public interface IObject {
    public void mainEffect(Pokemon pokemon);
    public void sideEffect(Pokemon pokemon);
}
