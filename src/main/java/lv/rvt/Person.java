package lv.rvt;

public class Person {
    private String name;
    private int age;
    private String group;
    private int weight;
    private int height;

    public Person(String initialName, Integer initialage, Integer initialweight, Integer initialheight ) {
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
        return this.name + ", age " + this.age + " years, my body mass index is " + bodyMassIndex();
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
    public void setAge(int newgroup){
        this.age = newgroup;
    }
    public int getAge() {
        return this.age;
    }
}

