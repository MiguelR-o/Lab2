package tests;

import models.BirthDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BirthDateTest {

        BirthDate birthDate = new BirthDate("2001/09/18");


        @Test
        void getAge() {
                assertEquals(birthDate.getAge(), "19");

        }

        @Test
        void getBirthDate() {
                assertEquals(birthDate.getBirthDate(), "2001/09/18");
        }

        @Test
        void getBirthDay() {
                assertEquals(birthDate.getBirthDay(), "18");
        }

        @Test
        void getBirthMonth() {
                assertEquals(birthDate.getBirthMonth(), "09");
        }

        @Test
        void getBirthYear() {
                assertEquals(birthDate.getBirthYear(), "2001");
        }
    }

