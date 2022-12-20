/**
 * @author Defne BULUT & Kaan AKGUN
 * @since 19.12.2022
 */
public class LemonBall extends IceCreamDecorator {
    IceCream iceCream;

    public LemonBall(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Lemon Ball";
    }
    public double cost() {
        return 1.90 + iceCream.cost();
    }
}
