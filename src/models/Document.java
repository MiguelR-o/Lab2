package models;

public class Document {
    private String type;
    private String idnumber;

    public Document(String type, String idnumber) {
        this.type = type;
        this.idnumber = idnumber;
    }

    public String getType() {
        return this.type;
    }

    public String getIdNumber() {
        return this.idnumber;
    }
}
