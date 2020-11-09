package models;

import java.util.*;

public class Account {
    private Client client;
    private int accountID;
    private List<Client> adjacentClients;
    private Balance balance;
    private boolean creditAllowed;

    /**
     *
     * @param client The client
     * @param accountID AccountId of the Clients account
     * @param credit Credit of the Clients account
     */
    public Account(Client client, int accountID, double credit) {
        this.client = client;
        this.accountID = accountID;
        this.balance = new Balance(credit);
        this.creditAllowed = false;
    }

    /**
     * @return the clients accountID
     */
    public int getAccountID() {
        return this.accountID;
    }

    /**
     * @return the accountsOwner
     */
    public Client getOwner() {
        return this.client;
    }

    /**
     * @return of the clients account balance
     */
    public Balance getBalance() {
        return this.balance;
    }

    /**
     * @return of the clients account credit allowed
     */
    public boolean isAllowedCredit() {
        return this.creditAllowed;
    }

    /**
     *
     * @param answer if true the client can withdraw
     */
    public void setCreditAllowance(boolean answer) {
        this.creditAllowed = answer;
    }

    /**
     * @return a list of the adjacent clients
     */
    public Client[] getAdjacentClients() {
        Client[] arrayClient = (Client[]) adjacentClients.toArray();
        return arrayClient;
    }

}
