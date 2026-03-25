

public class m3 {
    int marks;
    static void marks(m3 s){
        s.marks=20;
        System.out.print("inside new fun:"+s.marks);
    }
    public static void main(String[] args){
        m3 s1=new m3();
        s1.marks=50;
        marks(s1);
        System.out.println("in main:"+s1.marks);
    }
}
