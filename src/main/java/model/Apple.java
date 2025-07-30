package model;
import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    private final String colour;

    public Apple(int amount, double price, boolean isVegetarian, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    public String getColor() {
        return colour;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.red)) {
            return getPrice() * Discount.red / 100;
        }
            return 0.0;
        }
    }

