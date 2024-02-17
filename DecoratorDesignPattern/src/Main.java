public class Main {
    public static void main(String... args) {
        Margerita margerita = new Margerita();
        Pizza pizza = new Mushroom(new ExtraCheese(margerita));
        System.out.println(pizza.cost());
        Pizza pizza1 = new Mushroom(margerita);
        System.out.println(pizza1.cost());
    }
}
