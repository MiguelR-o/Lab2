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

    /**
     * Checks if a client exists with the same id number
     *
     * @param clientID The ClientId number
     * @return true if a client exists
     * @return false if a client does not exist
     */
    public boolean hasClient(String clientID) {

        for (int i = 0; i < this.clients.size(); i++) {
            if (this.clients.get(i).getDocument().getIdNumber().equals(clientID)) {
                return true;
            }
        }
        return false;

    }

    /**
     * Checks if a account exists with the same id number
     *
     * @param accountID The AccountId number
     * @return ture if a account exists
     * @return false if a account does not exist
     */
    public boolean hasAccount(int accountID) {

        for (int i = 0; i < this.accounts.size(); i++) {
            if (this.accounts.get(i).getAccountID() == accountID) {
                return true;
            }
        }
        return false;

    }

    /**
     * Sets the tax of a transaction
     *
     * @param tax The tax of a transaction
     */
    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return this.tax;
    }

    /**
     * Registers a client in a List
     *
     * @param list List of clients created
     */
    public void registerClient(ArrayList<String> list) {
        String name = list.get(0);
        Document doc = new Document(list.get(1), list.get(2), list.get(3));
        Address address = new Address(list.get(4));
        Email email = new Email(list.get(5));
        PhoneNumber phone = new PhoneNumber(list.get(6));
        Client client = new Client(name, address, doc, phone, email);
        clients.add(client);

    }

    /**
     * Gets the client by his Id number
     *
     * @param clientID The clientId number
     * @return The client
     */
    public Client getClient(String clientID) {
        for (int i = 0; i < this.clients.size(); i++) {
            if (this.clients.get(i).getDocument().getIdNumber().equals(clientID)) {
                return this.clients.get(i);
            }
        }
        return null;

    }

    /**
     * Registers a account
     *
     * @param clientID  The clientId number
     * @param accountID The accountId number
     * @param amount    Initial amount of the account
     */
    public void registerAccount(String clientID, int accountID, double amount) {
        Client client = getClient(clientID);
        Account account = new Account(client, accountID, amount);
        client.getAccountList().add(account);
        accounts.add(account);
    }

    /**
     * @param clientID  The clientId number
     * @param accountID The accountId number
     * @return The Balance of the given client account
     */
    public double getBalance(String clientID, int accountID) {
        Client client = getClient(clientID);
        return client.getAccountByID(accountID).getBalance().getAmount();

    }

    /**
     *
     * @param clientID  The clientId number
     * @param accountID The accountId number
     * @param amount    Amount to be added to the account
     */
    public void debit(String clientID, int accountID, double amount) {
        Client client = getClient(clientID);
        double currentBalance = client.getAccountByID(accountID).getBalance().getAmount();
        client.getAccountByID(accountID).getBalance().setAmount(currentBalance - amount - this.tax);
    }

    /**
     *
     * @param clientID  The clientId number
     * @param accountID The accountId number
     * @param amount    Amount to be added to the account
     */
    public void credit(String clientID, int accountID, double amount) {
        Client client = getClient(clientID);
        double currentBalance = client.getAccountByID(accountID).getBalance().getAmount();
        client.getAccountByID(accountID).getBalance().setAmount(currentBalance + amount - this.tax);
    }

    /**
     *
     * @param clientID The clientID number as a String
     * @param list     List of String containing the data to be parsed through the
     *                 diferent client methods
     */
    public void updateClient(String clientID, List<String> list) {
        Client client = getClient(clientID);
        client.getDocument().setDocumentType(list.get(0));
        client.getAddress().setAddress(list.get(1));
        client.getEmail().setEmail(list.get(2));
        client.getPhoneNumber().setPhoneNumber(list.get(3));

    }
}
