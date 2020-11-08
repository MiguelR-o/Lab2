package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import models.Email;

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
}
