package com.ep.HW7.Credit;

import com.ep.HW7.NamedEntity;

public class CreditPrepaymentType extends NamedEntity{
    Boolean prepaymentAvailable;
    Integer prepaymentFare;

    protected CreditPrepaymentType(String name) {
        super(name);
    }

    public CreditPrepaymentType(String name, Boolean prepaymentAvailable, Integer prepaymentFare) {
        super(name);
        this.prepaymentAvailable = prepaymentAvailable;
        this.prepaymentFare = prepaymentFare;
    }

    public Boolean getPrepaymentAvailable() {
        return prepaymentAvailable;
    }

    public void setPrepaymentAvailable(Boolean prepaymentAvailable) {
        this.prepaymentAvailable = prepaymentAvailable;
    }

    public Integer getPrepaymentFare() {
        return prepaymentFare;
    }

    public void setPrepaymentFare(Integer prepaymentFare) {
        this.prepaymentFare = prepaymentFare;
    }
}
