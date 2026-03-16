package com.example.pokemonsdlike;

import com.example.pokemonsdlike.moves.FireAttack;
import com.example.pokemonsdlike.moves.WaterGun;
import com.example.pokemonsdlike.passive.Passive;
import com.example.pokemonsdlike.passive.Regeneration;
import com.example.pokemonsdlike.pokemons.Pokemon;
import com.example.pokemonsdlike.types.Type;
import com.example.pokemonsdlike.types.TypeManager;

import java.util.ArrayList;
import java.util.List;

public class Launcher {
    public static void main(String[] args) {

        TypeManager typeManager = new TypeManager();

        // Create Charmander with predefined moves and passives
        ArrayList<Type> charmanderTypes = new ArrayList<>();
        charmanderTypes.add(typeManager.getWaterType());

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

        charmander.switchMove(new FireAttack(typeManager), 0);

        ArrayList<Passive> charmanderStatuses = new ArrayList<>();
        charmanderStatuses.add(new Regeneration());
        charmander.setStatuses(charmanderStatuses);

        // Create Bulbasaur with predefined moves and passives
        ArrayList<Type> bulbasaurTypes = new ArrayList<>();
        bulbasaurTypes.add(typeManager.getWaterType());
        bulbasaurTypes.add(null); // Placeholder for an additional type if needed

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

        bulbasaur.switchMove(new WaterGun(typeManager), 1);

        ArrayList<Passive> bulbasaurStatuses = new ArrayList<>();
        bulbasaurStatuses.add(new Regeneration());
        bulbasaur.setStatuses(bulbasaurStatuses);

        // Create Player 1's team
        Team player1Team = new Team();
        player1Team.addPokemon(charmander);
        player1Team.addPokemon(bulbasaur);

        // Create Player 2's team
        Team player2Team = new Team();
        player2Team.addPokemon(new Pokemon(
                "Pikachu",
                new ArrayList<>(List.of(new Type("ELECTRIC"))),
                null, // movePool
                100,
                55,
                50,
                70,
                90,
                40
        ));
        player2Team.addPokemon(new Pokemon(
                "Squirtle",
                new ArrayList<>(List.of(new Type("WATER"))),
                null, // movePool
                100,
                35,
                65,
                40,
                70,
                55
        ));

        // Create Combat System and start it
        CombatSystem combatSystem = new CombatSystem(player1Team, player2Team);
        combatSystem.start();
    }
}