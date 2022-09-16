import java.util.*;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("***********Java Program to find maximum subarray with O(n) complexity ********");
        System.out.print("Enter Length Of Array : ");
        int count = S.nextInt();
        ArrayList<Integer> Array = new ArrayList<Integer>();
        //for loop for insert elements in array
        for(int i = 1; i <= count; i++){
            System.out.print("Enter Array[" + (i-1) + "] : ");
            int element = S.nextInt();
            Array.add(element);
        }

        //set first element as max value and start sum;
        int sum = Array.get(0);
        int maxSum = Array.get(0);
        //for loop to find maximum sum of subarray....
        for(int j = 0; j< Array.size()-1; j++){
            sum = Math.max(sum + Array.get(j), Array.get(j));
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println("The Maximum Sum of subArray of Your Array is : " + maxSum);

    }
}
