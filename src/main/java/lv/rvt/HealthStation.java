    package lv.rvt;

public class HealthStation {
    private int healph;
    private int count;
    public int weigh(Person person) {
        this.count += 1;
        this.healph = (int) Math.round(person.getWeight()); 
        return this.healph;
    }
    public void feed(Person person){
        this.healph = (int) Math.round(person.getWeight()); 
        person.setWeight(healph + 1);
    }   
    public int weighings(){
        return this.count;
    }
}
