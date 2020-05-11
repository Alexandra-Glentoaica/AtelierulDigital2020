package laborator5.IO.ch1;

public class main {

    public static void main(String[] args) {
        PhoneBook pb= new PhoneBook("src/laborator5/IO/PhoneBook.txt");
        System.out.println(pb);

        System.out.println(pb.getNumberByName("Andrei"));
        System.out.println(pb.getNumberByName("Lavinia"));
    }
}

