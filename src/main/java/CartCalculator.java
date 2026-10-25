
public class CartCalculator {

    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    public double calculateDiscount(double total) {
        return total * 0.10;
    }

    public double calculateTax(double amount) {
        return amount * 0.18;
    }

    public double calculateFinalAmount(double price, int quantity) {
        double total = calculateTotal(price, quantity);
        double discount = calculateDiscount(total);
        double tax = calculateTax(total - discount);

        return total - discount + tax;
    }
}
