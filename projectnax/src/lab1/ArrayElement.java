package lab1;
import java.util.Scanner;
public class ArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
int[]array=new int[10];
int sum=0;
System.out.println("enter the elemnts:");
for(int i=0;i<10;i++)
{
	array[i]=scanner.nextInt();
}
for(int num : array) {
	sum=sum+sum;
}
System.out.println("sum of array elements is :"+sum);
	}

}
