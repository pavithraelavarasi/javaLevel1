//4. Write a Java program to convert minutes into number of years and days. 

public class MinutesToYears {
	public static void main (String args[])
   {
	int min = 3456789;
	//one year = 24*60*365 = 525600
	int years = min/525600;
	//one day = 24*60 = 1440
	int days = min % 525600 / 1440;
	
	System.out.println ("3456789 minutes is approximately" + " " + years + " years" + " and" + " " + days + " days");
   }
}
