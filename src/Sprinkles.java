/**
 * @author Defne BULUT & Kaan AKGUN
 * @since 19.12.2022
 */
public class Sprinkles extends CondimentDecorator{
    IceCream iceCream;

    public Sprinkles(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Sprinkles";
    }
    public double cost() {
        return 1.20 + iceCream.cost();
    }
}
