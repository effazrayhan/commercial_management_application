import java.time.LocalDateTime;
public class Main{
    public static void main(String[] args) {
        ContactInfo contactInfo = new ContactInfo("email@email.com", "123456789", "John Doe", "123 Main St", "123-456-7890");
        Product product1 = new Product("Laptop", 999.99, "High performance laptop", 1, "SN123456", 5);
        Product product2 = new Product("Smartphone", 499.99, "Latest model smartphone", 2, "SN654321", 4);
        Order order1 = new Order(101, 1499.98, 10, 
                                  LocalDateTime.now(), 1349.98, new Product[]{product1, product2});
        Order order2 = new Order(102, 499.99, 5, 
                                  LocalDateTime.now(), 474.99, new Product[]{product2});
        Customer customer = new Customer(contactInfo, 1, new Order[]{order1, order2}, 1824.97, 1824.97);  
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Customer Name: " + customer.getContactInfo().getName());
        System.out.println("Total Spent: $" + customer.getTotalSpent());
        System.out.println("Total Amount Due: $" + customer.getTotalAmountDue());
        System.out.println("Orders:");
        for (Order order : customer.getOrders()) {
            System.out.println("  Order ID: " + order.getOrderId());
            System.out.println("  Order Date: " + order.getFormattedOrderDate());
            System.out.println("  Total Amount: $" + order.getTotalAmount());
            System.out.println("  Paid Amount: $" + order.getPaidAmount());
            System.out.println("  Discount: " + order.getDiscount() + "%");
            System.out.println("  Products:");
            for (Product product : order.getProducts()) {
                System.out.println("    Product Name: " + product.getName());
                System.out.println("    Product Price: $" + product.getPrice());
                System.out.println("    Product Description: " + product.getDescription());
                System.out.println("    Product Quantity: " + product.getQuantity());
                System.out.println("    Product Serial Number: " + product.getSerialNo());
            }
        } 

    }    
}