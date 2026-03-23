import java.util.*;

public class str4 {
    public static void main(String[] args){
        String str="java programming fundamentals";
        for(char ch:str.toCharArray()){
            System.out.print(ch+" ");
        }

        char[] ch={'a','b','c'};
        String st=new String(ch);
        System.out.println(st);        String[] arr=str.split(" ");
        str=str.replace("java","python");
        System.out.println(str);
        char[] sh={1,2,3};
        String ct=new String(sh);
        System.out.println(ct); 
    }
}
