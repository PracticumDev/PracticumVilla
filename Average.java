import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("*********Program to find Average of given numbers******");
        System.out.println("Enter Number of counts you want to add to calculate average : ");
        int Count = S.nextInt();
        Double Sum = 0.0;
        for(int i = 1; i <= Count; i++){
            System.out.println("Enter number : ");
            Double a = S.nextDouble();
            Sum += a;
        }
        Double ans = Sum/Count;
        System.out.println("Average of given numbers is : " + ans);
    }
}
