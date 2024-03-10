//3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 

   public class DigitsInIndiger {
   public static void main (String args [])
 {
   int num = 565;
   int sum = 0;
   while (num>0)
   {
    int rem = num % 10;
   // System.out.println (rem);
    num = num /10;
    //System.out.println (num);
   
    sum = (sum + rem);
   }
   System.out.println ( "The digits sum is : " + sum);
 }
} 
