//Name: Alexis Boyachek
//Date: 27 December 2024
//Class: Computer Science 30 Period 1
//Project: A-24 Loop Stats AEB
//Description:Run a loop from a provided start number to a provided stop number
			//Total up all numbers in the group, determine all odds in the group, and determine all evens in the group

import java.util.Scanner;

public class LoopStats
{
	//define variables for total, start/ stop, odd/ even counters
	int totalNum = 0;
	int start = 0;
	int stop = 0;
	int oddCount = 0;
	int evenCount = 0;

	//add scanner
	Scanner ls = new Scanner(System.in);

	public void numCount()
	{ 
		//prompt user to enter integer value
		System.out.println("Enter starting integer value: ");
		start = ls.nextInt();
		System.out.println("Enter stop integer value: ");
		stop = ls.nextInt();
	}

	public void totalCount(){
		//use for loop to stop at the stop value
		for(int n = start; n <= stop; n++)
		{
			totalNum += n;

			//add if/ else statement to add to even/ odd counter within the for loop
			if(n % 2 == 0)
			{
				evenCount ++;
			}

			else
			{
				oddCount ++;
			}
		}

		//print results
		System.out.println("Total between " + start + " and " + stop + " is " + totalNum);
		System.out.println("Even count: " + evenCount);
		System.out.println("Odd count: " + oddCount);
	}
}