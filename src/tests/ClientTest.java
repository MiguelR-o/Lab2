package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import models.*;

public class ClientTest {

    public Client setUPClient() {
        Document doc = new Document("CC", "123", "1980 11 20");
        Address address = new Address("rua vinho ,12 ,200-12,Porto,Portugal");
        Email email = new Email("ola@ouy.pt");
        PhoneNumber phone = new PhoneNumber("123456789");
        Client client = new Client("jorge", address, doc, phone, email);
        return client;
    }

    @Test
    public void getDocumentTest() {
        Client client = setUPClient();
        assertTrue(client.getDocument() instanceof Document);
    }

    @Test
    public void getAddressTest() {
        Client client = setUPClient();
        assertTrue(client.getAddress() instanceof Address);
    }

    @Test
    public void getPhoneNumberTest() {
        Client client = setUPClient();
        assertTrue(client.getPhoneNumber() instanceof PhoneNumber);
    }

    @Test
    public void getEmailTest() {
        Client client = setUPClient();
        assertTrue(client.getEmail() instanceof Email);
    }

    @Test
    public void getNameTest() {
        Client client = setUPClient();
        assertEquals(client.getName(), "jorge");
    }

    @Test
    public void setNameTest() {
        Client client = setUPClient();
        assertTrue(client.getName() == "jorge");
        client.setName("pedro");
        assertTrue(client.getName() == "pedro");
    }

    @Test
    public void getAccountByIDTest() {
        Client client = setUPClient();
        Account account = new Account(client, 123, 10.00);
        Account secondAccount = new Account(client, 321, 10.00);
        client.getAccountList().add(account);
        client.getAccountList().add(secondAccount);
        assertEquals(client.getAccountByID(123), account);

    }

    @Test
    public void hasAccountByIDTest() {
        Client client = setUPClient();
        Account account = new Account(client, 123, 10.00);
        Account secondAccount = new Account(client, 321, 10.00);
        client.getAccountList().add(account);
        client.getAccountList().add(secondAccount);
        assertEquals(client.hasAccountByID(123), true);
        assertEquals(client.hasAccountByID(423), false);
    }
}
