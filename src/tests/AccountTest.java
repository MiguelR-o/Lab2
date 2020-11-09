package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import models.Account;
import models.Client;
import models.Address;
import models.PhoneNumber;
import models.Document;
import models.Email;

public class AccountTest {

    @Test
    public void getAccountIdTest(){
        Document doc = new Document("CC", "123", "1980 11 20");
        Address address = new Address("rua vinho ,12 ,200-12,Porto,Portugal");
        Email email = new Email("ola@ouy.pt");
        PhoneNumber phone = new PhoneNumber("123456789");
        Client client = new Client("jorge", address, doc, phone, email);

        Account account = new Account( client , 1, 10.00);
        assertEquals(account.getAccountID(), 1);
    }

    @Test
    public void getOwnerTest(){
        Document doc = new Document("CC", "123", "1980 11 20");
        Address address = new Address("rua vinho ,12 ,200-12,Porto,Portugal");
        Email email = new Email("ola@ouy.pt");
        PhoneNumber phone = new PhoneNumber("123456789");
        Client client = new Client("jorge", address, doc, phone, email);

        Account account = new Account( client , 1, 10.00);
        assertEquals(account.getOwner(), client);
    }

    @Test
    public void getBalanceTest(){
        Document doc = new Document("CC", "123", "1980 11 20");
        Address address = new Address("rua vinho ,12 ,200-12,Porto,Portugal");
        Email email = new Email("ola@ouy.pt");
        PhoneNumber phone = new PhoneNumber("123456789");
        Client client = new Client("jorge", address, doc, phone, email);

        Account account = new Account( client , 1, 10.00);
        assertEquals(account.getBalance().getAmount(), 10.00);
    }

    @Test
    public void setCreditAllowance(){
        Document doc = new Document("CC", "123", "1980 11 20");
        Address address = new Address("rua vinho ,12 ,200-12,Porto,Portugal");
        Email email = new Email("ola@ouy.pt");
        PhoneNumber phone = new PhoneNumber("123456789");
        Client client = new Client("jorge", address, doc, phone, email);

        Account account = new Account(client, 1, 10.00);
        assertFalse(account.isAllowedCredit());
        account.setCreditAllowance(true);
        assertTrue(account.isAllowedCredit());

    }

    @Test
    public void isAllowedCreditTest(){
        Document doc = new Document("CC", "123", "1980 11 20");
        Address address = new Address("rua vinho ,12 ,200-12,Porto,Portugal");
        Email email = new Email("ola@ouy.pt");
        PhoneNumber phone = new PhoneNumber("123456789");
        Client client = new Client("jorge", address, doc, phone, email);

        Account account = new Account(client, 1, 10.00);
        assertFalse(account.isAllowedCredit());
        account.setCreditAllowance(true);
        assertTrue(account.isAllowedCredit());
    }

    @Test
    public void getAdjacentClientsTest(){


    }


}
