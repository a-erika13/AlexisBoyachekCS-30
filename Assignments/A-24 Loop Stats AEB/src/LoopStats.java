//Name: Alexis Boyachek
//Date: 27 December 2024
//Class: Computer Science 30 Period 1
//Project: A-24 Loop Stats AEB
//Description:Run a loop from a provided start number to a provided stop number
			//Total up all numbers in the group, determine all odds in the group, and determine all evens in the group

import java.util.Scanner;

public class LoopStats
{
	int totalNum = 0;
	int start = 0;
	int stop = 0;
	Scanner ls = new Scanner(System.in);
	public void numCount()
	{ 
		System.out.println("Enter starting integer value: ");
		start = ls.nextInt();
		System.out.println("Enter stop integer value: ");
		stop = ls.nextInt();
	}

	public void totalCount(){
		for(int n = start; n <= stop; n++)
		{
			totalNum += n;

			//if(n % 2 == 0){}

			//else{}
		}
		System.out.println(totalNum);
	}
}