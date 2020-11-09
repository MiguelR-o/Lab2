package tests;

import models.PhoneNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneNumberTest {

        PhoneNumber phoneNumber = new PhoneNumber("919940980");

        @Test
        void getPhoneNumber() {
                assertEquals(phoneNumber.getPhoneNumber(),"919940980");
        }

        @Test
        void setPhoneNumber() {
                assertTrue(phoneNumber.getPhoneNumber() == "919940980");
                phoneNumber.setPhoneNumber("935548955");
                assertTrue(phoneNumber.getPhoneNumber() == "935548955");
        }
    }

