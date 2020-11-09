package models;

import java.util.*;

public class Client {
    private Document document;
    private Address address;
    private PhoneNumber phoneNumber;
    private Email email;
    private String name;
    private List<Account> accounts;

    /** Creates a new Client with his information
     *
     * @param name Name of the Client
     * @param address Address of the Client
     * @param doc Documents of the Client
     * @param phoneNumber Phone number of the Client
     * @param email Email of the Client
     */
    public Client(String name, Address address, Document doc, PhoneNumber phoneNumber, Email email) {
        this.document = doc;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.name = name;
        this.accounts = new LinkedList<Account>();
    }

    /**
     * @return Returns the documents of the Clients
     */
    public Document getDocument() {
        return this.document;
    }

    /**
     * @return Returns the address of the Clients
     */
    public Address getAddress() {
        return this.address;
    }

    /**
     * @return Returns the phone number of the Clients
     */
    public PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return Returns the email of the Clients
     */
    public Email getEmail() {
        return this.email;
    }

    /**
     * @return Returns the name of the Clients
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return Sets the name of the Clients
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Returns all the accounts of said Client
     */
    public List<Account> getAccountList() {
        return this.accounts;
    }

    /** Searches the accounts list by Id Number and gets the account with the given accountID
     *
     * @param accountID Id number of the Clients account
     * @return The account of the Client with the given accountID
     */
    public Account getAccountByID(int accountID) {
        for (int i = 0; i < this.accounts.size(); i++) {
            if (this.accounts.get(i).getAccountID() == accountID) {
                return this.accounts.get(i);
            }
        }
        return null;
    }

    /** Checks if Account exists by AccountID
     *
     * @param accountID Id number of the Clients account
     * @return true if a clients account exists with the given accountID
     * @return false if the account doesnt exist with the given accountID
     */
    public boolean hasAccountByID(int accountID) {
        for (int i = 0; i < this.accounts.size(); i++) {
            if (this.accounts.get(i).getAccountID() == accountID) {
                return true;
            }
        }
        return false;
    }
}
