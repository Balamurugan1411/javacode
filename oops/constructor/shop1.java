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
public class shop1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] id=new int[n];
         String[] name=new String[n];
         double[] price=new double[n];
         int[] quantity=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter id of product:");
             id[i]=sc.nextInt();
            System.out.println("name:");
             name[i]=sc.next();
        System.out.println("price:");
         price[i]=sc.nextDouble();
        System.out.println("quantity:");
        quantity[i]=sc.nextInt();
       
        }
        for(int i=0;i<n;i++){
            product p1=new product(id[i], name[i], price[i], quantity[i]);
         p1.display();
        }
       

    }
    
  
}
