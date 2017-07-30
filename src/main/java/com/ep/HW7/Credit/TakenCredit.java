package com.ep.HW7.Credit;

public class TakenCredit extends Credit {
    private Integer leftToPay;
    private Boolean paymentsInTerm;
    private Integer clientId;

    public TakenCredit(Credit credit, Integer clientId) {
        super(credit.getName(), credit);
        this.leftToPay = credit.getMaxSum();
        this.paymentsInTerm = true;
        this.clientId = clientId;
    }

    public Integer getLeftToPay() {
        return leftToPay;
    }

    public void setLeftToPay(Integer leftToPay) {
        this.leftToPay = leftToPay;
    }

    public Boolean getPaymentsInTerm() {
        return paymentsInTerm;
    }

    public void setPaymentsInTerm(Boolean paymentsInTerm) {
        this.paymentsInTerm = paymentsInTerm;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
}
