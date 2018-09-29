package com.company.test;

import com.company.Main;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class VestingEventCalculationTest {

    @Test
    public void calulateTotalGainOverVestingSchedule() {
        String expectedResult = "001B,1300.00\n" +
                "002B,1325.00\n" +
                "003B,500.00";

        String[] args = new String[]{
        };
        Main.main(args);
    }

}
