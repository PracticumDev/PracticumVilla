import java.util.*;
public class PrimeNumberList {
    public static void main(String[] args) {
        System.out.println("**********Java Program to Print List Of Prime Numbers Between Two Numbers ********");
        Scanner S = new Scanner(System.in);
        System.out.print("Please Enter First Number : ");
        int num1 = S.nextInt();
        System.out.print("Please Enter Second Number : ");
        int num2 = S.nextInt();
        System.out.println("List of Prime Numbers Between " + num1 + " and " + num2 +" is :");
        for(int i = num1; i <= num2; i++){
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num){
        boolean flag = true;
     //Skip 0 and 1 as they both are prime numbers
     if(num == 0 || num == 1){
            flag = true;
     }else{
        for(int j = 2 ; j <= num/2 ; j++){
            if(num%j == 0){
                flag = false;
            }
        }
     }
       return flag;
    }
}
