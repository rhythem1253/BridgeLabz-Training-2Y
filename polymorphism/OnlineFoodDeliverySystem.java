abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        setItemName(itemName);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setItemName(String itemName) {
        if (itemName == null || itemName.trim().isEmpty()) throw new IllegalArgumentException("Invalid item name");
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative");
        this.quantity = quantity;
    }

    public String getItemDetails() {
        return itemName + " x" + quantity + " @ " + price;
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discountPercent;

    public VegItem(String name, double price, int qty, double discountPercent) {
        super(name, price, qty);
        setDiscountPercent(discountPercent);
    }

    public void setDiscountPercent(double discountPercent) {
        if (discountPercent < 0) throw new IllegalArgumentException("Discount cannot be negative");
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discountPercent / 100.0);
    }

    @Override
    public double applyDiscount() {
        return getPrice() * getQuantity() * discountPercent / 100.0;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg discount " + discountPercent + "%";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double extraChargePerItem;
    private double discountPercent;

    public NonVegItem(String name, double price, int qty, double extraChargePerItem, double discountPercent) {
        super(name, price, qty);
        setExtraChargePerItem(extraChargePerItem);
        setDiscountPercent(discountPercent);
    }

    public void setExtraChargePerItem(double extraChargePerItem) {
        if (extraChargePerItem < 0) throw new IllegalArgumentException("Extra charge cannot be negative");
        this.extraChargePerItem = extraChargePerItem;
    }

    public void setDiscountPercent(double discountPercent) {
        if (discountPercent < 0) throw new IllegalArgumentException("Discount cannot be negative");
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateTotalPrice() {
        double base = getPrice() * getQuantity();
        double extra = extraChargePerItem * getQuantity();
        double subtotal = base + extra;
        return subtotal - (subtotal * discountPercent / 100.0);
    }

    @Override
    public double applyDiscount() {
        double base = getPrice() * getQuantity();
        double extra = extraChargePerItem * getQuantity();
        double subtotal = base + extra;
        return subtotal * discountPercent / 100.0;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-veg discount " + discountPercent + "%, extra charge " + extraChargePerItem + " per item";
    }
}
