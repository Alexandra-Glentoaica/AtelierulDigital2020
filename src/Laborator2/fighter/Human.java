package Laborator2.fighter;

public class Human {
    private int health;
    private String name;

    public Human(int health, String name){
        this.health=health;
        this.name=name;
    }

    public int getHealth(){
        return this.health;
    }

    public String getName(){
        return this.name;
    }

    public void decreaseHealth(int damage){
        this.health=this.health-damage;
    }
}
