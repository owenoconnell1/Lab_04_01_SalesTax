public class Main {
    public static void main(String[] args) {
        final double TAX_RATE = .02;
        double price = 20.5;
        double tax = price * TAX_RATE;
        double total = price + tax;
        System.out.println("Price before tax: $" + price + "\nTax cost: $" + tax + "\nPrice after tax: $" + total);
    }
}