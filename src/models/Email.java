package models;

public class Email {
    private String email;

    Email(String email) {
        this.email = email;
    }

    public String getEmailDomain() {
        String[] emailSplit = this.email.split("@");
        String domain = emailSplit[1];
        return domain;
    }

    public String getEmail() {
        return this.email;
    }
}
