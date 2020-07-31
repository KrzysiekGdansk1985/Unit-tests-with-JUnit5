package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;


public class CalculatorTest {
    @Test
    public void checkSum(){
        Calculator result = new Calculator();

        Assertions.assertEquals(11, result.sum(5, 6));
    }

    @Test
    public void checkDifference(){
        Calculator result = new Calculator();

        Assertions.assertEquals(-1, result.difference(5, 6));
    }

    @Test
    public void checkProduct(){
        Calculator result = new Calculator();

        Assertions.assertEquals(30, result.product(5, 6));
    }

}
