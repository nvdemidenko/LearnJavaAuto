package service;

import model.Food;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getSumWithoutDiscount(){
        double sum = 0;
        for (Food f: foods) {
            sum += f.getSum();
        }
        return sum;
    }

    public double getSumWithDiscount(){
        double sum = 0;
        for (Food f: foods) {
            sum += f.getSumWithDiscount();
        }
        return sum;
    }

    public double getVeganSumWithoutDiscount(){
        double sum = 0;
        for (Food f: foods) {
            if (f.isVegetarian()) {
                sum += f.getSum();
            }
        }
        return sum;
    }
}
