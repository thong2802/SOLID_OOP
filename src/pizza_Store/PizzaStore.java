package pizza_Store;
public class PizzaStore {
    public void OrderPizaa(String type) {
        Pizza pizza;
        switch (type){
            case "cheese" :
                pizza = new CheesePizza();
                break;
            case "greek" :
                pizza = new GreekPizza();
                break;
            case "pepperoni" :
                pizza = new PepperOnlPizza();
                break;
            default:
                System.out.println("We do have " + type + " pizza");
                return;
        }
        pizza.Prepare();
        pizza.Bake();
        pizza.Cut();
        pizza.Box();
    }
}
