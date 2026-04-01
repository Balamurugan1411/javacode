import java.util.*;
public class count{    
    public static int[] findLargestSubarray(int[] arr) {
        int max = 0;
        int maxi = 0;
        int maxj = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0; // RESET for each subarray

                for (int k = i; k <= j; k++) {
                    if (arr[k] == 1) {
                        sum += 1;
                    } else {
                        sum -= 1;
                    }
                }
                if (sum == 1) { // condition here
                    if (max < j - i + 1) {
                        max = j - i + 1;
                        maxi = i;
                        maxj = j;
                    }
                }
            }
        }
        int[] nums = new int[max];
        int ind = 0;

        for (int i = maxi; i <= maxj; i++) {
            nums[ind++] = arr[i];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,1};
        System.out.println(Arrays.toString(findLargestSubarray(arr)));
    }
}