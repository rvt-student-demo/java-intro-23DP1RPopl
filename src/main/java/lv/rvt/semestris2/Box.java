package lv.rvt.semestris2;
import java.util.*;

class Box implements Packable {
    private double maxCapacity;
    private List<Double> items;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public void add(Book item) {
        if (this.weight() + item.weight() <= maxCapacity) {
            items.add(item.weight());
        }
    }
    public void add(CD item) {
        if (this.weight() + item.weight() <= maxCapacity) {
            items.add(item.weight());
        }
    }

    public double weight() {
        double weight = 0;
        for (Double double1 : items) {
            weight += double1;
        }
        return weight;
    }
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
