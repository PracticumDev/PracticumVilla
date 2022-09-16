import java.util.Scanner;

public class ReverseText {
    public static void main(String[] args) {
        System.out.println("********Program for print reverse of given text using java********");
        System.out.println("Please enter Text : ");
        Scanner S = new Scanner(System.in);
        String t = S.nextLine();
        System.out.print("Reverse of " + t + " is : ");
        for(int i = t.length()-1 ; i >= 0 ;i--){
            System.out.print(t.charAt(i));
        }
    }
}
