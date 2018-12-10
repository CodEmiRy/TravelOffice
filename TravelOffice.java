package org.travel;

import java.util.HashMap;
import java.util.HashSet;

public class TravelOffice {
    //Customer[] customers = new Customer[2];
    HashSet<Customer> customers = new HashSet<Customer>();
    HashMap<String, Trip> trips = new HashMap<String, Trip>();


    public void addCustomer(Customer customer) {
        customers.add(customer);
    }


    public String getCustomerCount() {
        return "Obecnie jest " + customers.size() + " zapisanych osób w tablicy.";
    }

    @Override
    public String toString() {
        String info = "Zapisane osoby: ";
        for (Customer customer : customers) {
            info += customer.toString();
        }
        return info;
    }


    public void addTrip(String s, Trip t) {
        trips.put(s, t);
    }

    boolean removeTrip(String s) {
        if (trips.containsKey(s)) {
            trips.remove(s);
            return true;
        } else {
            return false;
        }
    }

    Customer findCustomerByName(String s) {
        for (Customer customer : customers) {
            if (customer.getName().equals(s)) {
                return customer;
            }
        }
        return null;
    }

    boolean removeCustomer(Customer c) {
        for (Customer customer : customers) {
            if (customer.equals(c)) {
                customers.remove(customer);
                return true;
            }
        }
        return false;
    }


/**rowiązanie na tablicy*/
//    boolean czyJestMiejsceWTablicy = false;
//        for (Customer customer1 : customers) {
//        if (customer1 != null) {
//            czyJestMiejsceWTablicy = true;
//        }
//    }
//        if (czyJestMiejsceWTablicy) {
//        rozszerzenieTablicy();
//    }
//        for (int i = 0; i < customers.length; i++) {
//
//        if (customers[i] == null) {
//            customers[i] = customer;
//            break;
//        }
//    }
//}
//
//    private void rozszerzenieTablicy() {
//        Customer[] customers2 = new Customer[customers.length + 1];
//        for (int i = 0; i < customers.length; i++) {
//            customers2[i] = customers[i];
//        }
//        customers = customers2;
//    }
//
//    public String getCustomerCount() {
//        return "Obecnie jest " + customers.length + " zapisanych osób w tablicy.";
//    }
//
//    @Override
//    public String toString() {
//        String info = "Zapisane osoby: ";
//
//        for (int i = 0; i < customers.length; i++) {
//            if (customers[i] == null) {
//                break;
//            } else {
//                info += customers[i].toString();
//            }
//        }
//        return info;
//    }
}