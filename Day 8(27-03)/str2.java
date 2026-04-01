import java.util.*;

class Solution {
    public String firstUniqChar(String s) {

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Loop 2: find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i) + "";
            }
        }

        return "";
    }
}

public class str2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();   // input
        Solution obj = new Solution();

        String result = obj.firstUniqChar(s);

        System.out.println(result);  

        sc.close();
    }
}


/* 

public char demo(String s) {

     int l=s.length();
      int i=0;int c=2;
      for(int j=l-1;j>i;j--){
        if(s.charAt(i)==s.charAt(j)){
            c=1;
            continue;
        }
        
         if(s.charAt(i)!=s.charAt(j)){
            c=0;
            return s.charAt(i);
        }

        i++;
      }
    }

    */