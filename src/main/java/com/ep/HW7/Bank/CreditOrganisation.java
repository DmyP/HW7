package com.ep.HW7.Bank;

import com.ep.HW7.Credit.Credit;
import com.ep.HW7.Credit.CreditPrepaymentType;
import com.ep.HW7.Credit.CreditType;

import java.util.List;

public interface CreditOrganisation {
    List<Credit> makeFullCreditsOffer();

    List<Credit> makeFilteredCreditOffer(Integer sum);

    List<Credit> makeFilteredCreditOffer(CreditType creditType);

    List<Credit> makeFilteredCreditOffer(CreditPrepaymentType creditPrepaymentType);

    List<Credit> makeFilteredCreditOffer(Integer sum, CreditType creditType, CreditPrepaymentType creditPrepaymentType);
}
