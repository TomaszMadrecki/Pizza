public class MargheritaPizzaBuilder extends PizzaBuilder {

    void buildDough() {
        pizza.setDough("thin dough");
    }

    void buildSauce() {
        pizza.setSauce("tomato sauce");
    }

    void buildTopping() {
        pizza.setTopping("cheese");
    }
}
