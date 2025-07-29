class Customer {
    protected ContactInfo contactInfo;
    protected int customerId;
    protected Order[] orders;
    protected double totalSpent;
    protected double totalAmountDue;

    public Customer(ContactInfo contactInfo, int customerId, Order[] orders, double totalSpent, double totalAmountDue) {
        this.contactInfo = contactInfo;
        this.customerId = customerId;
        this.orders = orders;
        this.totalSpent = totalSpent;
        this.totalAmountDue = totalAmountDue;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Order[] getOrders() {
        return orders;
    }

    public double getTotalSpent() {
        return totalSpent;
    }

    public double getTotalAmountDue() {
        return totalAmountDue;
    }
}