package com.example.pokemonsdlike;

import com.example.pokemonsdlike.moves.Move;
import com.example.pokemonsdlike.passive.Passive;
import com.example.pokemonsdlike.pokemons.Pokemon;
import com.example.pokemonsdlike.types.Type;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        // Create Type instances
        Type fire = new Type("FIRE");
        Type grass = new Type("GRASS");
        Type poison = new Type("POISON");

        // Set type relationships
        fire.setIsWeakTo(grass, poison);
        fire.setIsResistTo(fire);

        //grass.setIsWeakTo(fire, water, ice, bug, rock);
        //grass.setIsResistTo(grass, ground, rock, water);

        //poison.setIsWeakTo(ground);
        //poison.setIsResistTo(poison, psychic, steel);

        // Create Pokemon instances with all required parameters
        ArrayList<Type> charmanderTypes = new ArrayList<>();
        charmanderTypes.add(fire);
        Pokemon charmander = new Pokemon(
                "Charmander",
                charmanderTypes,
                null, // movePool
                100,
                25,
                35,
                40,
                50,
                65
        );

        ArrayList<Type> bulbasaurTypes = new ArrayList<>();
        bulbasaurTypes.add(grass);
        bulbasaurTypes.add(poison);
        Pokemon bulbasaur = new Pokemon(
                "Bulbasaur",
                bulbasaurTypes,
                null, // movePool
                100,
                45,
                62,
                63,
                80,
                70
        );

        CombatSystem combatSystem = new CombatSystem(charmander, bulbasaur);
        combatSystem.start();
    }
}