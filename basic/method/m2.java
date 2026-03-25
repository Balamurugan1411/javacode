public class m2 {
    static void change(int s){
        s=20;
        System.out.println("inside method:"+s);
    }
    public static void main(String[] args){
        int s=10;
        change(s);
        System.out.println("inside main:"+s);
    }
}
