package org.travel;

public class Customer {

    String name;
    Trip trip;
    Address address;


    public Customer(String name) {
        this.name = name;

    }

    public void setAddress(Address adr) {
        address = adr;
    }

    public void assignTrip(Trip tri) {
        trip = tri;
    }


    public String getInfo() {

        return "Customer" + "\n" +
                "Name: " + name +
                "" + "\n" + trip.getInfo() +
                ", " + "\n" + address.getInfo() + "."
                ;
    }
}
