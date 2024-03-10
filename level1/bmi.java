import java.util.Scanner;

public class bmi {
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println ("input Weight in pounds");
		double wei = sc.nextDouble();
		System.out.println ("input Height in inches");
		double hei = sc.nextDouble();
		double bmi =(wei*703) / (hei * hei);
	
		System.out.print ("Body mass index : " + bmi);
}
}

