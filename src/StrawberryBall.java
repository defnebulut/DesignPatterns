/**
 * @author Defne BULUT & Kaan AKGUN
 * @since 19.12.2022
 */
public class StrawberryBall extends CondimentDecorator{
    IceCream iceCream;

    public StrawberryBall(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Strawberry Ball";
    }
    public double cost() {
        return 4.85 + iceCream.cost();
    }
}
