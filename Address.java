package org.travel;

public class Address {

    String zip;
    String cit;
    String street;


    public Address(String zip, String cit, String street) {
        this.zip = zip;
        this.cit = cit;
        this.street = street;
    }


    public String getInfo() {
        return "Address: " +
                "zip=" + zip +
                ", cit=" + cit +
                ", street=" + street ;
    }
}
