package lv.rvt;

public class Statistics {
    private int count;
    private int sum;
    private int sum2;
    private int sum1;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
        this.sum1 = 0;
        this.sum2 = 0;

    }


    public void addNumber(int number) {
        this.sum += number; 
        this.count++;
        if (number % 2 ==0){
            this.sum2 += number;
        }       
        else {
            this.sum1 += number;
        }
    }


    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }
    public int sum2() {
        return this.sum2;
    }
    public int sum1() {
        return this.sum1;
    }

    public double average() {
        if (this.count == 0) {
            return 0.0;
        }
        return (double) this.sum / this.count;
    }

}