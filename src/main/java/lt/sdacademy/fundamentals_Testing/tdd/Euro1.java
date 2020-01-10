package lt.sdacademy.fundamentals_Testing.tdd;

import java.util.Scanner;

public class Euro1 {
    private double amount;
    public Euro1(int amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return String.format("EUR %.2f", amount);
    }
    public boolean equal(Object o) {
        return o instanceof Euro1 && amount == ((Euro1) o).amount;
    }
    public int subtract(int number){
        return (int) amount-number;
    }
    public int testDivision(Object o) {
        return (int) o;
    }
}

