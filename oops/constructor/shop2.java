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
   public double getTotalPrice(){
       return (double)price*quantity;
    }
    public void display(){
        System.out.println("ID:"+id);
        System.out.println("name:"+name);
        System.out.println("price:"+price);
        System.out.println("quantity:"+quantity);
        System.out.println("Total price:"+getTotalPrice());
    }
   
}
public class shop2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       product[] p1=new product[n];
       int grand_total=0;
       for(int i=0;i<n;i++){
        System.out.print("Enter id of product"+i+":");
             int id=sc.nextInt();
            System.out.print("name:");
             String name=sc.next();
        System.out.print("price:");
         double price=sc.nextDouble();
        System.out.print("quantity:");
        int quantity=sc.nextInt();
        
        p1[i]=new product(id, name, price, quantity);
        grand_total+=p1[i].getTotalPrice();

       }

        for(int i=0;i<n;i++){
            System.out.println("----------------------------");
            p1[i].display();
           System.out.println("----------------------------");
        }
        System.out.println("grand total"+grand_total);
    }
    
  
}
