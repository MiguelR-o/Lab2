package models;

import java.util.*;

public class Account {
    private Client client;
    private int accountID;
    private List<Client> adjacentClients;
    private Balance balance;
    private boolean creditAllowed;

    public Account(Client client, int accountID) {
        this.client = client;
        this.accountID = accountID;
        this.balance = new Balance(0);
        this.creditAllowed = false;
    }

    public Account(Client client, int accountID, int credit) {
        this.client = client;
        this.accountID = accountID;
        this.balance = new Balance(credit);
        this.creditAllowed = false;
    }

    public int getAccount() {
        return this.accountID;
    }

    public Client getOwner() {
        return this.client;
    }

    public Balance getBalance() {
        return this.balance;
    }

    public boolean isAllowedCredit() {
        return this.creditAllowed;
    }

    public void setCreditAllowance(boolean answer) {
        this.creditAllowed = answer;
    }

    public Client[] getAdjacentClients() {
        Client[] arrayClient = (Client[]) adjacentClients.toArray();
        return arrayClient;
    }

}
