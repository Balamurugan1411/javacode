import java.util.*;
public class str1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

       StringBuilder st=new StringBuilder();
    int l=str.length();
    for(int i=0;i<=l;i++){
        if(i==l||str.charAt(i)==' '){
            if((st.length()%2==0)&&st.length()>0){
                System.out.print(st+" ");
            }
            st.setLength(0);
        }
       else{
        st.append(str.charAt(i));
       } 
    }
    }
}
/* public class str1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int l = str.length();
        int c = 0;

        // Count words
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) != ' ' && (i == 0 || str.charAt(i - 1) == ' ')) {
                c++;
            }
        }

        String[] st = new String[c];

        // Extract words
        int wordIndex = 0;
        String temp = "";

        for (int i = 0; i < l; i++) {
            if (str.charAt(i) != ' ') {
                temp += str.charAt(i);
            } else {
                if (!temp.equals("")) {
                    st[wordIndex++] = temp;
                    temp = "";
                }
            }
        }

        // Last word (important)
        if (!temp.equals("")) {
            st[wordIndex] = temp;
        }

        // Print even index words
        for (int i = 0; i < c; i++) {
            if (i % 2 == 0) {
                System.out.print(st[i] + " ");
            }
        }
    }
}
    
*/
