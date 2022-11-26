package ru.netology;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );
        IntsCalculator instCalc = new IntsCalculator();
        System.out.println(instCalc.sum(2, 6));
        System.out.println(instCalc.mult(3, 5));
        System.out.println(instCalc.pow(2, 4));
    }
}
