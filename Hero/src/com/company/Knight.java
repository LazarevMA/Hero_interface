package com.company;

public class Knight extends Hero{
    private int strength;
    private int impactForce;

    public Knight(String username, int level, int strength, int impactForce) {
        super(username, level);
        this.setStrength(strength);
        this.setImpactForce(impactForce);
    }

    private void setStrength(int strength) {
        if (strength < 1 || strength > 100)
            throw new IllegalArgumentException("Wrong value to knight’s strength");
        this.strength = strength;
    }

    private void setImpactForce(int impactForce) {
        if (impactForce < 0 || impactForce > this.strength)
            throw new IllegalArgumentException("Wrong value to knight’s force impact");
        this.impactForce = impactForce;
    }

    private boolean fight(){
        return this.strength > 0;
    }

    public String action(){
        if (fight()){
            this.strength -= impactForce;
            return super.getUsername()+" fight with force "+this.impactForce;
        }
        else {
            return super.getUsername()+" has no more strength";
        }
    }

    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator())
                .append("Knight ").append(super.getUsername())
                .append("[")
                .append(super.getLevel())
                .append(" level] is online")
                .append(System.lineSeparator());
        return sb.toString();
    }
}
