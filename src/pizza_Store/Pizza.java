package pizza_Store;

import java.util.List;

public class Pizza {
    private String name;
    private String dough;
    private String sauce;
    private List<String> toppings;

    // Defaul Contructor.
    public Pizza(String s) {
    }
    // Contructor have Parameter
    public Pizza(String name, String dough, String sauce, List<String> toppings) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }
    // Coppy Contructor
    public Pizza(Pizza obj) {
        name = obj.name;
        dough = obj.dough;
        sauce = obj.sauce;
        toppings = obj.toppings;
    }
    // set/ get

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    // methods

    public void Prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough... ");
        System.out.println("Adding sauce..." );
        System.out.println("Adding toppings: ");
        for (String topping: toppings) {
            System.out.println("\t" + topping);
        }
    }

    public void Bake(){
        System.out.println("Baking " + name + " in 30 mins");
    }

    public void Cut(){
        System.out.println("Cutting " + name);
    }

    public void Box(){
        System.out.println("Boxing " + name);
    }
}
