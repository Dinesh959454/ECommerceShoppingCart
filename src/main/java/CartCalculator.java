
public class CartCalculator {

    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    public double calculateDiscount(double total, double discountRate) {
        return total * discountRate / 100;
    }

    public double calculateTax(double amount) {
        return amount * 0.18;
    }

    public double calculateFinalAmount(double price, int quantity) {
        double total = calculateTotal(price, quantity);
        double discount = calculateDiscount(total, 10);
        double tax = calculateTax(total - discount);
        return total - discount + tax;
    }
}
