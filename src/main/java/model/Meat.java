package model;

import model.constants.Discount;

public class Meat extends Food  {
    public Meat(double price, int amount){
        this.price = price;
        this.amount = amount;
        isVegetarian = false;
    }
    @Override
    public double getDiscount(){
        return Discount.DEFAULT_DISCOUNT;
    }
}
