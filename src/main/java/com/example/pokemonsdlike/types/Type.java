package com.example.pokemonsdlike.types;

import java.util.ArrayList;

public class Type {
    private String name;
    private ArrayList<Type> isWeakTo = new ArrayList<Type>();
    private ArrayList<Type> isImmuneTo = new ArrayList<Type>();
    private ArrayList<Type> isResistTo = new ArrayList<Type>();

    public Type(String name){
        this.name = name;
    }

    public ArrayList<Type> getIsResistTo() {
        return isResistTo;
    }

    public void setIsResistTo(ArrayList<Type> isResistTo) {
        this.isResistTo = isResistTo;
    }

    public ArrayList<Type> getIsImmuneTo() {
        return isImmuneTo;
    }

    public void setIsImmuneTo(ArrayList<Type> isImmuneTo) {
        this.isImmuneTo = isImmuneTo;
    }

    public ArrayList<Type> getIsWeakTo() {
        return isWeakTo;
    }

    public void setIsWeakTo(ArrayList<Type> isWeakTo) {
        this.isWeakTo = isWeakTo;
    }

    public String getName() {
        return name;
    }
}
