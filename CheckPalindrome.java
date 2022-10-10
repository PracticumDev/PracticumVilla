

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("*******Java Program to check Palindrome*******");
        System.out.print("Please Enter your String/ Number to check : ");
        String str = S.nextLine();
        //Firstly remove all non-alphanumeric values... for example white spaces.
        String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
        String Temp = "";
        for(int i = str1.length()-1; i >= 0 ; i--){
            Temp += str1.charAt(i);
        }
        if(Temp.equals(str1)){
            System.out.println(str + " is a Palindrome");

        }
        else{
            System.out.println(str + " is not a Palindrome");
        }
       
    }
}
