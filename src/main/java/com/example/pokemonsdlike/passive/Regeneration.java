package com.example.pokemonsdlike.passive;

import com.example.pokemonsdlike.pokemons.Pokemon;
import com.example.pokemonsdlike.pokemons.Stat;

public class Regeneration extends Passive {
    private Stat hp;

    public Regeneration() {
        super("Regeneration", "Heals slightly over time");
        this.hp = new Stat(10); // Assuming heal amount of 10 per turn
    }

    @Override
    public void mainEffect(Pokemon pokemon) {
        System.out.println(pokemon.getName() + " regenerates HP!");
        hp.setStat(hp.getRealStat() + hp.getStat());
        pokemon.getHp().setStat(pokemon.getHp().getRealStat() + hp.getStat());
    }
}