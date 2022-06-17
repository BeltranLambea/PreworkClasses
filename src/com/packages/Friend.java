package com.packages;

public class Friend {
    private String name;
    private int age;
    private char sex;
    private String pic;

    public Friend(String name, int age, char sex, String pic) {
        setName(name);
        setAge(age);
        setSex(sex);
        setPic(pic);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public String getPic() {
        return pic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
