//Name: Alexis Boyachek
//Date: 26 November 2024
//Class: Computer Science 30 Period 1
//Project: A-25 Random Numbers AEB
//Description: Generates two random numbers and compares them to see which is smaller or larger, then loops process ten times
public class RandNum {
//set integer values and counter value to 0
int randInt1 = 0;
int randInt2 = 0;
int n = 0;
    //create function
    public void randNumber(){
        //create while loop that loops code 10 times, adding one to counter value each time
        while(n < 10){
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
            //add one to counter value
        }
    }
}

