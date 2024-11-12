//write a java program to implement factory method for pizza store with createPizza(), orderPizza(),prepare(), bake(), cut(), box(). Use this to create variety of pizzas like NyStyleCheesePizza, ChicagoStyleCheesePIzza etc. Give me the simple code also short its length.

abstract class Pizza {
    void prepare() { System.out.println("Preparing " + getClass().getSimpleName()); }
    void bake() { System.out.println("Baking " + getClass().getSimpleName()); }
    void cut() { System.out.println("Cutting " + getClass().getSimpleName()); }
    void box() { System.out.println("Boxing " + getClass().getSimpleName()); }
}

class NYStyleCheesePizza extends Pizza {}
class ChicagoStyleCheesePizza extends Pizza {}

abstract class PizzaStore {
    Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare(); pizza.bake(); pizza.cut(); pizza.box();
        return pizza;
    }
    abstract Pizza createPizza(String type);
}

class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        return new NYStyleCheesePizza();
    }
}

class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        return new ChicagoStyleCheesePizza();
    }
}

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        nyStore.orderPizza("cheese");
        chicagoStore.orderPizza("cheese");
    }
}
