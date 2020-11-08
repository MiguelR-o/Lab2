package models;

import java.util.*;

public class Client {
    private Document document;
    private Address address;
    private PhoneNumber phoneNumber;
    private Email email;
    private String name;
    private List<Account> accounts;

    public Client(String name, Address address, Document doc, PhoneNumber phoneNumber, Email email) {
        this.document = doc;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.name = name;
        this.accounts = new LinkedList<Account>();
    }

    public Document getDocument() {
        return this.document;
    }

    public Address getAddress() {
        return this.address;
    }

    public PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public Email getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccountList() {
        return this.accounts;
    }

    public Account getAccountByID(int accountID) {
        for (int i = 0; i < this.accounts.size(); i++) {
            if (this.accounts.get(i).getAccountID() == accountID) {
                return this.accounts.get(i);
            }
        }
        return null;
    }

    public boolean hasAccountByID(int accountID) {
        for (int i = 0; i < this.accounts.size(); i++) {
            if (this.accounts.get(i).getAccountID() == accountID) {
                return true;
            }
        }
        return false;
    }
}
