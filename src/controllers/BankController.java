package controllers;

import java.util.*;
import models.*;

public class BankController {
    private List<Client> clients;
    private List<Account> accounts;
    private double tax;

    public BankController() {
        this.clients = new LinkedList<Client>();
        this.accounts = new LinkedList<Account>();
    }

    public boolean hasClient(String clientID) {

        for (int i = 0; i < this.clients.size(); i++) {
            if (this.clients.get(i).getDocument().getIdNumber().equals(clientID)) {
                return true;
            }
        }
        return false;

    }

    public boolean hasAccount(int accountID) {

        for (int i = 0; i < this.accounts.size(); i++) {
            if (this.accounts.get(i).getAccountID() == accountID) {
                return true;
            }
        }
        return false;

    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void registerClient(ArrayList<String> list) {
        String name = list.get(0);
        Document doc = new Document(list.get(1), list.get(2), list.get(3));
        Address address = new Address(list.get(4));
        Email email = new Email(list.get(5));
        PhoneNumber phone = new PhoneNumber(list.get(6));
        Client client = new Client(name, address, doc, phone, email);
        clients.add(client);

    }

    public Client getClient(String clientID) {
        for (int i = 0; i < this.clients.size(); i++) {
            if (this.clients.get(i).getDocument().getIdNumber().equals(clientID)) {
                return this.clients.get(i);
            }
        }
        return null;

    }

    public void registerAccount(String clientID, int accountID, double amount) {
        Client client = getClient(clientID);
        Account account = new Account(client, accountID, amount);
        client.getAccountList().add(account);
        accounts.add(account);
    }

    public double getBalance(String clientID, int accountID) {
        Client client = getClient(clientID);
        return client.getAccountByID(accountID).getBalance().getAmount();

    }

    public void debit(String clientID, int accountID, double amount) {
        Client client = getClient(clientID);
        double currentBalance = client.getAccountByID(accountID).getBalance().getAmount();
        client.getAccountByID(accountID).getBalance().setAmount(currentBalance - amount - this.tax);
    }

    public void credit(String clientID, int accountID, double amount) {
        Client client = getClient(clientID);
        double currentBalance = client.getAccountByID(accountID).getBalance().getAmount();
        client.getAccountByID(accountID).getBalance().setAmount(currentBalance + amount - this.tax);
    }

}
