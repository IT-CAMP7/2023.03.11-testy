package pl.camp.it.testy;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    static Calculator calculator = new Calculator();

    public CalculatorTest() {
        System.out.println("Konstruktor klasy testujacej !!");
    }

    @BeforeEach
    public void prepare() {
        System.out.println("Przygotowanie do testu !!");
    }

    @AfterEach
    public void clean() {
        System.out.println("Sprzatanie po tescie !!");
    }

    @BeforeAll
    public static void prepareForAllTestes() {
        System.out.println("Przygotowuje dane do wszystkich testow !!");
    }

    @AfterAll
    public static void cleanAfterAllTests() {
        System.out.println("Sprzatanie po wszystkich testach !!");
    }

    @Test
    //@Disabled
    public void addTwoPositivesTest() {
        int a = 5;
        int b = 7;
        int expectedResult = 12;

        int actual = calculator.add(a, b);

        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    public void addPositiveAndZeroTest() {
        int a = 5;
        int b = 0;
        int expectedResult = 5;

        int actual = calculator.add(a, b);

        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    public void addPositiveAndNegativeTest() {
        int a = 5;
        int b = -6;
        int expectedResult = -1;

        int actual = calculator.add(a, b);

        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    public void addNegativeAndZeroTest() {
        int a = -5;
        int b = 0;
        int expectedResult = -5;

        int actual = calculator.add(a, b);

        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    public void addTwoNegativesTest() {
        int a = -5;
        int b = -4;
        int expectedResult = -9;

        int actual = calculator.add(a, b);

        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    public void addTwoZerosTest() {
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        int actual = calculator.add(a, b);

        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    public void addBigValuesTest() {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        Assertions.assertThrows(TooBigArgumentsException.class, () -> calculator.add(a, b));

        /*try {
            calculator.add(a,b);
        } catch (TooBigArgumentsException e) {
            return;
        }
        Assertions.fail();*/
    }

    @Test
    public void addLowValuesTest() {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        Assertions.assertThrows(TooBigArgumentsException.class, () -> calculator.add(a,b));
    }

    @Test
    public void multiplyTwoPositivesTest() {
        int a = 5;
        int b = 6;
        int expectedResult = 30;

        int actual = calculator.multiply(a,b);

        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    public void multiplyTwoNegativesTest() {
        int a = -5;
        int b = -6;
        int expectedResult = 30;

        int actual = calculator.multiply(a,b);

        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    public void multiplyPositiveAndZeroTest() {
        int a = 5;
        int b = 0;
        int expectedResult = 0;

        int actual = calculator.multiply(a,b);

        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    public void multiplyNegativeAndZeroTest() {
        int a = -5;
        int b = 0;
        int expectedResult = 0;

        int actual = calculator.multiply(a,b);

        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    public void multiplyTwoZerosTest() {
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        int actual = calculator.multiply(a,b);

        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    public void divideTwoPositivesTest() {
        int a = 10;
        int b = 2;
        int expectedResult = 5;

        double actual = calculator.divide(a,b);

        Assertions.assertEquals(expectedResult, actual);
    }

    @Test
    public void divideWithDecimalResultTest() {
        int a = 10;
        int b = 3;
        double expectedResult = 3.333;

        double actual = calculator.divide(a,b);

        Assertions.assertEquals(expectedResult, actual, 0.001);
    }

    @Test
    public void divideByZeroTest() {
        int a = 2;
        int b = 0;

        Assertions.assertThrows(DivideByZeroException.class, () -> calculator.divide(a,b));
    }
}
