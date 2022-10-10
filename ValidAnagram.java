
import java.util.*;
public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println("*******Java Program To Check Whether Given Two Strings Are Anagram of Each Other ******");
        Scanner S = new Scanner(System.in);
        System.out.print("Enter First String : ");
        String str1 = S.nextLine();
        System.out.print("Enter Second String : ");
        String str2 = S.nextLine();
        //Convert given strings to char array by using toCharArray() method.
        char arr_str1[] = str1.toCharArray();
        char arr_str2[] = str2.toCharArray();
        //now Sort both arrays using Arrays.sort() method.
        Arrays.sort(arr_str1);
        Arrays.sort(arr_str2);
        boolean isErr = false;
        //Check whether both strings having same length 
        //if not , then return isErr = true;
       
        if(str1.length() == str2.length()){
            //For loop to check both strings contains same elements at same possitions..
          for(int i = 0; i < str1.length(); i++){
            if(arr_str1[i] != arr_str2[i]){
                isErr = true;
            }
          }
        }
            else{
                isErr = true;
            }
   //If isErr is true then Given Strings are not a Valid Anagram of each other.
   if(isErr){
    System.out.println(str1 + " and " + str2 + " are not a Valid Anagram of each other.");
   }
   else{
    System.out.println(str1 + " and " + str2 + " are a Valid Anagram of each other.");
   }
    }
}
