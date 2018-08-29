package com.compony.client;

public class People  {
    public String name;
    public int credit;
    public int debt;

    public People(String name, int credit,int debt) {
        this.name = name;
        this.credit = credit;
        this.debt = debt;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
