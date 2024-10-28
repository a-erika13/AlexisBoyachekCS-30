//Name: Alexis Boyachek
//Date: 25 October 2024
//Class: Computer Science 30 Period 1
//Project: A-13 Geometry Calculator AEB
//Description: Geometry calculator that calculates surface area of a cube, perimeter of a rectangle, area of a circle
//import scanner
public class Geo {
//create function for surface  area of a cube: 6*(side^2)
   public void surfaceCube(){
        double surCube = 6*(Math.pow(2.3,2));
        System.out.println("The surface area of this cube is " + surCube);
    }
//create function for perimeter of a rectangle: 2(length)+2(width)
    public void perimeterRectangle(){
        double PermRec = 2*1+2*1;
        System.out.println("The perimeter of this rectangle is " + PermRec);
    }
//create function for area of a circle: Pi*(radius^2)
    public void areaCircle(){
        double aCirc = Math.PI*(Math.pow(2.3,2));
        System.out.println("The area of this circle is " + aCirc);
    }
}
