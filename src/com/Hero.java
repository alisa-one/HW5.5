package com;

public class Hero {

    private int healthe;
    private int damage;
    private String superAbility;

    public Hero(int healthe, int damage, String superAbility) {
        this.healthe = healthe;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    public Hero(int healthe, int damage) {
        this.healthe = healthe;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealthe() {
        return healthe;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}
