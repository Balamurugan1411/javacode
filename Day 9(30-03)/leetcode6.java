import java.util.Scanner;

class Solution {
    public String convert(String s, int numRows) {
        int nr=numRows;
       StringBuilder [] rows = new StringBuilder[nr];
        for(int i =0;i<nr;i++){
            rows[i] = new StringBuilder();

        }
        boolean gu = false;
        int curr = 0;
        for(char c:s.toCharArray()){
            rows[curr].append(c);
            
            if(curr == 0 || curr == nr- 1  ){
                gu = !gu;
            }
            if(gu){
                curr+= 1;
            }
            else{
            curr+= -1;}
           
        }
        StringBuilder ans = new StringBuilder();
        for(StringBuilder r:rows){
            ans.append(r);
        }
        return ans.toString();

    }
}

public class leetcode6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        int n=sc.nextInt();
        Solution c=new Solution();
        System.out.print(c.convert(str,n));

    }
}
