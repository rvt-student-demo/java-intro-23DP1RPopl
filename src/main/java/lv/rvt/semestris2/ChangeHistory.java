package lv.rvt.semestris2;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        return history.isEmpty() ? 0 : history.stream().max(Double::compare).get();
    }

    public double minValue() {
        return history.isEmpty() ? 0 : history.stream().min(Double::compare).get();
    }

    public double average() {
        return history.isEmpty() ? 0 : history.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
    }
    public String toString() {
        return history.toString();
    }
}
