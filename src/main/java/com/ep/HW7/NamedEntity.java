package com.ep.HW7;

public abstract class NamedEntity extends Entity {
    private String name;

    protected NamedEntity(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
