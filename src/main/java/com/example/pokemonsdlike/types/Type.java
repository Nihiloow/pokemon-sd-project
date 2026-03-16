package com.example.pokemonsdlike.types;

import java.util.ArrayList;
import java.util.Arrays;

public class Type {
    private String name;
    private ArrayList<String> isWeakTo = new ArrayList<String>();
    private ArrayList<String> isImmuneTo = new ArrayList<String>();
    private ArrayList<String> isResistTo = new ArrayList<String>();

    public Type(String name) {
        this.name = name;
    }

    public ArrayList<String> getIsResistTo() {
        return isResistTo;
    }

    public void setIsResistTo(String... types) {
        setList(isResistTo, types);
    }

    public ArrayList<String> getIsImmuneTo() {
        return isImmuneTo;
    }

    public void setIsImmuneTo(String... types) {
        setList(isImmuneTo, types);
    }

    public ArrayList<String> getIsWeakTo() {
        return isWeakTo;
    }

    public void setIsWeakTo(String... types) {
        setList(isWeakTo, types);
    }

    public String getName() {
        return name;
    }

    // Generic method to set the list
    private void setList(ArrayList<String> list, String... elements) {
        if (elements != null) {
            list.clear();
            list.addAll(Arrays.asList(elements));
        } else {
            list.clear(); // Clear the list if elements is null
        }
    }

    public void setTypeRelationship(String[] weaknesses, String[] resistances, String[] immunities) {
        setIsWeakTo(weaknesses);
        setIsImmuneTo(immunities);
        setIsResistTo(resistances);
    }
}