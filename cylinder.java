import java.util.Scanner;
public class cylinder {
    float radius;
    float height;
    cylinder(float radius,float height)
    {
        this.radius = radius;
        this.height = height;
    }
    double volume()
    {
        return 3.14*radius*radius*height;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the radius: \n");
        float radius = scan.nextInt();
        System.out.println("Please enter the height: \n");
        float height = scan.nextInt();
        cylinder cyl1= new cylinder(radius,height);
        System.out.println("Volume is : "+ cyl1.volume());
    }
}
