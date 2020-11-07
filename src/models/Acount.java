package models;

import java.util.*;

public class Acount {
    public Client client;
    protected int acountID;
    public List<Client> adjacentClients;
    private Balance balance;
    private boolean creditAllowed;

    public Acount(Client client, int acountID) {
        this.client = client;
        this.acountID = acountID;
        this.balance = new Balance();
    }
}
