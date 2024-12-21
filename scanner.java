package day2;
import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		System.out.print("Hello world");
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter the redius");
		 int r=sc.nextInt();
		 System.out.println("Area of circle=" + ((22/7)*r*r));
		 
		 System.out.println("enter the height");
		 int h=sc.nextInt();
		 System.out.println("enter the base");
		 int b=sc.nextInt();
		 System.out.println("Area of triangle=" + ((1/2)*b*h));
		 
		 
		 System.out.println("enter the width");
		 int w=sc.nextInt();
		 System.out.println("enter the legnth");
		 int l=sc.nextInt();
		 System.out.println("Area of rectangle=" + (l*w));
		 
		 
		 System.out.println("enter the diameter");
		 int d=sc.nextInt();
		 System.out.println("circumference of circle=" + ((22/7)*d));
		 
	}

}
