package it.unisa.railways;

import java.util.List;

public class Train {
    final int numberOfSeats;
    List<String> stops;
    String firstStop;
    String lastStop;

    double numberOfKilometers = 0;

    public Train(int numberOfSeats, List<String> stops) {
        this.numberOfSeats = numberOfSeats;
        this.stops = stops;
        this.firstStop = this.stops.get(0);
        this.lastStop = this.stops.get(stops.size()-1);
    }

}