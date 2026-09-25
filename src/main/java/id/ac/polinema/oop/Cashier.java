package id.ac.polinema.oop;

public class Cashier {
    // Ketergantungan (dependency) hanya berupa parameter pada metode
    public double calculateChange(Order order, double cash) {
        double finalTotal = order.getFinalTotal();
        return cash - finalTotal;
    }
}
