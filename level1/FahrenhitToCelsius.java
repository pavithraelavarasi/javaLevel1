//1. Write a Java program to convert temperature from Fahrenheit to Celsius degree. 

import java.util.Scanner;
   public class FahrenhiToCelsius {
       public static void main (String args[])
{         Scanner sc = new Scanner (System.in);
	  System.out.println ("input a degree in fahrenhit");
             float fahrenhit = sc.nextFloat();
             float celsius = ((fahrenhit - 32)*5/9);
	       System.out.println (fahrenhit + " degree fahrenhit is equal to " + celsius + "in celsius");
}
}

