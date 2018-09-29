package com.company;

import com.company.events.Event;
import com.company.events.VestEvent;
import com.company.parsers.StringInputParser;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        String testInputString = "5 \n" +
                "VEST,001B,20120101,1000,0.45 \n" +
                "VEST,002B,20120101,1500,0.45 \n" +
                "VEST,002B,20130101,1000,0.50 \n" +
                "VEST,001B,20130101,1500,0.50 \n" +
                "VEST,003B,20130101,1000,0.50 \n" +
                "20140101,1.00";
        StringInputParser inputParser = new StringInputParser();
        ArrayList<VestEvent> result = inputParser.getEventArray(testInputString);
        result.sort(Comparator.comparing(Event::getEmployeeNumber));

        for (VestEvent event: result) {
            System.out.println("Employee Number: " + event.getEmployeeNumber());
            System.out.println("Vest Date: " + event.getVestDate());
            System.out.println("Amount of Units Vesting: " + event.getUnitsVesting());
            System.out.println("Grant Price: " + event.getGrantPrice());
            System.out.println("");
        }

    }
}
