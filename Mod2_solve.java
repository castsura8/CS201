/**
* Chapter # 7 PROBLEM #7.27, PAGE 283
* @author Surafal Negere
*Module # 2 , Discuss and SOLVE : POST #2
*Main Objective: 
* -write a method that return true if list1 and list2 are identical
* -prompt user to enter two list of integers 
* -display whether the two are identical or not 
*/

package solve_discuss_chapter7;
import java.util.Scanner;
import java.util.Arrays;

public class Mod2_solve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ask the user for an input 

		Scanner input = new Scanner(System.in);
		
		
		
		//Initializing arrays with input values
		
		double []myList1 = new double [6];
		
		
		
		System.out.print("Enter List1 ** must be six integers, seperated by space  **" + myList1.length + "values: \n" );
		
		double []myList2 = new double [6];
		
		
		
		
		for(int i = 0; i < myList1.length; i++)
		{
			myList1[i] = input.nextDouble();
		}
		
		System.out.println("Enter List2 size ** must be six integers, seperated by space ** " + myList2.length + "values: ");
		
		for(int j = 0; j < myList2.length; j++)
		{
			myList1[j] = input.nextDouble();
		}
		
		if( myList1 == myList2)
		{
			System.out.println("Two lists are identical");
		}
		else 
		if(myList1 != myList2 )
		{
			System.out.println("Two lists are not identical");
		}
		
		
		//comparing myList1 and myList2 - using boolean 
				boolean retval = Arrays.equals(myList1, myList2);
						System.out.println("myList1 and Mylist2 equal : " + retval);
		
		
		
		
	}

}
