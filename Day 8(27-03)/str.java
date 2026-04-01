import java.util.*;
public class str{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();
        int l=str.length();
        String st="";
        for(int i=0;i<l;i++){
            if(i%2==0){
                st=st+(str.charAt(i));
            }
        }

        for(int i=0;i<l;i++){
            if(i%2!=0){
                st=st+(str.charAt(i));
            }
        }

        System.out.print(st);
    }
}

/*

StringBuilder st = new StringBuilder();

for(int i=0;i<l;i++){
    if(i%2==0){
        st.append(str.charAt(i));
    }
}

for(int i=0;i<l;i++){
    if(i%2!=0){
        st.append(str.charAt(i));
    }
}


 */