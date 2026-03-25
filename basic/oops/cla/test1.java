
import java.util.*;

class Student{
    int rollNo=1234;
    String name="abc";
    char grade='B';
    int c=50;
}
public class test1 {
    public static void main(String[] args){
      Student s1=new Student();
      System.out.println(s1.rollNo);
      System.out.println(s1.name);
      System.out.println(s1.grade);
      System.out.println(s1.c);
    }
}