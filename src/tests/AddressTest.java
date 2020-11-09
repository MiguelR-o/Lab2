package tests;

import models.Address;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class AddressTest {

        Address address = new Address("rua vinho ,12 ,200-12,Porto,Portugal");


        @Test
        void setAddress() {
                assertTrue( address.getAddress() == "rua vinho ,12 ,200-12,Porto,Portugal");
                address.setAddress("rua agua ,15 ,300-15,Madrid,Espanha");
                assertTrue(address.getAddress() == "rua agua ,15 ,300-15,Madrid,Espanha");
        }

        @Test
        void getAddress() {
                assertEquals(address.getAddress(), "rua vinho ,12 ,200-12,Porto,Portugal");
        }

        @Test
        void getStreet() {
                assertEquals(address.getStreet(), "rua vinho ");
        }

        @Test
        void getNumber() {
                assertEquals(address.getNumber() , "12 ");
        }

        @Test
        void getCity() {
                assertEquals(address.getCity(), "Porto");
        }

        @Test
        void getZipCode() {
                assertEquals(address.getZipCode(), "200-12");
        }

        @Test
        void getCountry() {
                assertEquals(address.getCountry(), "Portugal");
        }
    }

