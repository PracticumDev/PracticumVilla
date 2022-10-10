public class ContainsDuplicate {
    public static boolean isContainsDuplicate(int[] num){
        boolean isFound = false;
        //outer loop for selecting a number for compare
        for(int i = 0; i < num.length ; i++){
            //inner loop for comparing selected element with other elements of array.
            for(int j = i + 1; j < num.length ; j++){
                //Nnow check is two elements are same
                if(num[i] == num[j]){
                    isFound = true;
                    break;
                }
            }
        }


        return isFound;
    }


    //main function to pass arrays
    public static void main(String[] args) {
System.out.println("*********Java Program to check if Array contains Duplicate values **********");


        int[] arr = {1,3,5,7,9};
        System.out.println(isContainsDuplicate(arr));

        //now pass an array containing duplicate elements.
        int[] arr1 = {1,3,5,7,9,1};
        System.out.println(isContainsDuplicate(arr1));

        int[] arr2 = {1,3,5,7,9,9,7};
        System.out.println(isContainsDuplicate(arr2));
    }
}
