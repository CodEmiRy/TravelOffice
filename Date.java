package org.travel;

public class Date {

    int rok;
    int miesiac;
    int dzien;


    public Date(int rok, int miesiac, int dzien) {
        this.rok = rok;
        this.miesiac = miesiac;
        this.dzien = dzien;
    }



    public String getInfo() {
        return "Date: " +
                "rok= " + rok +
                ", miesiac= " + miesiac +
                ", dzien= " + dzien ;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public void setMiesiac(int miesiac) {
        this.miesiac = miesiac;
    }

    public void setDzien(int dzien) {
        this.dzien = dzien;
    }
}
