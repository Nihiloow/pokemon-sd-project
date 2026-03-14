package com.example.pokemonsdlike.pokemons;

import com.example.pokemonsdlike.moves.Move;
import com.example.pokemonsdlike.types.Type;

import java.util.ArrayList;

public interface IPokemon {
    public ArrayList<Move> getMoves();
    public void attack(Move move);
    public void takeDamages(int amount, String damageType, Type type);
}
