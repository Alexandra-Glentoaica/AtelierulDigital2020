package Homework.Laborator2_CodeChallenge3;

public class Spider extends Animal {

    public Spider() {
        super(8);
    }

    @Override
   public void eat() {
        System.out.println("Most spiders don't eat their prey whole; instead, they expel digestive enzymes onto or into the animal to liquefy it.");
        System.out.println("Some spiders use their fangs to inject the digestive fluid directly into the animal. This sort of spider liquefies the animal's insides, leaving the exoskeleton more or less intact");
    }
}
