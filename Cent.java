import java.util.Scanner;
public class Cent {
    double centimeter;
    int foot;
    double inches;
    int cent2foot()
    {
        inches = centimeter/2.54;
        foot = (int) inches/12;
        return foot;
    }
    float cent2inches()
    {
        float remaining_inches = (float) inches%12;
        return remaining_inches;
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value in cm: ");
        Cent centi = new Cent();
        centi.centimeter = scan.nextFloat();
        System.out.println("Equivalent value in foot is : " + centi.cent2foot()+" Foot "+ String.format("%.1f",centi.cent2inches())+ " Inches");
    }
}
