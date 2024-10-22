//Name: Alexis Boyachek
//Date: 15 October 2024
//Class: Computer Science 30 Period 1
//Project: A-10 Sum Up Stuff AEB
//Description: Add and print the sum of two given double values
public class SumUp {
	//instance variables
	private double one;
    private double two;
    private double sum;

	public void setNums(double a, double b){
		one = a;
		two = b;
	}

	public void sum(){
        sum = one + two;
		System.out.println(sum);
	}
    }
