package laborator4.visitor;

public class Main {
    public static void main(String[] args) {
        Element[] elemente = new Element[4];

        Book book1=new Book(10,3);
        Book book2 = new Book(100,4);
        Video video = new Video(23,4);
        Audio audio = new Audio(23,31);

        elemente[0]=book1;
        elemente[1]=book2;
        elemente[2]=video;
        elemente[3]=audio;

        Visitor visitor=new CostVisitor();
        visitor.visit(elemente);
        System.out.println(((CostVisitor) visitor).getTotalCost());


    }
}
