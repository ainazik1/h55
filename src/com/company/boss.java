package com.company;

public class boss {
     private  int health;
    private  int Damage ;
    private String telepathy;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDomage() {
        return Damage;
    }

    public void setDomage(int domage) {
        Damage = domage;
    }

    public String getTelepathy() {
        return telepathy;
    }

    public void setTelepathy(String telepathy) {
        this.telepathy = telepathy;
    }

    public boss(int health, int domage, String telepathy) {
        this.health = health;
        Damage = domage;
        this.telepathy = telepathy;






    }
}

