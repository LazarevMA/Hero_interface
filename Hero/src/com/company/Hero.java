package com.company;

public class Hero {
    private String username;
    private int level;

    public Hero(String username, int level){
        this.setLevel(level);
        this.setUsername(username);
    }

    private void setUsername(String username){
        if(username.length() < 5)
            throw new IllegalArgumentException("Wrong value to hero’s username");
        this.username = username;
    }

    private void setLevel(int level){
        if (level < 0)
            throw new IllegalArgumentException("Wrong value to hero’s level");
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }
}
