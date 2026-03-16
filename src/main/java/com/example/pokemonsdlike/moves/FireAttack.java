package com.example.pokemonsdlike.moves;

import com.example.pokemonsdlike.pokemons.Pokemon;
import com.example.pokemonsdlike.types.TypeManager;

public class FireAttack extends Move {
    public FireAttack(TypeManager typeManager) {
        super("Fire Attack", "Basic fire attack", typeManager.getFireType(), 30);
    }

    @Override
    public void mainEffect(Pokemon target) {
        System.out.println(getName() + " hits " + target.getName() + "!");
        target.takeDamages(getDamages(), "fire", getType());
    }
}