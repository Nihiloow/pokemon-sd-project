package com.example.pokemonsdlike.pokemons;

import com.example.pokemonsdlike.moves.Move;
import com.example.pokemonsdlike.types.Type;

import java.util.ArrayList;
import java.util.HashMap;

public class Pokemon implements IPokemon{
    private String name = "";
    private ArrayList<Type> types = new ArrayList<Type>();
    private ArrayList<Move> moveSet = new ArrayList<Move>();
    private ArrayList<Move> movePool = new ArrayList<Move>();
    private HashMap<String, Stat> stats = new HashMap<String, Stat>();
    private ArrayList<Status> statuses = new ArrayList<Status>();
    private Ability ability;
    private Object object;

    public Pokemon(String name, ArrayList<Type> types,
                   ArrayList<Move> movePool, int hp,
                   int attack, int specialAttack,
                   int defense, int specialDefense,
                   int speed){
        this.name = name;

        this.stats.put("hp", new Stat(hp));
        this.stats.put("attack", new Stat(attack));
        this.stats.put("specialAttack", new Stat(specialAttack));
        this.stats.put("defense", new Stat(defense));
        this.stats.put("specialDefense", new Stat(specialDefense));
        this.stats.put("speed", new Stat(speed));

        this.types = types;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Type> getTypes() {
        return types;
    }

    public ArrayList<Move> getMoveSet() {
        return moveSet;
    }

    public ArrayList<Move> getMovePool() {
        return movePool;
    }

    public ArrayList<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(ArrayList<Status> statuses) {
        this.statuses = statuses;
    }

    public Ability getAbility() {
        return ability;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void addMove(Move move){

    }

    public void removeMove(Move move){

    }

    @Override
    public ArrayList<Move> getMoves(){
        return new ArrayList<Move>();
    }

    @Override
    public void setMoves(){

    }

    @Override
    public void attack(Move move){

    }

    @Override
    public void takeDamages(Move move){

    }
}
