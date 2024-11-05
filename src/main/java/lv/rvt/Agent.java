package lv.rvt;

public class Agent {
    private String name;
    private String nam1;

    public Agent(String name, String nam1){
        this.name = name;
        this.nam1 = nam1;
    }
    public String toString(){
        return "My name is "+ this.nam1 + ", " + this.name + " " + this.nam1;

    }
}
