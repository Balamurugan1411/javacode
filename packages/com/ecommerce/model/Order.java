public class Order {
    User user;
    Product product;
    int quantity;

    Order(User user, Product product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    void printSummary() {
        System.out.println("\n----- ORDER SUMMARY -----");
        System.out.println("User: " + user.name);
        System.out.println("Product: " + product.name);
        System.out.println("Price: " + product.price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + (product.price * quantity));
    }
}