//Name: Alexis Boyachek
//Date: 18 October 2024
//Class: Computer Science 30 Period 1
//Project: A-9 Big or Small AEB
//Description: Big or small number checker that tells user which given value is greater, less or equal
public class BigSmall {
//set x and y values
    int x = 10;
    int y = 20;
//create function to check if number is larger
    public void bigNumX(){
        if (x > y){
            System.out.println(x + "is the larger value");
        }
    }
//create function to check if number is smaller
    public void smallNumX(){
        if (x < y){
            System.out.println(x + "is the smaller value");
        }
    }
//create function to check if numbers are equal
    public void equalNum(){
        if (x == y){
            System.out.println(x + " is equal to " + y);
        }
    }
}
