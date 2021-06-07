package pizza_Store;
import java.util.*;

public abstract class Pizza {
    private String name;
    private String dough;
    private String sauce;
    protected List<String> toppings = new ArrayList<String>();
    protected String type;
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


    // methods

    public void Prepare() {
        System.out.println("---------------------");
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough... ");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
       /* for (String topping: toppings) {
            System.out.println("\t" + topping);
        }
        */
        if (toppings != null) {
            toppings.forEach(toppings -> {
                System.out.println("\t" + toppings);
            });
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
        System.out.println("---------------------");
    }
}
