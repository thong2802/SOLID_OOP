package pizza_Store;

import java.awt.*;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(
                "Pizza 1",
                "thin",
                "chilli",
                Collections.singletonList("Onions"));
        pizza.Prepare();
        pizza.Bake();
        pizza.Cut();
        pizza.Box();
    }
}
