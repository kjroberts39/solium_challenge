package com.company.events;

import java.util.Date;

public class VestEvent extends Event{


    private Date _vestDate;
    private Integer _unitsVesting;
    private Double _grantPrice;

    public VestEvent(String employeeNumber, Date vestDate, Integer unitsVesting, Double grantPrice){
        _employeeNumber = employeeNumber;
        _vestDate = vestDate;
        _unitsVesting = unitsVesting;
        _grantPrice = grantPrice;
    }

    public Date getVestDate() {
        return _vestDate;
    }

    public Integer getUnitsVesting() {
        return _unitsVesting;
    }

    public Double getGrantPrice() {
        return _grantPrice;
    }
}
