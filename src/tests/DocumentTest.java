package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import models.Document;

public class DocumentTest {
   @Test
   pulic void getTypeTest(){
       Document doc = new Document("CC", "145879658 3 zy3","1980 11 6");
       assertEquals(doc.getType(),"CC");
   }

    @Test
    public void getIdNumberTest() {
        Document doc = new Document("CC", "145879658 3 zy3", "1980 11 6");
        assertEquals(doc.getIdNumber(), "145879658 3 zy3", "1980 11 6");
    }

    @Test
    public void getBirthDateTest(){
        Document doc = new Document("CC", "145879658 3 zy3","1980 11 6");
        assertEquals(doc.getBirthDate().getBirthDate(), "1980 11 6")
    }
}
