package lab1;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float first =2.50f , second =4.50f;
System.out.println("--Before swap--");
System.out.println("first number ="+ first);
System.out.println("second number ="+second);
float temporary = first ;
first = second;
second= temporary;
System.out.println("--After swap--");
System.out.println("first number ="+first);
System.out.println("second number="+second);

  
	}

}
