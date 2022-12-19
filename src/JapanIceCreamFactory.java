/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 19.12.2022
 */
public class JapanIceCreamFactory extends IceCreamFactory{
    @Override
    protected IceCream createIceCream(String type) {
        if (type.equals("Vanilla")){
            return new JapaneseVanillaIceCream();
        }else if(type.equals("Chocolate")){
            return new JapaneseChocolateIceCream();
        }else if(type.equals("Lemon")){
            return new JapaneseLemonIceCream();
        }else if(type.equals("Strawberry")){
            return new JapaneseStrawberryIceCream();
        }
        return null;
    }
}
