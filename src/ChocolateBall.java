/**
 * @author Defne BULUT & Kaan AKGUN
 * @since 19.12.2022
 */
public class ChocolateBall extends CondimentDecorator{
    IceCream iceCream;

    public ChocolateBall(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Chocolate Ball";
    }
    public double cost() {
        return 2.5 + iceCream.cost();
    }
}
