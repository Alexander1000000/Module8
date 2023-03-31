public class Rectangle extends Quad {
    private double sideWidth;

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Side Width: " + this.sideWidth);
        System.out.println();
    }

    public double getSideWidth() {
        return sideWidth;
    }

    public void setSideWidth(double sideWidth) {
        this.sideWidth = sideWidth;
    }
}