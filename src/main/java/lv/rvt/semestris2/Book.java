package lv.rvt.semestris2;

public class Book {
    private String author;
    private String name;
    private double weight;
    public Book(String author, String name, double weight){
        this.name = name;
        this.author = author;
        this.weight = weight;
    }
    public String toString() {
        return author + ": " + name;
    }
    public double weight() {
        return weight;
    }

}
