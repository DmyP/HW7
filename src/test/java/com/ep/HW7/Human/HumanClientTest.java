package com.ep.HW7.Human;

import com.ep.HW7.AbstractTest;
import org.junit.Assert;
import org.junit.Test;

public class HumanClientTest extends AbstractTest {


    @Test
    public void acceptCreditOffer() throws Exception {
    }

    @Test
    public void returnLoan() throws Exception {
    }

    @Test
    public void getFullCreditsOffer() throws Exception {
        Assert.assertEquals(humanClient.getFullCreditsOffer().size(), 3);
    }

    @Test
    public void getFilteredCreditOfferBySum() throws Exception {
        Assert.assertEquals(humanClient.getFilteredCreditOffer(0).size(), 1);
        Assert.assertEquals(humanClient.getFilteredCreditOffer(Integer.MAX_VALUE).size(), 3);
    }

    @Test
    public void getFilteredCreditOfferByCreditType() throws Exception {
        Assert.assertEquals(humanClient.getFilteredCreditOffer(creditType1).size(), 2);
        Assert.assertEquals(humanClient.getFilteredCreditOffer(creditType2).size(), 1);
    }

    @Test
    public void getFilteredCreditOffer2() throws Exception {
        Assert.assertEquals(humanClient.getFilteredCreditOffer(creditPrepaymentType1).size(), 2);
        Assert.assertEquals(humanClient.getFilteredCreditOffer(creditPrepaymentType2).size(), 1);
    }

    @Test
    public void getFilteredCreditOffer3() throws Exception {
        Assert.assertEquals(bank.makeFilteredCreditOffer(100, creditType1, creditPrepaymentType1).size(), 1);
    }

}