//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;

	public LoopStats()
	{ while(n < 10){
		//randomize numbers 1-100 using Math.random()
		randInt1 = (int) (( Math.random() * 100 ) + 1);
		randInt2 = (int) (( Math.random() * 100 ) + 1);
		//print values
		System.out.println("Your two random numbers are " + randInt1 + " and " + randInt2);
		//create conditional statements to check which value is smaller/ larger
		if(randInt1 < randInt2){
			System.out.println("the smaller value is " + randInt1);
			System.out.println("the larger value is " + randInt2);
		}
		else if(randInt1 > randInt2){
			System.out.println("the larger value is " + randInt1);
			System.out.println("the smaller value is " + randInt2);
		}
		else if(randInt1 == randInt2){
			System.out.println("the two values are equal");
		}
		n = n + 1;
	}
if (totalN % 2 == 0){
	
}
	public LoopStats(int beg, int end)
	{
	}

	public void setNums(int beg, int end)
	{


	}

	public int getEvenCount()
	{
		int evenCount=0;




		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;





		return oddCount;
	}

	public int getTotal()
	{
		int total=0;




		return total;
	}
	
	public String toString()
	{
		return start + " " + stop;
	}
}