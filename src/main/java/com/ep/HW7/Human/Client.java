package com.ep.HW7.Human;

import com.ep.HW7.Credit.Credit;
import com.ep.HW7.Credit.CreditPrepaymentType;
import com.ep.HW7.Credit.CreditType;

import java.util.List;

public interface Client {
    List<Credit> getFullCreditsOffer();

    List<Credit> getFilteredCreditOffer(Integer sum);

    List<Credit> getFilteredCreditOffer(CreditType creditType);

    List<Credit> getFilteredCreditOffer(CreditPrepaymentType creditPrepaymentType);

    List<Credit> getFilteredCreditOffer(Integer sum, CreditType creditType, CreditPrepaymentType creditPrepaymentType);

    void acceptCreditOffer(Credit credit);

    void returnLoan(Credit credit);
}
