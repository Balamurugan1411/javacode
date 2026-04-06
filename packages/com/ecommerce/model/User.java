public class User {
    String name;
    String address;

    User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
