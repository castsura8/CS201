
import java.util.Scanner;
public class ComplexProblem {
	


		
		 static double realA, imagineB, realC, imagineD;
		    static double i = Math.pow(-1,1/2);
		 
		    public static void main(String[] args) {
		    	//Ask the user for an input 
		    	
		        Scanner input = new Scanner(System.in);
		        
		      //Calculating Complex Numbers

		        System.out.println(" + Calculating Complex Numbers + ");
		        
		        
		        System.out.printf("%15s\n","z = a + (i*b) and z = c + (i*d)");
		        //--//---z = a + (i*b) and z = c + (i*d)
		        
		        System.out.print("Enter real a: ");
		        // enter a real a
		        realA = input.nextFloat();       
		        		System.out.print("Enter imaginary b: ");
		        //print imaginary number 
		        
		        imagineB = input.nextFloat();
		       
		        System.out.print("Enter real c: ");
		        //print enter real c 
		        realC = input.nextFloat();
		        System.out.print("Enter imaginary d: ");
		        imagineD = input.nextFloat();
		        System.out.println();
		 
		        //
		        //functions to perform 
		        
		        addition("Addition: ");
		        subtraction("Subtraction: ");
		        multiplication("Multiplication: ");
		        division("Division: ");
		        
		        
		        
		        
		        
		        // addition, subtraction and division with- "name" as a parameters  
		    }
		    public static void addition(String name){
		        double add = (realA + realC) + i*(imagineB + imagineD);
		        System.out.println(name + add);
		        
		   
		    }
		    public static void subtraction(String name){
		        double subtract = (realA - realC) + i*(imagineB - imagineD);
		        System.out.println(name + subtract);
		    }
		    public static void multiplication(String name){
		        double multiply = ((realA * realC) - (imagineB * imagineD)) + i*((imagineB * realC)
		                + (realA * imagineD));
		        System.out.println(name + multiply);
		    }
		    public static void division(String name){
		    		double division = ((realA + (imagineB * i)) / (realC + (imagineD * i)));
		    				System.out.println(name + division);
		            
		            
		    }
		    
		    
		    
		    
		
		    
		
		
		
	}


