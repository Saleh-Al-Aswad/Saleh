package com.capgemini;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import com.capgemini.reservationList;

public class show_reservations {

    private static final String FILE_NAME = "data/Reservations.csv";

    private String filename;

    public show_reservations(String filename){
        this.filename = filename;
    }

    public List<reservationList> Read() throws java.io.IOException {
        var reservations = Files.readAllLines(Paths.get(filename))
                .stream()
                .filter(line -> !line.isBlank())
                .filter(line -> !line.startsWith("#"))
                .map(line -> line.trim())
                .map(line -> {
                    var results = new reservationList();
                    var columns = line.split(",");
                    results.setID(columns[0]);
                    results.setBoatType(columns[1]);
                    results.setDate(columns[2]);
                    results.setTime(columns[3]);

                    return results;
                })
                .toList();
        return reservations;
    }
}