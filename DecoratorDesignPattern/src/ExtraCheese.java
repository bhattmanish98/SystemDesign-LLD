public class ExtraCheese extends Toppings{
    public ExtraCheese(Pizza pizza) {
        super.pizza = pizza;
    }
    @Override
    public int cost() { return pizza.cost() + 20; }
}
