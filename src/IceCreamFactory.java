/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 19.12.2022
 */
public abstract class IceCreamFactory {
    public IceCream orderIceCream(String type){
        IceCream iceCream;
        iceCream = createIceCream(type);
        iceCream.prepare();
        iceCream.packaging();
        return iceCream;
    }
    protected abstract IceCream createIceCream(String type);
}
