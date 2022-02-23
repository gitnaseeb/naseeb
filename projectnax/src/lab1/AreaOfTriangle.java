package lab1;
import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the width of the triangle:");
double base=scanner.nextDouble();
System.out.println("Enter the height of the triangle:");
double height=scanner.nextDouble();
double area =(base*height)/2;
System.out.println("Area of Triangle is:"+area);

	}

}
