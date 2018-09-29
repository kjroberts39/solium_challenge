package com.company.parsers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser {
    public static Date parseDate(String dateString){
        Date date = new Date();
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("YYYYMMDD");
            date = dateFormat.parse(dateString);
        } catch(ParseException e){
            System.out.println(e + "Don't do dat.");
            throw e;
        }finally {
            return date;
        }
    }
}
