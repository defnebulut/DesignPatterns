/**
 * @author Defne BULUT
 * @since 19.12.2022
 */
public class CaramelSauce extends CondimentDecorator{
    IceCream iceCream;

    public CaramelSauce(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", CaramelSauce";
    }
    public double cost() {
        return 1.50 + iceCream.cost();
    }
}
