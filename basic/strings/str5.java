import java.util.*;
public class str5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); int count=0;
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'||(str.charAt(i)>='A'&&str.charAt(i)<='Z')){
                count++;
            }
        }
        System.out.println(count);

    }
}