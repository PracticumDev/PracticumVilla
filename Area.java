import java.util.*;

public class Area {
    //1-Square = A= a.pow(2),2-Rectangle = A = a*b,Triangle = (1/2)*b*h,circle= Pi * r.pow(2)
    public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    System.out.println("*******Program to find Area of selected Shap ********");
        System.out.println("Please Choose any option to Find Area");
        System.out.print("1) Square\t");
        System.out.println("2) Rectangle\t");
        System.out.print("3) Triangle\t");
        System.out.println("4) Circle\t");
        int option = S.nextInt();
        Double area = 0.0;
        String text = "";
        switch(option){
            case 1 : System.out.println("Enter side length of Square : ");
            Double x = S.nextDouble();
            area = Math.pow(x, 2);
            text = "Square";
            break;
            case 2 : System.out.println("Please Enter Height of Rectangle : ");
            Double h = S.nextDouble();
            System.out.println("Please Enter width of Rectangle : ");
            Double w = S.nextDouble();
            area = h * w;
            text = "Rectangle";
            break;
            case 3 : System.out.println("Please Enter Height of Triange : ");
            Double a = S.nextDouble();
            System.out.println("Please Enter breadth of Triange : ");
            Double b = S.nextDouble();
            area = a*b/2;
            text = "Triangle";
            break;
            case 4 : System.out.println("Please Enter radius of Circle : ");
            Double r = S.nextDouble();
            area = 3.14 * Math.pow(r, 2);
            text = "Circle";
            break;
            default : System.out.println("Invalid value");
            break;


        };
            System.out.println("The Area of " + text + " is : " + area);
    }

   
    
}
