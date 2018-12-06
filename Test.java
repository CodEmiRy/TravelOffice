package org.travel;

public class Test {

    public static void main(String[] args) {
        /**Dodanie Ani*/
        Address addressAni = new Address("69-212", "Lodz", "Piekna");
        Date start = new Date(2018, 3, 23);
        Date end = new Date(2018, 3, 23);
        Trip tripAni = new AbroadTrip(start, end, "Bardzo fajny trip");
        tripAni.setPrice(120.50);
        AbroadTrip abroadTrip= (AbroadTrip)tripAni;
        abroadTrip.setInsurance(20);
        Customer customerAnia = new Customer("Ania");
        customerAnia.setAddress(addressAni);
        customerAnia.assignTrip(tripAni);

        /**Dodania Olo*/
        Address addressOlo = new Address("11-111", "Lodz", "Piekna");
        Date start2 = new Date(2018, 3, 23);
        Date end2 = new Date(2018, 3, 23);
        Trip tripOlo =  new DomesticTrip(start2, end2, "Bardzo fajny trip2");
        tripOlo.setPrice(120.50);

        DomesticTrip domesticTrip = (DomesticTrip) tripOlo;
        domesticTrip.setOwnArrivalDiscount(20);
        Customer customerOlo = new Customer("Olo");
        customerOlo.setAddress(addressOlo);
        customerOlo.assignTrip(tripOlo);


        //System.out.println(customerAnia.toString());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        TravelOffice travelOffice = new TravelOffice();
        travelOffice.addCustomer(customerAnia);
        travelOffice.addCustomer(customerOlo);
        travelOffice.addCustomer(customerAnia);
        System.out.println(travelOffice.toString());
        travelOffice.toString();
        System.out.println(travelOffice.getCustomerCount());

    }
}
