package models;

public class Document {
    private String type;
    final String idnumber;
    private BirthDate birthDate;

    public Document(String type, String idnumber, String date) {
        this.type = type;
        this.idnumber = idnumber;
        this.birthDate = new BirthDate(date);
    }

    public String getType() {
        return this.type;
    }

    public String getIdNumber() {
        return this.idnumber;
    }

    public BirthDate getBirthDate() {
        return this.birthDate;
    }
}
