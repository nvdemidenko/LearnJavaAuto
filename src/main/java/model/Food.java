package model;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public double getSum(){
        return amount * price;
    }

    public double getSumWithDiscount(){
        double sum = getSum();
        double discountAmount = (sum * getDiscount())/100;
        return sum - discountAmount;
    }

    public boolean isVegetarian(){
        return isVegetarian;
    }
}
