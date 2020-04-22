package Laborator2.fighter;

public class Main {
    public static void main(String[] args) {

        fighter f1=new fighter (10, 100, "Dark Fighter");
        fighter f2=new fighter (12, 100, "Dark Fighter");
        fighter f3=new fighter (10, 100, "Dark Fighter");

    if(f1.equals(f1))
        System.out.println("f1=f3");
        else
            System.out.println("f1 != f3");

    }
}
