import java.util.*;
class Product{
    int id;
    String name;
    double price;
    int quantity;
    Product(int id , String name,double price,int quantity){
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }
    public  double gettotalprice(){
        return price*quantity;
    }
    public void display(){
        System.out.print(name+" ");
        System.out.print(quantity  );
    }
   
}
public class shop23 {
     public static double grandtotal(Product[] p){
        double tot = 0;
        for(int i =0;i<p.length;i++){
            tot+= p[i].price;
        }
        return tot;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        Product[] cart = new Product[n];
        for(int i = 0;i<n;i++){
            System.out.print("give details\n id \nname\nprice\nquantity");
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();

            cart[i] = new Product(id,name,price,quantity);

        }
        System.out.print("Product name   quantity  total price ");
        for(int i=0;i<n;i++){

            cart[i].display();
            System.out.print(cart[i].gettotalprice() );
            System.out.println(" ");
        }
        grandtotal(cart);
        
    }
}
