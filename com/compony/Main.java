package com.compony;

import com.compony.bank.Banks;
import com.compony.client.People;

import java.util.ArrayList;

import static com.compony.bank.BanksFactory.getBank;
import static com.compony.client.PeopleFactory.newClient;

public class Main {
    public static void main(String[] args) {
        ArrayList<People> p = new ArrayList();


        for (int i = 0; i < 10; i++) {
            p.add(newClient());
        }

        for (People people : p) {
            Banks banks = getBank();
            banks.giveCredit(people);
        }

    }

}

