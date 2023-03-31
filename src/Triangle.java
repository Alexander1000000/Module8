public class Triangle extends AbstractShape {
    private double side1;
    private double side2;
    private double side3;

    public void displayInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Fill Color: " + this.getFillColor());
        System.out.println("Border Color: " + this.getBorderColor());
        System.out.println("X: " + this.getX());
        System.out.println("Y: " + this.getY());
        System.out.println("Side 1: " + this.side1);
        System.out.println("Side 2: " + this.side2);
        System.out.println("Side 3: " + this.side3);
        System.out.println();
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}