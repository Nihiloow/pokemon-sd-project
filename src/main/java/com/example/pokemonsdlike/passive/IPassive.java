package com.example.pokemonsdlike.passive;

import com.example.pokemonsdlike.pokemons.Pokemon;

public interface IPassive {
    public void mainEffect(Pokemon pokemon);
    public void sideEffect(Pokemon pokemon);
}
