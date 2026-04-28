package main;

import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(100, 5);
        Apple redApple = new Apple(50, 10, Colour.RED);
        Apple greenApple = new Apple(60, 8, Colour.GREEN);
        Food[] food = new Food[3];

        food[0] = meat;
        food[1] = redApple;
        food[2] = greenApple;

        ShoppingCart shoppingCart = new ShoppingCart(food);
        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getSumWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.getSumWithDiscount());
        System.out.println("Cумма всех вегетарианских продуктов без скидки: " + shoppingCart.getVeganSumWithoutDiscount());
    }
}