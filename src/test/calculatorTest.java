package test;

import main.calculator;
import org.junit.jupiter.api.BeforeEach;

public class calculatorTest {
    calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new calculator();
    }

    @Test
    void testMultiply(){
        assertEquals(20, calculator.multiply(4,5), "Regular multiplication should work");
    }

}
