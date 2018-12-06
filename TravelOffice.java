package org.travel;

public class TravelOffice {
    Customer[] customers = new Customer[2];


    public void addCustomer(Customer customer) {

        boolean czyJestMiejsceWTablicy = false;
        for (Customer customer1 : customers) {
            if (customer1 != null) {
                czyJestMiejsceWTablicy = true;
            }
        }
        if (czyJestMiejsceWTablicy) {
            rozszerzenieTablicy();
        }
        for (int i = 0; i < customers.length; i++) {

            if (customers[i] == null) {
                customers[i] = customer;
                break;
            }
        }
    }

    private void rozszerzenieTablicy() {
        Customer[] customers2 = new Customer[customers.length + 1];
        for (int i = 0; i < customers.length; i++) {
            customers2[i] = customers[i];
        }
        customers = customers2;
    }

    public String getCustomerCount() {
        return "Obecnie jest " + customers.length + " zapisanych osób w tablicy.";
    }


    public String getInfo() {
        String info = "Zapisane osoby: ";

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                break;
            } else {
                info += customers[i].getInfo();
            }
        }
        return info;
    }
}