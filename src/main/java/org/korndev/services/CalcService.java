package org.korndev.services;

public class CalcService {

    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;
        for (int month = 0; month < 12; month++ ) {
            if (money >= threshold) {
                count++;
                money = money - expenses;
                money = money / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
