import java.util.*;
class User{
    String name;
    String phone;
    String address;
    String role="user";
    User(){
        System.out.println("By using Super");
    }
    User(String name){
        this.name=name;
        System.out.println("User created");
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("role: "+role);
    }
}
class Driver extends User{
    String role="Driver";
    String vehicle;
    Driver(String name,String vehicle){
        super(name);
        this.vehicle=vehicle;
    }
    void displayDriver(){
        super.display();
        System.out.println("vehicle "+vehicle);
        System.out.println("Driver class role:"+role);
        System.out.println("User class role:"+super.role);
    }
}
public class vehicle {
    public static void main(String[] args){
        Driver D=new Driver("Abc","Bike");
        D.displayDriver();
    }
}