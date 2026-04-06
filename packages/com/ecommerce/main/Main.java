import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User Name: ");
        String uname = sc.next();

        System.out.print("Enter Address: ");
        String address = sc.next();

        System.out.print("Enter Product Name: ");
        String pname = sc.next();

        System.out.print("Enter Price: ");
        int price = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        User user = new User(uname, address);
        Product product = new Product(pname, price);
        Order order = new Order(user, product, quantity);

        user.display();
        order.printSummary();
    }
}