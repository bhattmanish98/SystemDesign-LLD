public class Mushroom extends Toppings {
    public Mushroom(Pizza pizza) {
        super.pizza = pizza;
    }
    @Override
    public int cost() {
        return pizza.cost() + 10;
    }
}
