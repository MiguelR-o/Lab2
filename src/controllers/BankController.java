package controllers;

import java.util.*;
import models.*;

public class BankController {
    private List<Client> clients;
    private List<Acount> acounts;

    public BankController() {
        this.clients = new LinkedList<Client>();
        this.acounts = new LinkedList<Acount>();
    }

    public boolean hasClient(String clientID) {
        for (int i = 0; i < this.clients.size(); i++) {
            if (this.clients.get(i).getDocument().getIdNumber() == clientID) {
                return true;
            }
        }
        return false;

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
}
