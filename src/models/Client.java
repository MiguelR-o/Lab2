package models;

import java.util.*;

public class Client {
    private Document document;
    private Address address;
    private PhoneNumber phoneNumber;
    private Email email;
    private String name;
    private List<Acount> acounts;

    public Client(String name, Address address, Document doc, PhoneNumber phoneNumber, Email email) {
        this.document = doc;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.name = name;
        this.acounts = new LinkedList<Acount>();
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

    public List<Acount> getAcountList() {
        return this.acounts;
    }

    public Acount getAcountByID(int acountID) {
        for (int i = 0; i < this.acounts.size(); i++) {
            if (this.acounts.get(i).getAcountID() == acountID) {
                return this.acounts.get(i);
            }

        }
        return null;
    }

    public boolean hasAcountByID(int acountID) {
        for (int i = 0; i < this.acounts.size(); i++) {
            if (this.acounts.get(i).getAcountID() == acountID) {
                return true;
            }

        }
        return false;
    }
}
