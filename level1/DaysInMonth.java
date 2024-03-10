import java.util.Scanner;
 public class DaysInMonth {
  public static void main (String args[])
  {
    int No_of_DaysInMonth = 0;
    String MonthName = " ";
    Scanner sc = new Scanner (System.in);
    System.out.println ("Input a month number");
    int month = sc.nextInt();
    System.out.println ("Input a year");
    int year = sc.nextInt();
      switch (month)
     {
       case 1 : MonthName = "January";
		No_of_DaysInMonth = 31;break;
       case 2 : MonthName = "February";
	  if (year%4==0)
	     {
		No_of_DaysInMonth = 29;
	     }
	  else
	     {
	       No_of_DaysInMonth = 28;
	     } 
	 break;
       case 3 : MonthName = "March";
		No_of_DaysInMonth = 31;break;
       case 4 : MonthName = "April";
		No_of_DaysInMonth = 30;break;
       case 5 : MonthName = "May";
		No_of_DaysInMonth = 31;break;
       case 6 : MonthName = "June";
		No_of_DaysInMonth = 30;break;
       case 7 : MonthName = "July";
		No_of_DaysInMonth = 31;break;
       case 8 : MonthName = "August";
		No_of_DaysInMonth = 31;break;
       case 9 : MonthName = "September";
		No_of_DaysInMonth = 30;break;
       case 10 : MonthName = "October";
		No_of_DaysInMonth = 31;break;
       case 11 : MonthName = "November";
		No_of_DaysInMonth = 30;break;
       case 12 : MonthName = "December";
		No_of_DaysInMonth = 31;break;
       default:System.out.println("Invalid Month");
      }
       System.out.println (MonthName +" " + year+" "+"has" + " " + No_of_DaysInMonth +" " + "days");
     }
 }
