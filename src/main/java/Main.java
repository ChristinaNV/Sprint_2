import model.Food;
import model.Meat;
import model.Apple;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main (String[] args) {
        Food[] products = {
                new Meat(5, 100, false),
                new Apple(10, 50, true, Colour.red),
                new Apple(8, 60, true, Colour.green)
        };
        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getTotalPriceAllVegetarianWithoutDiscount());
    }
}
