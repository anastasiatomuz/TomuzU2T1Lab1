//rectangle class definition
public class Rectangle {

    // instance variables
    private int length;
    private int width;

    // constructor method for creating Rectangle objects;
    // instance variables are set here using the values passed as arguments
    public Rectangle(int len, int wid) {
        length = len;
        width = wid;
    }

    // method that calculates and prints area
    public void printArea() {
        int area = length * width;
        System.out.println("My area is " + area);
    }

    //method that calculates and prints the perimeter
    public void printPerimeter(){
        int perimeter = 2 * width + 2* length;
        System.out.println("My perimeter is " + perimeter);
    }
}


