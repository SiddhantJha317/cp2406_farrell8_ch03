package EX05Percentages;
// this program also takes user inputs for percentages
import java.util.Scanner;
public class Percentages2 {
    public static void main (String args[])
    {
        double num1, num2;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a float value : ");
        num1 = kb.nextDouble();
        System.out.print("Enter a second float value : ");
        num2 = kb.nextDouble();
        computePercent(num1, num2);
        computePercent(num2, num1);
    }
    public static void computePercent(double x, double y)
    {
        System.out.println(x + " is " + (x / y) * 100 + " percent of " + y);
    }
}
