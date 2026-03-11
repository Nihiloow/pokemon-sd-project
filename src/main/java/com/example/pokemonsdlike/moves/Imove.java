package com.example.pokemonsdlike.moves;

import com.example.pokemonsdlike.pokemons.Pokemon;

public interface Imove {
    public void mainEffect(Pokemon pokemon);
    public void sideEffect(Pokemon pokemon);
}
