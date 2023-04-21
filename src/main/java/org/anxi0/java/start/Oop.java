package org.anxi0.java.start;

import java.util.ArrayList;
import java.util.Arrays;

public class Oop {

    public static void main() {
        Q1();
        Q2();
        Q3();
        Q4();
        Q5();
        Q6();
        Q7();
        Q8();
    }

    private static void Q1() {
        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue());
    }

    private static void Q2() {
        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);  // 50 더하기
        cal.add(60);  // 60 더하기
        System.out.println(cal.getValue());
    }

    private static void Q3() {
        Calculator cal = new Calculator();
        System.out.println(cal.isOdd(3));
        System.out.println(cal.isOdd(4));
    }

    private static void Q4() {
        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        Calculator cal = new Calculator();
        System.out.println(cal.avg(data));
    }

    private static void Q5() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size());
    }

    private static void Q6() {
        CalculatorQ6 cal = new CalculatorQ6();
        cal.add(3);  // 여기서 NullPointerException 이 발생한다.
        System.out.println(cal.getValue());
    }

    private static void Q7() {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());
    }

    private static void Q8() {
        Animal a = new Animal();
        Animal b = new Dog();
        Animal c = new Lion();
//        Dog d = new Animal();
        Predator e = new Lion();
    }

}

class Calculator {

    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    boolean isOdd(int val) {
        return !(val % 2 == 0);
    }

    int avg(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.toArray().length;
    }

}

class UpgradeCalculator extends Calculator {

    void minus(int val) {
        this.value -= val;
    }
}

class MaxLimitCalculator extends Calculator {

    @Override
    void add(int val) {
        super.add(val);
        if (this.value + val >= 100) {
            this.value = 100;
        }
    }
}

class CalculatorQ6 {

    Integer value;

    CalculatorQ6() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }
}

interface Mineral {

    int getValue();
}

class Gold implements Mineral {

    @Override
    public int getValue() {
        return 100;
    }
}

class Silver implements Mineral {

    @Override
    public int getValue() {
        return 90;
    }
}

class Bronze implements Mineral {

    @Override
    public int getValue() {
        return 80;
    }
}

class MineralCalculator {

    int value = 0;

    public void add(Mineral mineral) {
        this.value += mineral.getValue();
    }

    public int getValue() {
        return this.value;
    }
}

interface Predator {

}

class Animal {

}

class Dog extends Animal {

}

class Lion extends Animal implements Predator {

}