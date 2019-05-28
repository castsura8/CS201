package problem_2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Process output dialog
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print(" This Vending Machine offers 5 different types drinks" + "\nPlease insert money amount" + 
					
					"\n 1: Pepsi = $1.25" +
					"\n 2: Coke = $1.50" + 
					"\n 3: Fanta = $2.00" + 
					"\n 4: Diet Coke = $2.25" + 
					"\n 5: Sprit = $2.50" 
					);
		
		 String  scanner = input.next(" you have inserted: $"+input +
				 "\nPlease select the number cooresponding to your soda selection" + 
				 		"\n 1: Pepsi = $1.25" +
						"\n 2: Coke = $1.50" + 
						"\n 3: Fanta = $2.00" + 
						"\n 4: Diet Coke = $2.25" + 
						"\n 5: Sprit = $2.50");
		 
		
				
//Declaration 
		 
		 Integer Isoda = Integer.parseInt(scanner);
		 DecimalFormat twodec = new DecimalFormat("0.00");
		 double r=0;
		 
		 
		 
		 
	}

}
