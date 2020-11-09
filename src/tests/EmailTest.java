package tests;

import models.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailTest {

    @Test
    public void getEmailDomainTest() {
        Email email = new Email("example@road.toA");
        assertEquals(email.getEmailDomain(), "road.toA");

    }

    @Test
    public void getEmail() {
        Email email = new Email("example@road.toA");
        assertEquals(email.getEmail(), "example@road.toA");

    }
    @Test
    public void setEmail(){
        Email email = new Email("example@road.toA");
        assertTrue(email.getEmail() == "example@road.toA");
        email.setEmail("example@road.toB");
        assertTrue(email.getEmail() == "example@road.toB");
    }
}
