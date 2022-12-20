/**
 * @author Defne BULUT
 * @since 19.12.2022
 */
public class CaramelSauce extends IceCreamDecorator {
    IceCream iceCream;

    public CaramelSauce(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Caramel Sauce";
    }
    public double cost() {
        return 1.50 + iceCream.cost();
    }
}
