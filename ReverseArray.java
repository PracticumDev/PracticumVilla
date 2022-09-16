public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("****Java Program to Reverse an array using While loop *****");

        //Concept : set start as 0 and last elemnt index as end , now set last element as a first element and 
        //First elemt as a last one, Now increase start by one and decrease end by one while sart is less then end.

        //initialize array ..
        int[] arr = {1,2,3,4,5,6,7,8,9};  // choose randome values ..
        int Start = 0;
        int End = arr.length-1;
        int temp = 0;// Temp variable to set value of temprary data..

        while(Start < End){
            temp = arr[Start];
            arr[Start] = arr[End];
            arr[End] = temp;
            Start = Start + 1;
            End = End - 1;
        }

        //Print reversed array:...
        System.out.println("Reveresed array is : ");
        for(int i = 0; i <= arr.length-1 ; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
