package com.example.pokemonsdlike.pokemons;

import com.example.pokemonsdlike.moves.Move;

import java.util.ArrayList;

public interface IPokemon {
    public ArrayList<Move> getMoves();
    public void setMoves();
    public void attack(Move move);
    public void takeDamages(Move move);
}
