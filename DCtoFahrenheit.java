import java.util.*;

public class DCtoFahrenheit {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please Enter Tempreture in degree : ");
        int val = a.nextInt();
        try {
            if(val > 0){
               int ans = (val*(9/5)) + 32;
               System.out.println("Your Tempreture in Fahrenheight : " + ans);
            }
            else{
                System.out.println("Please enter a valid number");
            }
        } catch (Exception e) {
            System.out.println("Please Enter a valid Number");

        }
    }
}
