package org.travel;

public class Trip {
    Date start;
    Date end;
    String destination;

    public Trip(Date start, Date end, String destination) {
        this.start = start;
        this.end = end;
        this.destination = destination;
    }


    public String getInfo() {
        return "Trip: " +"\n    -"+
                "Start " + start.getInfo() +"\n    -"+
                "End " + end.getInfo() +"\n    -"+
                "Destination: " + destination ;
    }
}
