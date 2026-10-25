
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CartCalculatorTest {

    private final CartCalculator calculator = new CartCalculator();

    @Test
    void testCartTotal() {
        assertEquals(2000.0, calculator.calculateTotal(1000.0, 2), 0.01);
    }

    @Test
    void testDiscount() {
        assertEquals(200.0, calculator.calculateDiscount(2000.0), 0.01);
    }

    @Test
    void testTax() {
        assertEquals(180.0, calculator.calculateTax(1000.0), 0.01);
    }

    @Test
    void testFinalAmount() {
        assertEquals(2124.0, calculator.calculateFinalAmount(1000.0, 2), 0.01);
    }
}
