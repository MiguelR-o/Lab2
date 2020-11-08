package models;

public class Balance {
    public String currency;
    public double amount;

    Balance() {
        this.currency = "euro";
        this.amount = 0.00;
    }

    public Balance(double amount) {
        this.amount = amount;
    }

    public Balance(String currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getCurrency() {
        return this.currency;
    }
}
