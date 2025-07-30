package service;

import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    // Получить общую сумму товаров в корзине без скидки

    public double getTotalPriceWithoutDiscount() {
        double total = 0.0;
        for (Food items : items) {
            total = total + items.getPrice();
        }
        return total;
    }

    // Получить общую сумму товаров в корзине со скидкой

    public double getTotalPriceWithDiscount() {
        double total = 0.0;
        for (Food items : items) {
            total = total + items.getPrice() - items.getDiscount();
        }
        return total;
    }

    // Получить общую сумму всех вегетарианских продуктов в корзине без скидки

    public double getTotalPriceAllVegetarianWithoutDiscount() {
        double total = 0.0;
        for (Food items : items) {
            if (items.isVegetarian()) {
                total = total + items.getPrice();
            }
        }
            return total;
        }
    }
