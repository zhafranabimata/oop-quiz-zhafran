package id.ac.polinema.oop;

public class Order {
    private Customer customer;
    private OrderItem[] items;
    private int itemCount;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new OrderItem[10];
        this.itemCount = 0;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void addItem(MenuItem item, int quantity) {
        if (itemCount < 10) {
            items[itemCount] = new OrderItem(item, quantity);
            itemCount++;
        } else {
            System.out.println("Order penuh! Maksimal 10 item.");
        }
    }

    public int getItemCount() {
        return this.itemCount;
    }

    public double getTotal() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getSubtotal();
        }
        return total;
    }

    public double getFinalTotal() {
        
        return getTotal();
    }
}
