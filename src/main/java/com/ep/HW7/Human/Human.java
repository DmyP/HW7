package com.ep.HW7.Human;

import com.ep.HW7.NamedEntity;

class Human extends NamedEntity {
    private Integer age;
    private String sex;

    public Human(String name, Integer age, String sex) {
        super(name);
        this.age = age;
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
