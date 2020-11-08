package models;

public class Address {
    private String address;
    private String street;
    private String number;
    private String city;
    private String zipCode;
    private String country;

    public Address(String address) {
        this.address = address;
        String[] fullAd = this.address.split(",");
        this.street = fullAd[0];
        this.number = fullAd[1];
        this.zipCode = fullAd[2];
        this.city = fullAd[3];
        this.country = fullAd[4];
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
        String[] fullAd = this.address.split(",");
        this.street = fullAd[0];
        this.number = fullAd[1];
        this.city = fullAd[2];
        this.zipCode = fullAd[3];
        this.country = fullAd[4];

    }

    public String getAddress() {
        return this.address;
    }

    public String getStreet() {
        return this.street;
    }

    public String getNumber() {
        return this.number;
    }

    public String getCity() {
        return this.city;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public String getCountry() {
        return this.country;
    }
}
