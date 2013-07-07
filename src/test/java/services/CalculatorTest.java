package services;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void testAdd1And1() {
        Calculator sut = new Calculator();
        String actual = sut.add(1, 1);
        assertThat(actual, is("2"));
    }

    @Test
    public void testAdd1And3() {
        Calculator sut = new Calculator();
        String actual = sut.add(1, 3);
        assertThat(actual, is("4"));
    }

    @Test
    public void testSubtract3And1() {
        Calculator sut = new Calculator();
        String actual = sut.subtract(3, 1);
        assertThat(actual, is("2"));
    }

    @Test
    public void testMultiply3And3() {
        Calculator sut = new Calculator();
        String actual = sut.mutiply(3, 3);
        assertThat(actual, is("9"));
    }
    
}
