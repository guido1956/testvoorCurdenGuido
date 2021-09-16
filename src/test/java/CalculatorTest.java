import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    public void addingTwoPositiveNumbers() {
        Calculator calculator = new Calculator();
        String errorMessage = "adding two positive nummers not correct";
        int expectedResult = 41;
        int actualResult = calculator.add(19, 22);
        assertEquals(expectedResult,actualResult, errorMessage );
    }
}