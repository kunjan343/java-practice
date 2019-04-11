public class Investment {
    private double balance = 1000;
    private double interestRate = 3.5;

    // Default Constructor
    Investment() {
    }

    // Parameterised Constructor
    Investment(double bal, double rate) {
        setBalance(bal);
        setInterestRate(rate);
    }

    // Get current balance
    public double getBalance() {
        return this.balance;
    }

    // Get current interest rate
    public double getInterestRate() {
        return this.interestRate;
    }

    // Set new balance
    public void setBalance(double bal) {
        try {
            if (bal <= 0) {
                throw new IllegalArgumentException("Error: Please enter correct balance value");
            }
            this.balance = bal;
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("Error: Please enter correct balance value");
        }
    }

    // Set new interest rate
    public void setInterestRate(double rate) {
        try {
            if (rate <= 0 || rate > 12) {
                throw new IllegalArgumentException("Error: Please enter correct interest rate");
            }
            this.interestRate = rate;
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("Error: Please enter correct interest rate");
        }
    }

    // Find total yearly interest
    public double totalInterest() {
        return (this.balance * this.interestRate) / 100;
    }

    // Find compound interest
    public double totalInvestment(int period) {
        return this.balance * Math.pow(1 + this.interestRate / 100, period);
    }

    // Print data in format
    public String toString() {
        return String.format("Investment Information\nCurrent Balance: %3.2f\nInterest Rate: %.1f", this.balance, this.interestRate);
    }

    public static void main(String[] args) {

    }
}
