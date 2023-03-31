public class Circle extends AbstractShape {
    private double radius;

    public void displayInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Fill Color: " + this.getFillColor());
        System.out.println("Border Color: " + this.getBorderColor());
        System.out.println("X: " + this.getX());
        System.out.println("Y: " + this.getY());
        System.out.println("Radius: " + this.radius);
        System.out.println();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}