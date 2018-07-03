public abstract class PizzaBuilder {

    protected Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
    }

    abstract void buildDough();
    abstract void buildSauce();
    abstract void buildTopping();

    public Pizza getPizza() {
        return pizza;
    }
}
