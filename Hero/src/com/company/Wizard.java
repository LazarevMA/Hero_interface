package com.company;

public class Wizard extends Hero{
    private int mana;
    private int spellPower;

    public Wizard(String username, int level,int mana,int spellPower) {
        super(username, level);
        this.setMana(mana);
        this.setSpellPower(spellPower);
    }

    private void setMana(int mana) {
        if(mana < 1 || mana > 1000)
            throw new IllegalArgumentException("Wrong value to wizard’s mana");
        this.mana = mana;
    }

    private void setSpellPower(int spellPower) {
        if (spellPower < 0 || spellPower > mana)
            throw new IllegalArgumentException("Wrong value to wizard’s spell power");
        this.spellPower = spellPower;
    }

    private boolean spell(){
        return this.mana >= 0;
    }

    public String action(){
        if (spell()){
            this.mana -= this.spellPower;
            return (super.getUsername() + " spell with power "+this.spellPower);

        }
        else {
            return (super.getUsername()+"  has no more mana");
        }
    }

    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator())
                .append("Wizard ").append(super.getUsername())
                .append("[")
                .append(super.getLevel())
                .append(" level] is online")
                .append(System.lineSeparator());
        return sb.toString();
    }
}
