package lv.rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private double balance;
    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.50){
            payment -= 2.50;
            this.affordableMeals += 1;
            this.money += 2.50;
            return payment;
        }
        else {
            return payment;
        }
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.30){
            payment -= 4.30;
            this.heartyMeals += 1;
            this.money += 4.30;
            return payment;
        }
        else {
            return payment;
        }
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }
    public boolean eatAffordably(PaymentCard card) {
        this.balance = card.balance();
        if (balance >= 2.50){
            balance -= 2.50;
            this.affordableMeals += 1;
            card.addMoney(-2.50);
            return true;
        }
        else {
            return false;
        }
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public boolean eatHeartily(PaymentCard card) {
        this.balance = card.balance();
        if (balance >= 4.30){
            balance -= 4.30;
            this.heartyMeals += 1;
            card.addMoney(-4.30);
            return true;
        }
        else {
            return false;
        }
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }


    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
        this.money += sum;
    }
}
