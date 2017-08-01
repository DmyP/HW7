package com.ep.HW7;

import com.ep.HW7.Bank.Bank;
import com.ep.HW7.Credit.Credit;
import com.ep.HW7.Credit.CreditPrepaymentType;
import com.ep.HW7.Credit.CreditType;
import com.ep.HW7.Human.HumanClient;
import org.junit.Before;

public abstract class AbstractTest {
    protected Bank bank;
    protected CreditType creditType1, creditType2;
    protected CreditPrepaymentType creditPrepaymentType1, creditPrepaymentType2;
    protected Credit credit1, credit2, credit3;
    protected HumanClient humanClient;

    @Before
    public void setUp() throws Exception {
        bank = new Bank("Test bank");

        creditType1 = new CreditType("Test credit type1");
        creditType2 = new CreditType("Test credit type2");

        creditPrepaymentType1 = new CreditPrepaymentType("Prepayment Allowed", true, 10);
        creditPrepaymentType2 = new CreditPrepaymentType("Prepayment Disallowed", false, 0);

        credit1 = new Credit("Test credit1", creditType1,0,20,12, creditPrepaymentType1, bank);
        credit2 = new Credit("Test credit2",creditType1,100,20,12, creditPrepaymentType2, bank);
        credit3 = new Credit("Test credit3", creditType2,999999999,20,12, creditPrepaymentType1, bank);

        bank.addCreditToList(credit1);
        bank.addCreditToList(credit2);
        bank.addCreditToList(credit3);

        humanClient = new HumanClient("Client", 30, "male");
        humanClient.addBankToList(bank);
    }
}
