package Homework.Laborator2_CodeChallenge3;

public class Cat extends Animal implements Pet {
    private String catName;

    public Cat (String name){
        super(4);
        this.catName=name;
    }

    Cat(){
        this("");
    }

    @Override
    public void eat() {
        System.out.println("Because cats are carnivores, the first ingredient you want to see listed on commercial cat food is a meat source");
        System.out.println("Unless the animal has a food allergy, there is no best meat for cats");
        System.out.println("It’s all about your cat’s preference. Some like chicken, while others prefer pork or seafood");
    }

    @Override
    public String getName() {
        return this.catName;
    }

    @Override
    public void setName(String name) {
        this.catName=name;
    }

    @Override
    public void play() {
        System.out.println("Encourage your cat to play by using interactive toys that mimic prey, such as a toy mouse.");
        System.out.println("You can pull the toy across a floor or wave a feather wand through the air. Remember not to use string-type products when playing with your cat.");
    }
}
