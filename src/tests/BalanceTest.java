package tests;

import models.Balance;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BalanceTest {

        Balance balance = new Balance("euro",0);


        @Test
        void setCurrency() {
                assertTrue(balance.getCurrency() == "euro");
                balance.setCurrency("dolar");
                assertTrue(balance.getCurrency() == "dolar");

        }

        @Test
        void setAmount() {
                assertTrue(balance.getAmount() == 0);
                balance.setAmount(2000);
                assertTrue(balance.getAmount() == 2000);
        }

        @Test
        void getAmount() {
                assertEquals(balance.getAmount(), 0);
        }

        @Test
        void getCurrency() {
                assertEquals(balance.getCurrency(), "euro");
        }
    }

