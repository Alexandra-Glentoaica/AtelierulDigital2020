package Laborator1;

public class Main {
    private static int semester=2; //static = instanta de clasa
    private int instanceVar=3;
    public static void main(String[] args) {
        ControlFlow cf=new ControlFlow();
        System.out.println("result=" + cf.addManyTimes());

        int nr=6;
        Integer j=new Integer(4);
        cf.AutoBox(nr);


    }
}
