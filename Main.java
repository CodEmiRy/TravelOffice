package org.travel;

public class Main {

    public static void main(String[] args) {
        /**Dodanie Ani*/
        Address addressAni = new Address("69-212", "Lodz", "Piekna");
        Date start = new Date(2018, 3, 23);
        Date end = new Date(2018, 3, 23);
        Trip tripAni = new Trip(start, end, "Bardzo fajny trip");
        Customer customerAnia = new Customer("Ania");
        customerAnia.setAddress(addressAni);
        customerAnia.assignTrip(tripAni);

        /**Dodania Olo*/
        Address addressOlo = new Address("11-111", "Lodz", "Piekna");
        Date start2 = new Date(2018, 3, 23);
        Date end2 = new Date(2018, 3, 23);
        Trip tripOlo = new Trip(start2, end2, "Bardzo fajny trip2");
        Customer customerOlo = new Customer("Olo");
        customerOlo.setAddress(addressOlo);
        customerOlo.assignTrip(tripOlo);


        //System.out.println(customerAnia.getInfo());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        TravelOffice travelOffice = new TravelOffice();
        travelOffice.addCustomer(customerAnia);
        travelOffice.addCustomer(customerOlo);
        travelOffice.addCustomer(customerAnia);
        System.out.println(travelOffice.getInfo());
        travelOffice.getInfo();
        System.out.println(travelOffice.getCustomerCount());

    }
}
