package lv.rvt.semestris2;

public class BoxTester {
    public static void main(String[] args) {
        Box box = new Box(2.5, 5.0, 6.0);
        
        System.out.println("Original Box:");
        System.out.println("Width: " + box.getWidth() + ", Height: " + box.getHeight() + ", Length: " + box.getLength());
        System.out.println("Area: " + box.area());
        System.out.println("Volume: " + box.volume());

        Box biggerBox = box.biggerBox(box);
        System.out.println("\nBigger Box:");
        System.out.println("Width: " + biggerBox.getWidth() + ", Height: " + biggerBox.getHeight() + ", Length: " + biggerBox.getLength());
        System.out.println("Area: " + biggerBox.area());
        System.out.println("Volume: " + biggerBox.volume());

        Box smallerBox = box.smallerBox(box);
        System.out.println("\nSmaller Box:");
        System.out.println("Width: " + smallerBox.getWidth() + ", Height: " + smallerBox.getHeight() + ", Length: " + smallerBox.getLength());
        System.out.println("Area: " + smallerBox.area());
        System.out.println("Volume: " + smallerBox.volume());

        Box outsideBox = new Box(10.0, 12.0, 15.0);
        System.out.println("\nDoes the original box nest inside the outside box? " + box.nests(outsideBox));
        System.out.println("Does the bigger box nest inside the outside box? " + biggerBox.nests(outsideBox));
        System.out.println("Does the smaller box nest inside the outside box? " + smallerBox.nests(outsideBox));
    }
}

