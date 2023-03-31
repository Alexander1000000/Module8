abstract class AbstractShape implements Shape, Cloneable {
    private String name;
    private String fillColor;
    private String borderColor;
    private double x;
    private double y;

    // метод для клонирования объектов
    public AbstractShape clone() {
        AbstractShape shape = null;
        try {
            shape = (AbstractShape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return shape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public abstract void displayInfo();
}
