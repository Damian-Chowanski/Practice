public class Account {
    private int acNumber;
    private int acPIN;
    private double acBalance;

    public Account(int acNumber, int acPIN, double acBalance) {
        this.acNumber = acNumber;
        this.acPIN = acPIN;
        this.acBalance = acBalance;
    }

    public int getAcNumber() {
        return acNumber;
    }

    public void setAcNumber(int acNumber) {
        this.acNumber = acNumber;
    }

    public int getAcPIN() {
        return acPIN;
    }

    public void setAcPIN(int acPIN) {
        this.acPIN = acPIN;
    }

    public double getAcBalance() {
        return acBalance;
    }

    public void setAcBalance(double acBalance) {
        this.acBalance = acBalance;
    }
}
