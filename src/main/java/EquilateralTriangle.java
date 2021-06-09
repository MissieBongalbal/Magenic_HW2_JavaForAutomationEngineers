import java.util.Scanner;

// TODO FOR HOMEWORK: Write the entire Equilateral Triangle Class
//    NOTE: We will be expecting a correct Triangle class even though we aren't spelling out what to do.
//          Use all the information within the project and your knowledge base.
//          Feel free to get fancy and explore here, as long as you have the basics we won't discount anything extra
//          you might get wrong.
//    NOTE: An EquilateralTriangle has the same base for all 3 sides, and the height is always (sqrt(3)/2) * the base.
//          So the important thing to note is you will only need the base and you can calculate the height
public class EquilateralTriangle {
    /**
     * The base length
     */
    private double base;

    /**
     * Creates an instance of the Triangle class
     * NOTE: Do not touch this method!
     */
    public EquilateralTriangle() {
    }

    /**
     * Gets the base length
     * @return The base length
     */
    public double getBase() {
        return base;
    }

    /**
     * TODO FOR HOMEWORK: Use a conditional to only set the value if it's positive and non-zero
     * Sets the base length
     * @param base The base length of a triangle
     */
    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("Base value " + base + " is invalid!");
        }
    }

    /**
     * Calculates the area of the square object
     * @return The area of the square
     */
    public double area() {
        double height = Math.sqrt(3) * base / 2;
        return (base * height) / 2;
    }

    /**
     * Calculates the perimeter of the square object
     * @return The perimeter of the square
     */
    public double perimeter() {
        return 3 * base;
    }

    public static void main(String[] args) {
        EquilateralTriangle et = new EquilateralTriangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input base length: ");
        double base = sc.nextDouble();
        et.setBase(base);

        double area = et.area();
        double perimeter = et.perimeter();

        System.out.println("An Equilateral Triangle with base length of " + et.getBase() + " has an area of: " + area);
        System.out.println("An Equilateral Triangle with base length of " + et.getBase() + " has a perimeter of: " + perimeter);
    }

}