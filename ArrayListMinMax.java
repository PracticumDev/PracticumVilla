
import java.util.*;
public class ArrayListMinMax {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("*****Java Program to find Min and Max value present in a array using Array List*****");
        System.out.print("Please Enter number of Elements in array : ");
        int count = S.nextInt();
       ArrayList<Integer>arr = new ArrayList<Integer>();
        for(int i = 1 ; i<= count ; i++){
        System.out.println("Enter Element " + i + " : ");
        int a = S.nextInt();
        arr.add(a);
        }
        //Set 1st and second element of array as in and max 
        //and Statrt comaring from 3rd elemnet
        int min = arr.get(0);
        int max = arr.get(1);
        //if min is greater then max then replace both of them
        if(min > max ){
            min = arr.get(1);
            max = arr.get(0);
        }
        for(int j = 2; j <= arr.size()-1 ; j++){
            if(min > arr.get(j)){
                min = arr.get(j);
            }
            if(max < arr.get(j)){
                max = arr.get(j);
            }
        }
        System.out.println("Your Array is : " + arr);
        System.out.println("where Minimum value is : " + min);
        System.out.println("and Maximum value is : " + max);
    }
}
