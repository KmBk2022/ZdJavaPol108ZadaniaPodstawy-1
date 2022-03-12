package pl.sdacademy.java.basic.exercises.day3.task9;

public class Order {
    private int currentQuantity;
    private int maxOrderItem;
    private OrderItem[] orderItems;

    public Order(int maxOrderItem) {
        currentQuantity = 0;
        this.maxOrderItem = maxOrderItem;
        orderItems = new OrderItem[maxOrderItem];
    }

    boolean addItem(OrderItem orderItem) {
        if(currentQuantity >= maxOrderItem) {
            System.out.println("Order is full");
            return false;
        }
        if(!orderItem.isCorrect()) {
            System.out.println("Item is incorrect: " + orderItem.getProductName());
            return false;
        }
        orderItems[currentQuantity] = orderItem;
        currentQuantity++;
        return true;
    }

    double getTotalAmount() {
        double totalAmount = 0;
        for(OrderItem element : orderItems) {
            if(element != null) {
                totalAmount += element.getAmount();
            }
        }
        return totalAmount;
    }

    int getItemsCount() {
        int total = 0;
        for(OrderItem element : orderItems) {
            if(element != null) {
                total += element.getQuantity();
            }
        }
        return total;
    }

    void print() {
        for(OrderItem element : orderItems) {
            if(element != null) {
                element.print();
            }
        }
        System.out.println("Total amount: " + getTotalAmount());
        System.out.println("Count: " + getItemsCount());
    }
}
