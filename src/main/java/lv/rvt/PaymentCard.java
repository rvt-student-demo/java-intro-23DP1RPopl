package lv.rvt;

public class PaymentCard {
    private double balance;


    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
    public void eatAffordably() {
        if (this.balance >= 2.60){
            this.balance -=  2.60;
        }
    }
    
    public void eatHeartily() {
        if (this.balance >= 4.60){
            this.balance -=  4.60;
        }
    }
    public void addMoney(double amount) {
        if (this.balance + amount <=150 && this.balance + amount >= 0){
            this.balance += amount;
        }
        else if (this.balance + amount < 0){
            this.balance = balance;
        }
        else{
            this.balance = 150;
        }

    }
    public double balance() {
        return this.balance;
    }
    public boolean takeMoney(double amount) {
        if (this.balance >= amount) { 
            this.balance -= amount;    
            return true;               
        } else {
            return false;          
        }
    }
}
