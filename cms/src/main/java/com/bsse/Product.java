class Product {
    protected String name;
    protected double price;
    protected String description;
    protected int id;
    protected String serialNo;
    protected int quantity;

    public Product(String name, double price, String description, int id, String serialNo, int quantity) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.id = id;
        this.serialNo = serialNo;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        if (description.equals(""))
            return "";
        return description;
    }

    public int getId() {
        return id;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}