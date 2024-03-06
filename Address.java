/*export class Address {
    number: string;
    street: string;
    city: string;
    country: string;
}*/

// TS to JAVA

public class Address {
    private String number;
    private String street;
    private String city;
    private String country;
    // getters and setters

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}