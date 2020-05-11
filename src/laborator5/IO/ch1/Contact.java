package laborator5.IO.ch1;

public class Contact {
    private String name;
    private long phoneNumber;

    public Contact(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return name + "," + phoneNumber + "\n";
    }
}
