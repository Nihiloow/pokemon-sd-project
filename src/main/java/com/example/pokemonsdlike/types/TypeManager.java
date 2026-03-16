package com.example.pokemonsdlike.types;

import com.example.pokemonsdlike.types.Type;

public class TypeManager {
    private Type fire = new Type("Fire");
    private Type water = new Type("Water");
    private Type dark = new Type("Grass");
    private Type grass = new Type("Electric");
    private Type electric = new Type("Ice");
    private Type ice = new Type("Fighting");
    private Type fighting = new Type("Poison");
    private Type poison = new Type("Ground");
    private Type ground = new Type("Flying");
    private Type flying = new Type("Psychic");
    private Type psychic = new Type("Bug");
    private Type bug = new Type("Rock");
    private Type rock = new Type("Ghost");
    private Type ghost = new Type("Dragon");
    private Type dragon = new Type("Dark");
    private Type steel = new Type("Steel");
    private Type fairy = new Type("Fairy");

    public TypeManager() {
        initializeTypes();
    }

    private void initializeTypes() {
        // Set type relationships
        fire.setTypeRelationship(
                new String[]{"water", "Grass", "Ice", "Bug", "Rock"},
                new String[]{"fire"},
                null);

        water.setTypeRelationship(
                new String[]{"grass", "Electric", "Dragon"},
                new String[]{"fire", "Water", "Ice", "Steel", "Fairy"},
                null);

        grass.setTypeRelationship(
                new String[]{"water", "Fire", "Grass", "Ice", "Bug", "Flying", "Poison"},
                new String[]{"grass", "Ground", "Rock"},
                null);

        electric.setTypeRelationship(new String[]{"flying", "Steel"},
                new String[]{"electric"},
                new String[]{"Water"});

        ice.setTypeRelationship(
                new String[]{"fire", "Water", "Grass", "Ice", "Flying", "Dragon"},
                new String[]{"ice"},
                null);

        fighting.setTypeRelationship(
                new String[]{"psychic", "Flying", "Fairy"},
                new String[]{"fighting", "bug", "rock", "dark"},
                null);

        poison.setTypeRelationship(
                new String[]{"poison", "ground", "rock", "ghost"},
                new String[]{"grass", "steel"},
                null);

        ground.setTypeRelationship(
                new String[]{"water", "ice", "grass", "flying", "bug"},
                new String[]{"electric", "fire", "poisons", "psychic", "rock", "steel"},
                null);

        flying.setTypeRelationship(
                new String[]{"electric", "ice", "rock"},
                new String[]{"grass", "fighting", "bug"},
                null);

        psychic.setTypeRelationship(
                new String[]{"psychic", "dark"},
                new String[]{"fighting", "poison"},
                null);

        bug.setTypeRelationship(
                new String[]{"flying", "rock", "fire"},
                new String[]{"grass", "fighting", "fairy"},
                null);

        rock.setTypeRelationship(
                new String[]{"water", "ice", "flying", "bug"},
                new String[]{"fighting", "fire", "normal", "steel"},
                null);

        ghost.setTypeRelationship(
                new String[]{"psychic", "dark"},
                new String[]{"ghost", "poison"},
                null);

        dragon.setTypeRelationship(
                new String[]{"water", "ice", "dragon", "fairy"},
                new String[]{"fire", "electric", "grass", "steel"},
                null);

        dark.setTypeRelationship(
                new String[]{"fighting", "bug", "ghost"},
                new String[]{"psychic", "steel"},
                null);

        steel.setTypeRelationship(
                new String[]{"flying", "fire", "ice", "rock", "fairy"},
                new String[]{"electric", "water", "fire", "normal", "psychic", "ice", "steel", "bug", "dragon", "dark"},
                null);

        fairy.setTypeRelationship(
                new String[]{"poison", "dark"},
                new String[]{"fighting", "bug", "steel"},
                null);
    }

    public Type getFireType() {
        return fire;
    }

    public Type getWaterType() {
        return water;
    }

    public Type getGrassType() {
        return grass;
    }

    public Type getElectricType() {
        return electric;
    }

    public Type getIceType() {
        return ice;
    }

    public Type getFightingType() {
        return fighting;
    }

    public Type getPoisonType() {
        return poison;
    }

    public Type getGroundType() {
        return ground;
    }

    public Type getFlyingType() {
        return flying;
    }

    public Type getPsychicType() {
        return psychic;
    }

    public Type getBugType() {
        return bug;
    }

    public Type getRockType() {
        return rock;
    }

    public Type getGhostType() {
        return ghost;
    }

    public Type getDragonType() {
        return dragon;
    }

    public Type getDarkType() {
        return dark;
    }

    public Type getSteelType() {
        return steel;
    }

    public Type getFairyType() {
        return fairy;
    }
}