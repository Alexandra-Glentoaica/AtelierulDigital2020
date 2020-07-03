package laborator10;

public class BankAccount {
    private int amount;
    private String ownerID;

    public BankAccount(int amount, String ownerID) {
        this.amount = amount;
        this.ownerID=ownerID;
    }

    public int getAmount() {
        return amount;
    }

    public String getOwnerID() {
        return ownerID;
    }
}
