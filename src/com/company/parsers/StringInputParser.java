package com.company.parsers;

import com.company.events.Event;
import com.company.events.VestEvent;

import java.util.ArrayList;
import java.util.Date;

public class StringInputParser {
    public StringInputParser(){
    }

    public ArrayList<VestEvent> getEventArray(String inputData){
        Integer numberOfRows = Integer.parseInt(String.valueOf(inputData.charAt(0)));
        String[] rows = parseDataIntoRows(inputData);
        System.out.println("Printing Array....");
        ArrayList<VestEvent> events = new ArrayList<>();
        for (int i = 1; i < numberOfRows; i += 1 ) {
            String rowData = rows[i];
            String[] eventData = rowData.split(",");
            VestEvent event = parseRowIntoEvent(eventData);
            events.add(event);
        }
        return events;
    }

    private String[] parseDataIntoRows(String inputString){
        String[] rowArray = inputString.split("\r\n|\r|\n");
        return rowArray;
    }



    private VestEvent parseRowIntoEvent(String[] eventData){
        VestEvent event;
        event = parseVestEvent(eventData);
        return event;

    }

    private VestEvent parseVestEvent(String[] vestEventData) {
        Date vestDate  = DateParser.parseDate(vestEventData[2]);
        Integer unitsVesting = Integer.parseInt(vestEventData[3]);
        Double grantPrice = Double.parseDouble(vestEventData[4]);
        return new VestEvent(vestEventData[1], vestDate, unitsVesting, grantPrice);
    }
}
