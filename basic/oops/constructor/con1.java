import java.util.*;


class Student{
    int rollNo;
    String name=" ";

    Student(){
        System.out.println("from constructor");

    }
}
public class con1 {
    public static void main(String[] args) {
    Student s1=new Student();
    Student s2=new Student();
     System.out.println(s2.name);
    }
    
}
