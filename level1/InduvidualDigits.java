//10. Write a Java program to break an integer into a sequence of individual digits. 

/*public class InduvidualDigits {
	public static void main (String args[])
   {
       int num = 123456;
       int no1 = num /100000 %10;
       int no2 = num/10000 % 10;
       int no3 = num/1000 % 10;
       int no4 = num/100 % 10;
       int no5 = num/10 % 10;
       int no6 = num % 10;
        System.out.println (no1 + " " + no2 + " " + no3 +" " + no4 + " " + no5 + " " + no6); 
   }
}*/
// Other Method 
// just shows the count of the digits
import java.util.Scanner;
class InduvidualDigits {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number");
        int number = sc.nextInt();
        int count= 0;
        while(number > 0)
        {
             int digit = number % 10;
              count++;
              System.out.print(digit + " ");  // print the numbers in reverse
            number = number/10;
        }
        System.out.println("Total sum of the digits - " + count);
    }
}
