//Name: Alexis Boyachek
//Date: 28 October 2024
//Class: Computer Science 30 Period 1
//Project: A-16 Area of a Triangle AEB
//Description:Calculates area of a tringle in a function
public class AreaTri {
//create callable funtion to calculate the area of a triangle: (add perimeter) / 2 - (add perimeter)^2
    public void areaTriangle(){
        double perimeter = 3 + 3 + 3;
        double s = perimeter / 2;
        double areaTri = Math.pow(s-perimeter,2);
        System.out.println("The area area of this triangle is " + areaTri);
    }
}
