package com.example.pokemonsdlike;

import com.example.pokemonsdlike.moves.Move;
import com.example.pokemonsdlike.pokemons.Pokemon;

public class CombatSystem {
    private Team player1;
    private Team player2;

    public CombatSystem(Team player1, Team player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        while (player1.getPokemons().stream().anyMatch(p -> p.getHp().getRealStat() > 0) &&
                player2.getPokemons().stream().anyMatch(p -> p.getHp().getRealStat() > 0)) {
            // Player 1's turn
            performTurn(player1, player2);

            // Check if player 1 is defeated
            if (!player1.getPokemons().stream().anyMatch(p -> p.getHp().getRealStat() > 0)) {
                System.out.println("wawa" + " wins!");
                break;
            }

            // Player 2's turn
            performTurn(player2, player1);

            // Check if player 2 is defeated
            if (!player2.getPokemons().stream().anyMatch(p -> p.getHp().getRealStat() > 0)) {
                System.out.println("wewa" + " wins!");
                break;
            }
        }
    }

    private void performTurn(Team activeTeam, Team opponentTeam) {
        System.out.println("wawa" + "'s turn:");
        for (int i = 0; i < activeTeam.getPokemons().size(); i++) {
            Pokemon activePokemon = activeTeam.getPokemons().get(i);
            if (activePokemon.getHp().getRealStat() <= 0) {
                continue;
            }

            System.out.println("Choose a move for " + activePokemon.getName() + ":");
            int index = 0;
            for (Move move : activePokemon.getMoves()) {
                System.out.println(index + ". " + move.getName());
                index++;
            }

            int choice = 1;
            if (choice >= 0 && choice < activePokemon.getMoves().size()) {
                Move selectedMove = activePokemon.getMoves().get(choice);
                activePokemon.attack(selectedMove);

                // Check if opponent's Pokémon is defeated
                if (opponentTeam.getPokemons().stream().anyMatch(p -> p.getHp().getRealStat() <= 0)) {
                    break;
                }
            } else {
                System.out.println("Invalid move. Skipping turn.");
            }

            // Display updated status after each player's turn
            displayStatus(activeTeam, opponentTeam);
        }
    }

    private void displayStatus(Team team1, Team team2) {
        System.out.println("wawa" + " members:");
        for (Pokemon pokemon : team1.getPokemons()) {
            if (pokemon.getHp().getRealStat() > 0) {
                System.out.println(pokemon.getName() + " HP: " + pokemon.getHp().getRealStat());
            }
        }

        System.out.println("wewa" + " members:");
        for (Pokemon pokemon : team2.getPokemons()) {
            if (pokemon.getHp().getRealStat() > 0) {
                System.out.println(pokemon.getName() + " HP: " + pokemon.getHp().getRealStat());
            }
        }
    }
}