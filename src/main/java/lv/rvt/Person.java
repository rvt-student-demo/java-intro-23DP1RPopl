package lv.rvt;

public class Person {
    private String name;
    private int age;
    private String group;
    private double weight;
    private double height;
    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

    public Person(String initialName, Integer initialage, double initialweight, double initialheight ) {
        this.age = initialage;
        this.weight = initialweight;
        this.height = initialheight;
        this.name = initialName;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    public String toString() {
        return String.format("Name: %s, age: %d, weight: %.2f, height %.2f", this.name, this.age, this.weight, this.height);
    }
    public String toCsvRow() {
        return String.format("%s, %d, %.2f, %.2f", this.name, this.age, this.weight, this.height);
    }
    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }
    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
    }
    public int returnAge() {
        return this.age;
    }
    public String getGroup() {
        return this.group;
    }
    public void setGroup(String group){
        this.group = group;
    }
    public String getName() {
        return this.name;
    }
    public double getHeight() {
        return this.height;
    }
    public double getWeight() {
        return this.weight;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int newgroup){
        this.age = newgroup;
    }
    public int getAge() {
        return this.age;
    }
   
}

