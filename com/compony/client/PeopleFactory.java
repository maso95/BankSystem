package com.compony.client;

public class PeopleFactory {

    public static People newClient() {
        People p = new People(returnName(), returnCredit(), 0);
        return p;
    }

    public static String returnName() {
        int randomNumb = (int) (Math.random() * 100);
        if (randomNumb < 15) {
            return "Jim";
        } else if (randomNumb < 30) {
            return "Bob";
        } else if (randomNumb < 45) {
            return "John";
        } else if (randomNumb < 60) {
            return "Nick";
        } else {
            return "Rick";
        }
    }

    public static int returnCredit() {
        int randomNumb = (int) (Math.random() * 100);
        if (randomNumb < 15) {
            return 1000;
        } else if (randomNumb < 30) {
            return 5000;
        } else if (randomNumb < 45) {
            return 10000;
        } else if (randomNumb < 60) {
            return 20000;
        } else {
            return 30000;
        }
    }
}
