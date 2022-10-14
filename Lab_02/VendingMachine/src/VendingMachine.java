public class VendingMachine {
    private int numberOfCans;
    private int numberOfTokens;

    public VendingMachine() {
    }

    public VendingMachine(int initialNumberOfCans) {
        numberOfCans = initialNumberOfCans;
        numberOfTokens = 0;
    }

    public void addCans(int numberOfNewCans) {
        this.numberOfCans += numberOfNewCans;
    }

    public void takeCan() {
        if (this.numberOfCans > 0) {
            this.numberOfCans--;
            this.numberOfTokens++;
        }
    }

    public void takeTokens() {
        this.numberOfTokens = 0;
    }

    public int getNumberOfCans() {
        return this.numberOfCans;
    }

    public int getNumberOfTokens() {
        return this.numberOfTokens;
    }
}