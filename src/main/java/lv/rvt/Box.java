package lv.rvt;

public class Box {
    private double width;
    private double height;
    private double length;
    public Box ( double width, double height, double length ){
        this.height = height;
        this.length = length;
        this.width = width;
    }
    public Box(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }
    public Box(Box oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;

    }
    public Box smallerBox(Box oldBox) {
        return new Box(0.75 * oldBox.getWidth(), 0.75 * oldBox.getHeight(), 0.75 * oldBox.getLength());
    }

    public Box biggerBox(Box oldBox) {
        return new Box(1.25 * oldBox.getWidth(), 1.25 * oldBox.getHeight(), 1.25 * oldBox.getLength());
    }
    public boolean nests(Box outsideBox) {
        return this.width < outsideBox.getWidth() &&
               this.height < outsideBox.getHeight() &&
               this.length < outsideBox.getLength();
    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }
    public double length() {
        return length;
    }

    public double width() {
        return width;
    }

    public double height() {
        return height;
    }
    public double faceArea() {
        return length * height;
    }
    
    public double topArea() {
       return length * width;
    }
    
    public double sideArea() {
        return width * height;
    }
    
    public double area()
    {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;              
    }
    public double volume() {
        return length * width * height;
    }   

}
