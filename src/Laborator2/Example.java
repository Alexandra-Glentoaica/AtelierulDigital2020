package Laborator2;

public class Example {
    private int a=3;

    public int getA(int i){
        return a;
    }

    public void setA(int a){
        this.a=a;
    }

    public int calculate (int b){
        int c;
        c=a+b;
        b++;

        return c;
    }

    public void incrementA(Example ex){
        ex.getA(10);
    }
}
