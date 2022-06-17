package com.packages;

public class Predator {
    private String name;
    private int age;
    private int huntedPreyCount;
    private boolean isHungry;

    public Predator(String name, int age, int huntedPreyCount, boolean isHungry) {
        this.setName(name);
        this.setAge(age);
        this.setHuntedPreyCount(huntedPreyCount);
        this.setHungry(isHungry);
    }

    public Predator(String name, int age) {
        this.setName(name);
        this.setAge(age);
        this.setHuntedPreyCount(0);
        this.setHungry(true);
        //saludos terceros
    }

    public void hunt(){
        this.isHungry = false;
        huntedPreyCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHuntedPreyCount() {
        return huntedPreyCount;
    }

    public void setHuntedPreyCount(int huntedPreyCount) {
        this.huntedPreyCount = huntedPreyCount;
    }

    public boolean getisHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
}
