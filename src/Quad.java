public class Quad extends AbstractShape {
    private double sideLength;

    public void displayInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Fill Color: " + this.getFillColor());
        System.out.println("Border Color: " + this.getBorderColor());
        System.out.println("X: " + this.getX());
        System.out.println("Y: " + this.getY());
        System.out.println("Side Length: " + this.sideLength);
        System.out.println();
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
}