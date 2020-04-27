package Homework.Laborator2_CodeChallenge3;

public class Fish extends Animal implements Pet{
    private String fishName;

    public Fish (){
        super(0);
    }

    @Override
    void eat() {
        System.out.println("A herbivorous fish's diet consists of plants, algae, vegetables and fruits.");
    }

    @Override
    public String getName() {
        return this.fishName;
    }

    @Override
    public void setName(String name) {
        this.fishName=name;
    }

    @Override
    public void play() {
        System.out.println("Many might not know, but it's actually possible to physically play with your fish.");
        System.out.println("You can teach them different tricks, feed them with your hand, and much more.");
    }

    @Override
    public void walk(){
        System.out.println("Fish can't walk. They swim and they have no legs");
    }
}
