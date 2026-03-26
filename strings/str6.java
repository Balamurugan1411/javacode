import java.util.*;
public class str6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); int count=0;
        String str=sc.nextLine();
       String[] arr=str.split("[^a-zA-z]");

       System.out.println(arr.length);


    }
}

/*
static {
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
        try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
            fw.write("0");
        } catch (Exception e) {
        }
    }));
    }

} */


