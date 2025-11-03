class Order {
    int orderId;
    String orderDate;

    String getOrderStatus() {
        return "Order placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    @Override
    String getOrderStatus() {
        return "Order shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    @Override
    String getOrderStatus() {
        return "Order delivered";
    }
}
