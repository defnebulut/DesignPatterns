/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 19.12.2022
 */
public class ItalyIceCreamFactory extends IceCreamFactory{
    @Override
    protected IceCream createIceCream(String type) {
        if (type.equals("Vanilla")){
            return new ItalianVanillaIceCream();
        }else if(type.equals("Chocolate")){
            return new ItalianChocolateIceCream();
        }else if(type.equals("Lemon")){
            return new ItalianLemonIceCream();
        }else if(type.equals("Strawberry")){
            return new ItalianStrawberryIceCream();
        }
        return null;
    }
}
