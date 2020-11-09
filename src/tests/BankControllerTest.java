package tests;

import models.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import controllers.BankController;


public class BankControllerTest {

        @Test
        void hasClientTest() {
            Document doc = new Document("CC", "123", "1980 11 20");
            Address address = new Address("rua vinho ,12 ,200-12,Porto,Portugal");
            Email email = new Email("ola@ouy.pt");
            PhoneNumber phone = new PhoneNumber("123456789");

            Client client = new Client("jorge", address, doc, phone, email);


            assertEquals(client.getDocument().getIdNumber(), "123");
        }

        @Test
        void hasAccountTest() {
            Document doc = new Document("CC", "123", "1980 11 20");
            Address address = new Address("rua vinho ,12 ,200-12,Porto,Portugal");
            Email email = new Email("ola@ouy.pt");
            PhoneNumber phone = new PhoneNumber("123456789");

            Client client = new Client("jorge", address, doc, phone, email);
            Account account = new Account(client, 1, 10.00);

            assertEquals(account.getAccountID(), 1);
        }

        @Test
        void setTaxTest() {
            BankController bankController = new BankController();
            bankController.setTax(0.42);
            assertTrue(bankController.getTax() == 0.42);
        }

        @Test
        void registerClientTest() {

        }

        @Test
        void getClientTest() {
        }

        @Test
        void registerAccountTest() {
        }

        @Test
        void getBalanceTest() {
            Document doc = new Document("CC", "123", "1980 11 20");
            Address address = new Address("rua vinho ,12 ,200-12,Porto,Portugal");
            Email email = new Email("ola@ouy.pt");
            PhoneNumber phone = new PhoneNumber("123456789");

            Client client = new Client("jorge", address, doc, phone, email);
            Account account = new Account(client, 1, 10.00);


            assertEquals(account.getBalance(),10.00);
        }

        @Test
        void debitTest() {
        }

        @Test
        void creditTest() {
        }
    }

