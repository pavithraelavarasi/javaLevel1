//2. Write a Java program that reads a number in inches, converts it to meters. 

import java.util.Scanner;
public class InchesToMeter {
   public static void main(String args[])
	{
		System.out.print("Input a value for inch:");
		Scanner in = new Scanner(System.in);
		double inch = in.nextDouble();
		double m =  inch  * 0.0254;
		System.out.println(inch+ " inch is " + m + " meters");
	}
}
