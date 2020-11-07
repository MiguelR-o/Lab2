package models;

public class Balance {
    public String currency;
    public int amount;

    Balance() {
        this.currency = "euro";
        this.amount = 0;
    }

    Balance(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getCurrency() {
        return this.currency;
    }
}
