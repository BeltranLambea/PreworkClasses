package com.packages;

public class User {
    private String name;
    private  int level;
    private boolean isActive;

    public User(String name, int level, boolean isActive) {
        this.setName(name);
        this.level = level;
        this.isActive = true;
    }

    public User(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void setName(String name) {
        if (name.length() < 8){
            this.name = name;
        }else{
            this.name = name.substring(0, 7);
        }
    }

    public String getName() {
        return name;
    }

    public void register(){
        System.out.println("Welcome " + this.name);
    }
}
