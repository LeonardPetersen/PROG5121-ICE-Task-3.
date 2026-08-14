package za.ac.iie.prog5121.icetask3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for MarkCalculator.
 */
public class MarkCalculatorTest {

    @Test
    public void calculateTotal_WithValidMarks_ReturnsCorrectTotal() {
        MarkCalculator calculator = new MarkCalculator();

        int actualResult = calculator.calculateTotal(40, 50);

        assertEquals(90, actualResult);
    }

    @Test
    public void calculateAverage_WithValidMarks_ReturnsCorrectAverage() {
        MarkCalculator calculator = new MarkCalculator();

        double actualResult = calculator.calculateAverage(40, 50);

        assertEquals(45.0, actualResult);
    }
}
