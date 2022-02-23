package lab1;
import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scanner = new Scanner(System.in);
System.out.println("Enter the radius");
double radius = scanner.nextDouble();
double area =Math.PI*(radius*radius);
System.out.println("The area of circle is:"+area);
double circumference= Math.PI*2*radius;
System.out.println("The circumfernce of the circle is :"+circumference);




	}

}
