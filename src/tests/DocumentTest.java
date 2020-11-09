package tests;

import models.Document;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DocumentTest {
    @Test
    public void getTypeTest() {
        Document doc = new Document("CC", "145879658 3 zy3", "1980 11 6");
        assertEquals(doc.getType(), "CC");
    }

    @Test
    public void getIdNumberTest() {
        Document doc = new Document("CC", "145879658 3 zy3", "1980 11 6");
        assertEquals(doc.getIdNumber(), "145879658 3 zy3", "1980 11 6");
    }

    @Test
    public void getBirthDateTest() {
        Document doc = new Document("CC", "145879658 3 zy3", "1980 11 6");
        assertEquals(doc.getBirthDate().getBirthDate(), "1980 11 6");
    }
    @Test
    public void setDocumentType(){
        Document doc = new Document("CC", "145879658 3 zy3", "1980 11 6");
        assertTrue(doc.getType() == "CC");
        doc.setDocumentType("Passaporte");
        assertTrue(doc.getType() == "Passaporte");
    }
}
