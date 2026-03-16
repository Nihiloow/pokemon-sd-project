package com.example.pokemonsdlike;

import com.example.pokemonsdlike.pokemons.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Pokemon> members;

    public Team() {
        this.members = new ArrayList<>();
    }

    // Method to add a Pokemon to the team
    public void addPokemon(Pokemon pokemon) {
        if (members.size() < 6) { // Assuming a maximum of 6 Pokémon per team
            members.add(pokemon);
            System.out.println(pokemon.getName() + " added to team.");
        } else {
            System.out.println("Team is full. Cannot add more Pokémon.");
        }
    }

    // Method to remove a Pokemon from the team
    public void removePokemon(Pokemon pokemon) {
        if (members.remove(pokemon)) {
            System.out.println(pokemon.getName() + " removed from team.");
        } else {
            System.out.println("Pokemon not found in team.");
        }
    }

    // Method to get all Pokémon in the team
    public List<Pokemon> getPokemons() {
        return new ArrayList<>(members);
    }

    // Method to display the names of Pokémon in the team
    public void displayTeam() {
        System.out.println("Team members:");
        for (Pokemon pokemon : members) {
            System.out.println(pokemon.getName());
        }
    }
}
