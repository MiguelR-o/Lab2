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
    public void getAcountByIDTest() {
        Client client = setUPClient();
        Acount acount = new Acount(client, 123);
        Acount secondacount = new Acount(client, 321);
        client.getAcountList().add(acount);
        client.getAcountList().add(secondacount);
        assertEquals(client.getAcountByID(123), acount);

    }

    @Test
    public void hasAcountByIDTest() {
        Client client = setUPClient();
        Acount acount = new Acount(client, 123);
        Acount secondacount = new Acount(client, 321);
        client.getAcountList().add(acount);
        client.getAcountList().add(secondacount);
        assertEquals(client.hasAcountByID(123), true);
        assertEquals(client.hasAcountByID(423), false);
    }
}
