package test;

import main.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.security.InvalidParameterException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class calculatorTest {
    calculator calculator = new calculator();


    @Test
    public void testMultiply(){
        assertEquals("Testing",20 ,calculator.multiply(4, 5), 0.000000001d);
    }

}
