package org.travel;

public class Main {

    public static void main(String[] args) {
        Address addressAni = new Address("69-212","Lodz","Piekna" );
        Date start = new Date(2018, 3, 23);
        Date end = new Date(2018, 3, 23);
        Trip tripAni = new Trip(start, end, "Bardzo fajny trip");
        Customer customerAnia = new Customer("Ania");
        customerAnia.setAddress(addressAni);
        customerAnia.assignTrip(tripAni);
        System.out.println(customerAnia.getInfo());


    }
}
