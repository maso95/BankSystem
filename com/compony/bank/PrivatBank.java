package com.compony.bank;

import com.compony.client.People;

public class PrivatBank implements Banks {

    @Override
    public void giveCredit(People people){
        people.setDebt(people.getCredit());
        System.out.println(people.getName()+" get Credit, Thanks for using PrivatBank");
    }

    @Override
    public void percentage() {

    }
}
