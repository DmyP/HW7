package com.ep.HW7.Credit;

import com.ep.HW7.Bank.Bank;
import com.ep.HW7.NamedEntity;

public class Credit extends NamedEntity {
    private CreditType creditType;
    private Integer maxSum;
    private Integer interestRate;
    private Integer termMonth;
    private CreditPrepaymentType creditPrepaymentType;
    private Bank bank;

    public Credit(String name, Credit credit) {
        super(name);
        this.creditType = credit.creditType;
        this.maxSum = credit.maxSum;
        this.interestRate = credit.interestRate;
        this.termMonth = credit.termMonth;
        this.creditPrepaymentType = credit.creditPrepaymentType;
        this.bank = credit.bank;
    }

    public Credit(String name, CreditType creditType, Integer maxSum, Integer interestRate, Integer termMonth, CreditPrepaymentType creditPrepaymentType, Bank bank) {
        super(name);
        this.creditType = creditType;
        this.maxSum = maxSum;
        this.interestRate = interestRate;
        this.termMonth = termMonth;
        this.creditPrepaymentType = creditPrepaymentType;
        this.bank = bank;
    }

    public CreditType getCreditType() {
        return creditType;
    }

    public void setCreditType(CreditType creditType) {
        this.creditType = creditType;
    }

    public Integer getMaxSum() {
        return maxSum;
    }

    public void setMaxSum(Integer maxSum) {
        this.maxSum = maxSum;
    }

    public Integer getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Integer interestRate) {
        this.interestRate = interestRate;
    }

    public Integer getTermMonth() {
        return termMonth;
    }

    public void setTermMonth(Integer termMonth) {
        this.termMonth = termMonth;
    }

    public CreditPrepaymentType getCreditPrepaymentType() {
        return creditPrepaymentType;
    }

    public void setCreditPrepaymentType(CreditPrepaymentType creditPrepaymentType) {
        this.creditPrepaymentType = creditPrepaymentType;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
