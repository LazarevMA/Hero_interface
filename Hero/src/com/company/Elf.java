package com.company;

public class Elf extends Hero{
    private int arrowsCount;

    public Elf(String username, int level, int arrowsCount) {
        super(username, level);
        this.setArrows(arrowsCount);
    }

    private void  setArrows(int arrowsCount){
        if(arrowsCount < 1 || arrowsCount > 100)
            throw new IllegalArgumentException("Wrong value to wizard’mana");
        this.arrowsCount = arrowsCount;
    }

    private boolean shootArrow(){
        return this.arrowsCount > 0;
    }

    public String action(){
        if(shootArrow()){
            --this.arrowsCount;
            return super.getUsername()+"shoot arrow";
        }
        else {
            return super.getUsername()+"has no more arrows";
        }
    }

    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator())
                .append("Elf ").append(super.getUsername())
                .append("[")
                .append(super.getLevel())
                .append(" level] is online")
                .append(System.lineSeparator());
        return sb.toString();
    }
}
