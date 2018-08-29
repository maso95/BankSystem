package com.compony.bank;

import com.compony.client.People;

public class SberBank implements Banks {

    @Override
    public void giveCredit(People people) {
        people.setDebt(people.getCredit());
        System.out.println(people.getName()+" get Credit, Thanks for using SberBank");
    }

    @Override
    public void percentage() {

    }
}
