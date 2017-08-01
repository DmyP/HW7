package com.ep.HW7.Bank;

import com.ep.HW7.AbstractTest;
import org.junit.Assert;
import org.junit.Test;

public class BankTest extends AbstractTest{

    @Test
    public void makeFullCreditsOffer() throws Exception {
        Assert.assertEquals(bank.makeFullCreditsOffer().size(), 3);
    }

    @Test
    public void makeFilteredCreditOfferBySum() throws Exception {
        Assert.assertEquals(bank.makeFilteredCreditOffer(0).size(), 1);
        Assert.assertEquals(bank.makeFilteredCreditOffer(Integer.MAX_VALUE).size(), 3);
    }

    @Test
    public void makeFilteredCreditOfferByCreditType() throws Exception {
        Assert.assertEquals(bank.makeFilteredCreditOffer(creditType1).size(), 2);
        Assert.assertEquals(bank.makeFilteredCreditOffer(creditType2).size(), 1);
    }

    @Test
    public void makeFilteredCreditOfferByCreditPrepaymentType() throws Exception {
        Assert.assertEquals(bank.makeFilteredCreditOffer(creditPrepaymentType1).size(), 2);
        Assert.assertEquals(bank.makeFilteredCreditOffer(creditPrepaymentType2).size(), 1);
    }

    @Test
    public void makeFilteredCreditOfferByAll() throws Exception {
        Assert.assertEquals(bank.makeFilteredCreditOffer(100, creditType1, creditPrepaymentType1).size(), 1);
    }

}