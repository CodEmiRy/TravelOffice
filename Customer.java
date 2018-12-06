package org.travel;

public class Customer {

    private String name;
    private Trip trip;
    private Address address;


    public Customer(String name) {
        this.name = name;

    }

    public void setAddress(Address adr) {
        address = adr;
    }

    public void assignTrip(Trip tri) {
        trip = tri;
    }

    @Override
    public String toString() {

            return "Customer" + "\n" +
                    "Name: " + name +
                    "" + "\n" + trip.toString() +
                    ", " + "\n" + address.toString() + "."
                    ;

    }
}
