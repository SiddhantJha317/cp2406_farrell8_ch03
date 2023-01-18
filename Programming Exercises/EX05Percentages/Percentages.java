package EX05Percentages;
// this program has predefined numbers for percentages
public class Percentages {
    public static void main (String args[])
    {
        double numa = 7.0, numb = 3.0;
        computePercent(numa, numb);
        computePercent(numa, numb);
    }
    public static void computePercent(double x, double y)
    {
        System.out.println(x + " and " + (x / y) * 100 + " percent of " + y);
    }
}
