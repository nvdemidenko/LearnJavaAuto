package model;

import model.constants.Colour;

import static model.constants.Discount.DEFAULT_DISCOUNT;
import static model.constants.Discount.RED_APPLE_DISCOUNT;

public class Apple extends Food {
    private final String color;

    public Apple (double price, int amount, String colour){
        this.price = price;
        this.amount = amount;
        this.color = colour;
        isVegetarian = true;
    }

    @Override
    public double getDiscount(){
        if (Colour.RED.equals(color)) {
            return RED_APPLE_DISCOUNT;
        }
        return DEFAULT_DISCOUNT;
    }
}
