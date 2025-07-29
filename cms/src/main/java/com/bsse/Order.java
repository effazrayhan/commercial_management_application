import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Order {

    protected int orderId;
    protected double totalAmount;
    protected double discount; // percentage
    protected LocalDateTime orderDate;
    protected double paidAmount;
    protected Product[] products;

    public Order(int orderId, double totalAmount, double discount, LocalDateTime orderDate, double paidAmount,
            Product[] products) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.discount = discount;
        this.orderDate = orderDate;
        this.paidAmount = paidAmount;
        this.products = products;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getDiscount() {
        return discount;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String getFormattedOrderDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return orderDate.format(formatter);
    }
}