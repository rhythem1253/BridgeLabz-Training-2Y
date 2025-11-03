abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        setProductId(productId);
        setName(name);
        setPrice(price);
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setProductId(int productId) {
        if (productId <= 0) throw new IllegalArgumentException("Invalid productId");
        this.productId = productId;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
        this.price = price;
    }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double discountPercent;
    private double taxPercent;

    public Electronics(int id, String name, double price, double discountPercent, double taxPercent) {
        super(id, name, price);
        setDiscountPercent(discountPercent);
        setTaxPercent(taxPercent);
    }

    public void setDiscountPercent(double discountPercent) {
        if (discountPercent < 0) throw new IllegalArgumentException("Discount cannot be negative");
        this.discountPercent = discountPercent;
    }

    public void setTaxPercent(double taxPercent) {
        if (taxPercent < 0) throw new IllegalArgumentException("Tax cannot be negative");
        this.taxPercent = taxPercent;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountPercent / 100.0;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxPercent / 100.0;
    }

    @Override
    public String getTaxDetails() {
        return "Tax " + taxPercent + "% for electronics";
    }
}

class Clothing extends Product implements Taxable {
    private double discountAmount;
    private double taxPercent;

    public Clothing(int id, String name, double price, double discountAmount, double taxPercent) {
        super(id, name, price);
        this.discountAmount = discountAmount;
        setTaxPercent(taxPercent);
    }

    public void setTaxPercent(double taxPercent) {
        if (taxPercent < 0) throw new IllegalArgumentException("Tax cannot be negative");
        this.taxPercent = taxPercent;
    }

    @Override
    public double calculateDiscount() {
        return discountAmount;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxPercent / 100.0;
    }

    @Override
    public String getTaxDetails() {
        return "Tax " + taxPercent + "% for clothing";
    }
}

class Groceries extends Product {
    private double discountAmount;

    public Groceries(int id, String name, double price, double discountAmount) {
        super(id, name, price);
        this.discountAmount = discountAmount;
    }

    @Override
    public double calculateDiscount() {
        return discountAmount;
    }
}
