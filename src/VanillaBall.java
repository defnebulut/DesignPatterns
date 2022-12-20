/**
 * @author Defne BULUT & Kaan AKGUN
 * @since 19.12.2022
 */
public class VanillaBall extends IceCreamDecorator {
    IceCream iceCream;

    public VanillaBall(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Vanilla Ball";
    }

    public double cost() {
        return 3.5 + iceCream.cost();
    }
}
