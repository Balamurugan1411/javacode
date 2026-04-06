import packages.com.java.ecommerce.*;

// Usually, class names should be PascalCase (OrderDetails)
public class orderdetails {
    
    public String name;
    public String address;
    public int quantity;

    public OrderDetails(String n, String ad, int qu) {
        this.name = n;
        this.address = ad;
        this.quantity = qu;
    }

    public static void main(String[] args) {
        // We create an INSTANCE of the class
        OrderDetails myOrder = new OrderDetails("John Doe", "123 Java Lane", 5);

        // Now we access the variables through that instance
        System.out.println("Name: " + myOrder.name);
        System.out.println("Address: " + myOrder.address);
        System.out.println("Quantity: " + myOrder.quantity);
    }
}

