package com.ep.HW7.Bank;

import com.ep.HW7.Credit.Credit;
import com.ep.HW7.Credit.CreditPrepaymentType;
import com.ep.HW7.Credit.CreditType;
import com.ep.HW7.NamedEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bank extends NamedEntity implements CreditOrganisation{
    private List<Credit> availableCredits;

    public List<Credit> getAvailableCredits() {
        return availableCredits;
    }

    public void addCreditToList(Credit credit) {
        this.availableCredits.add(credit);
    }

    public void setAvailableCredits(List<Credit> availableCredits) {
        this.availableCredits = availableCredits;
    }

    public Bank(String name) {
        super(name);
        availableCredits = new ArrayList<>();

    }

    @Override
    public List<Credit> makeFullCreditsOffer() {
        return availableCredits;
    }

    @Override
    public List<Credit> makeFilteredCreditOffer(Integer sum) {
        return availableCredits.stream()
                .filter(credit -> (credit.getMaxSum() <= sum ))
                .collect(Collectors.toList());
    }

    @Override
    public List<Credit> makeFilteredCreditOffer(CreditType creditType) {
        return availableCredits.stream()
                .filter(credit -> (credit.getCreditType().getName().equals(creditType.getName())))
                .collect(Collectors.toList());
    }

    @Override
    public List<Credit> makeFilteredCreditOffer(CreditPrepaymentType creditPrepaymentType) {
        return availableCredits.stream()
                .filter(credit -> (credit.getCreditPrepaymentType().getName().equals(creditPrepaymentType.getName())))
                .collect(Collectors.toList());
    }

    @Override
    public List<Credit> makeFilteredCreditOffer(Integer sum, CreditType creditType, CreditPrepaymentType creditPrepaymentType) {
        return availableCredits.stream()
                .filter(credit -> ( credit.getMaxSum() < sum &
                                    credit.getCreditType().getName().equals(creditType.getName()) &
                                    credit.getCreditPrepaymentType().getName().equals(creditPrepaymentType.getName())))
                .collect(Collectors.toList());
    }
}
