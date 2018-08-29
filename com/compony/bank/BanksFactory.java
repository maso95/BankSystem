package com.compony.bank;

public class BanksFactory {
    public static Banks getBank(){
        OBS obs = new OBS();
        PrivatBank privatBank = new PrivatBank();
        SberBank sberBank = new SberBank();
        int randomNumb = (int) (Math.random() * 100);

        if (randomNumb < 30) {
            return privatBank ;
        }
        if (randomNumb < 60) {
            return obs;
        } else {
            return sberBank;
        }
    }
}
