/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 19.12.2022
 */
public class TurkeyIceCreamFactory extends IceCreamFactory{
    @Override
    protected IceCream createIceCream(String type) {
        if (type.equals("Vanilla")){
            return new TurkishVanillaIceCream();
        }else if(type.equals("Chocolate")){
            return new TurkishChocolateIceCream();
        }else if(type.equals("Lemon")){
            return new TurkishLemonIceCream();
        }else if(type.equals("Strawberry")){
            return new TurkishStrawberryIceCream();
        }
        return null;
    }
}
