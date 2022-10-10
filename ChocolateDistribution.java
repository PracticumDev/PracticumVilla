import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistribution {
    public static int findMinimumDiff(int arr[]){
        int m = arr.length;
        Scanner S = new Scanner(System.in);
        System.out.println("*********Java Program for chocolate Distribution Problem to find minimum Diffrence******");
        System.out.print("Please Enter Number of Students : ");
        int num = S.nextInt();
        //if number of students is 0 or number of chocolate pachets is 0 then return 0.
        if(num == 0 || m == 0){
            return 0;
        }
        //Number of students can not be greater then number of packets.
        if(m < num){
            return -1;
        }
        //Sort given array by using sort method
        Arrays.sort(arr);
        //Find the subarray of size equals to number of students such that diffrence between last and first element 
        //of subarray is minimum after shorting.
       int min_diff = Integer.MAX_VALUE;
       for(int i = 0; i+num-1 < m ; i++){
        int diff = arr[i+num-1] - arr[i];
        if(min_diff > diff){
            min_diff = diff;
        }
       }
        return min_diff;
    }

    //Main function........
    public static void main(String[] args) {
        int[] arr = {12,4,7,9,2,23,25,41,30,40,28,42,30,44,48,43,50};
        System.out.println("Minimum Difference is : " + findMinimumDiff(arr));
    }

}



