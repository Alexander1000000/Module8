public class Ellipse extends Circle {
    private double radius2;

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Radius2: " + this.radius2);
        System.out.println();
    }

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }
}