package com.example.pokemonsdlike.moves;

import com.example.pokemonsdlike.pokemons.Pokemon;
import com.example.pokemonsdlike.types.Type;
import com.example.pokemonsdlike.types.TypeManager;

public class WaterGun extends Move {
    public WaterGun(TypeManager typeManager) {
        super("Water Gun", "Basic water attack", typeManager.getWaterType(), 20);
    }

    @Override
    public void mainEffect(Pokemon target) {
        System.out.println(getName() + " hits " + target.getName() + "!");
        target.takeDamages(this.getDamages(), "water", getType());
    }
}