import java.util.Scanner;
import java.util.ArrayList;
public class DistanceConverter2
	{
		public static void distanceConverter2()
		{
		 Scanner userInput_int = new Scanner(System.in);
		 Scanner userInput_String = new Scanner(System.in);
		 Scanner userInput_double = new Scanner(System.in);
		 String [] distanceUnits = {"feet", "miles", "meters", "kilometers"};
		 boolean choosingStartingDistance = true;
		 String startingUnit = "";
		 
		 while(choosingStartingDistance)
			 {
				 System.out.println("Which unit would you like to convert from?");
				 for (String s: distanceUnits)
					 {
						 System.out.println(" " + s);
					 }
				 startingUnit = userInput_String.nextLine();
				 for  (String s: distanceUnits)
					 {
						 if (startingUnit.toLowerCase().equals(s.toLowerCase()))
								choosingStartingDistance = false;
					 }
			 }
		 System.out.println("Enter in the value you would live to convert from.");
		 double startingValue = userInput_double.nextDouble();
		 
		 boolean choosingEndingDistance = true;
		 boolean sameUnit = false;
		 String endingUnit = "";
		 while (choosingEndingDistance)
			 {
				 System.out.println("What unit would you like to convert to?");
				 for (String a: distanceUnits)
					 {
						 System.out.println(" "+a);
					 }
				 endingUnit = userInput_String.nextLine();
				 for (String a: distanceUnits)
					 {
						 if (endingUnit.toLowerCase().equals(startingUnit.toLowerCase()))
							 sameUnit = true;
						 else
							 choosingEndingDistance = false;
					
					 }
			 }
		 double endingValue;
		 if(startingUnit.equals("feet"))
			{
				 if(endingUnit.equals("miles"))
						 {
							 endingValue = startingValue *0.00018939;
							 System.out.println(startingValue + " in "+ startingUnit+" = " + endingValue + " in " + endingUnit );
						 }
				 if(endingUnit.equals("meters"))
						 {
							 endingValue = startingValue *0.3048;
							 System.out.println(startingValue + " in "+ startingUnit+" = " + endingValue + " in " + endingUnit );
						 }
				 if(endingUnit.equals("kilometers"))
						 {
							 endingValue = startingValue *0.000305;
							 System.out.println(startingValue + " in "+ startingUnit+" = " + endingValue + " in " + endingUnit );
						 }
						 
			 }
		 else if(startingUnit.equals("miles"))
			 {
				 if(endingUnit.equals("feet"))
					 {
						 endingValue = startingValue *5280;
						 System.out.println(startingValue + " in "+ startingUnit+" = " + endingValue + " in " + endingUnit );
					 }
				 if(endingUnit.equals("meters"))
					 {
						 endingValue = startingValue /0.00062137;
						 System.out.println(startingValue + " in "+ startingUnit+" = " + endingValue + " in " + endingUnit );
					 }
				 if(endingUnit.equals("kilometers"))
					 {
						 endingValue = startingValue * 1.609344;
						 System.out.println(startingValue + " in "+ startingUnit+" = " + endingValue + " in " + endingUnit );
					 }
				 
			 }
		 else if(startingUnit.equals("meters"))
			 {
				 if(endingUnit.equals("feet"))
					 {
						 endingValue = startingValue *3.2808;
						 System.out.println(startingValue + " in "+ startingUnit+" = " + endingValue + " in " + endingUnit );
					 }
				 if(endingUnit.equals("miles"))
					 {
						 endingValue = startingValue * 0.00062137;
						 System.out.println(startingValue + " in "+ startingUnit+" = " + endingValue + " in " + endingUnit );
					 }
				 if(endingUnit.equals("kilometers"))
					 {
						 endingValue = startingValue /1000;
						 System.out.println(startingValue + " in "+ startingUnit+" = " + endingValue + " in " + endingUnit );
					 }
				 
			 }
		 else if(startingUnit.equals("kilometers"))
			 {
				 if(endingUnit.equals("feet"))
					 {
						 endingValue = startingValue  * 3280.8;
						 System.out.println(startingValue + " in "+ startingUnit+" = " + endingValue + " in " + endingUnit );
					 }
				 if(endingUnit.equals("miles"))
					 {
						 endingValue = startingValue * 0.62137;
						 System.out.println(startingValue + " in "+ startingUnit+" = " + endingValue + " in " + endingUnit );
					 }
				 if(endingUnit.equals("meters"))
					 {
						 endingValue = startingValue *1000;
						 System.out.println(startingValue + " in "+ startingUnit+" = " + endingValue + " in " + endingUnit );
					 }
				 
			 }
		
	}
			 
}
