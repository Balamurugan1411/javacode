import java.util.*;

class product{
    int id;
    String name;
    double price;
    int quantity;

    product(int id,String name,double price,int quantity){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        
    }
   public double getTotalPrice(double price,int quantity){
       return (double)price*quantity;
    }
    public void display(){
        System.out.println("ID:"+id);
        System.out.println("name:"+name);
        System.out.println("price:"+price);
        System.out.println("quantity"+quantity);
        System.out.println("Total price:"+getTotalPrice(price,quantity));
    }
   
}
public class shop {
    public static void main(String[] args) {
        product p1=new product(1011,"abc",450,5);
        p1.display();

    }
    
  
}
