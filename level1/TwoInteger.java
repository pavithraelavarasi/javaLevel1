//9. Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers). 

public class TwoInteger {
	public static void main (String arg[])
   {   
	int firstInt = 25;
	int secondInt = 5;
	int sum = firstInt + secondInt;
	int difference = firstInt - secondInt;
	int product = firstInt*secondInt;
	int average = firstInt+secondInt/2;
	int distance = firstInt / secondInt;
          System.out.println ("sum of two integers " + sum);
	  System.out.println ("difference of two integers " + difference);
	  System.out.println ("product of two integers " + product);
	  System.out.println ("average of two integers " + average);
	  System.out.println ("Distance of two integers " + distance);
	  int max = firstInt >secondInt ? firstInt:secondInt;
	  System.out.println ("Max integer _ " + max);
	  int min = firstInt < secondInt ?firstInt :secondInt;
	  System.out.println ("min integer _" +min);
   }
}
