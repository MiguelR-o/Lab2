package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import models.Document;

public class DocumentTest {
   @Test
   pulic void getTypeTest(){
       Document doc = new Document("CC", "145879658 3 zy3");
       assertEquals(doc.getType(),"CC");
   }

    @Test
    public void getIdNumberTest() {
        Document doc = new Document("CC", "145879658 3 zy3");
        assertEquals(doc.getIdNumber(), "145879658 3 zy3");
    }
}
