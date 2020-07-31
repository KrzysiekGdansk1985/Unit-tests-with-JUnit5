package calculator;

import calculator.Calculator;

public class Test {
    public static void main(String[] args) {
        Calculator result = new Calculator();
        System.out.println(result.sum(3, 5));
        System.out.println(result.difference(3, 5));
        System.out.println(result.product(3, 5));
        result.quotient(3, 5);
        result.quotient(3, 0);
    }

}
