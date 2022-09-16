import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("*****Java Program to check either given number is prime or not ********");
        System.out.println("Please enter a number to check : ");
        int num = S.nextInt();
        int f = 0;
        
        if(num == 0 || num == 1){
            System.out.println(num + " is not a prime number");

        }else{
            for(int i = 2; i<=(num/2); i++){
                if(num%i == 0){
                    System.out.println(num + " is Not a prime number");
                    f = 1;
                break;
                }
            }
            if(f == 0){
                System.out.println(num + " is a prime number");
            }
        }
    }
}
