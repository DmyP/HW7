package com.ep.HW7.Credit;

import com.ep.HW7.NamedEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CreditHistory extends NamedEntity {
    private List<TakenCredit> takenCredits;
    private Integer clientId;

    public CreditHistory(Integer id) {
        super("credit history client No " + id);
        this.takenCredits = new ArrayList<>();
        this.clientId = id;

    }

    public CreditHistory(String name, List<TakenCredit> takenCredits, Integer clientId) {
        super(name);
        this.takenCredits = takenCredits;
        this.clientId = clientId;
    }

    public List<TakenCredit> getTakenCredits() {
        return takenCredits;
    }

    public void setTakenCredits(List<TakenCredit> takenCredits) {
        this.takenCredits = takenCredits;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public void add(Credit credit, Integer clientId) {
        takenCredits.add(new TakenCredit(credit, clientId));
    }

    public void remove(Credit credit, Integer clientId) {
        takenCredits = takenCredits.stream()
                .filter(takenCredit -> takenCredit.getId() != credit.getId())
                .collect(Collectors.toList());
    }
}
