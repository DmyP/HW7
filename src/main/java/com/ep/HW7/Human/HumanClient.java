package com.ep.HW7.Human;

import com.ep.HW7.Bank.Bank;
import com.ep.HW7.Credit.Credit;
import com.ep.HW7.Credit.CreditHistory;
import com.ep.HW7.Credit.CreditPrepaymentType;
import com.ep.HW7.Credit.CreditType;

import java.util.ArrayList;
import java.util.List;

public class HumanClient extends Human implements Client {
    private List<Bank> clientOfBanks;
    private CreditHistory creditHistory;

    public HumanClient(String name, Integer age, String sex) {
        super(name, age, sex);
        this.creditHistory = new CreditHistory(getId());
        this.clientOfBanks = new ArrayList<>();
    }

    public void addBankToList(Bank bank) {
        this.clientOfBanks.add(bank);
    }

    @Override
    public void acceptCreditOffer(Credit credit) {
        clientOfBanks.add(credit.getBank());
        creditHistory.add(credit, getId());
    }

    @Override
    public void returnLoan(Credit credit) {
        creditHistory.remove(credit, getId());
    }

    @Override
    public List<Credit> getFullCreditsOffer() {
        List<Credit> availableCredits = new ArrayList<>();
        for (Bank bank : clientOfBanks) {
            availableCredits.addAll(bank.makeFullCreditsOffer());
        }
        return availableCredits;
    }

    @Override
    public List<Credit> getFilteredCreditOffer(Integer sum) {
        List<Credit> availableCredits = new ArrayList<>();
        for (Bank bank : clientOfBanks) {
            availableCredits.addAll(bank.makeFilteredCreditOffer(sum));
        }
        return availableCredits;
    }

    @Override
    public List<Credit> getFilteredCreditOffer(CreditType creditType) {
        List<Credit> availableCredits = new ArrayList<>();
        for (Bank bank : clientOfBanks) {
            availableCredits.addAll(bank.makeFilteredCreditOffer(creditType));
        }
        return availableCredits;
    }

    @Override
    public List<Credit> getFilteredCreditOffer(CreditPrepaymentType creditPrepaymentType) {
        List<Credit> availableCredits = new ArrayList<>();
        for (Bank bank : clientOfBanks) {
            availableCredits.addAll(bank.makeFilteredCreditOffer(creditPrepaymentType));
        }
        return availableCredits;
    }

    @Override
    public List<Credit> getFilteredCreditOffer(Integer sum, CreditType creditType, CreditPrepaymentType creditPrepaymentType) {
        List<Credit> availableCredits = new ArrayList<>();
        for (Bank bank : clientOfBanks) {
            availableCredits.addAll(bank.makeFilteredCreditOffer(sum, creditType, creditPrepaymentType));
        }
        return availableCredits;
    }
}
