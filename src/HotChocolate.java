/**
 * @author Defne BULUT & Kaan AKGUN
 * @since 19.12.2022
 */
public class HotChocolate extends IceCreamDecorator {
    IceCream iceCream;

    public HotChocolate(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Hot Chocolate";
    }
    public double cost() {
        return 2.0 + iceCream.cost();
    }
}
