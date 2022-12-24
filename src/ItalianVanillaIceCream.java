/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 19.12.2022
 */
public class ItalianVanillaIceCream extends IceCream{
    public ItalianVanillaIceCream(){
        name = "Italian Vanilla Ice Cream";
        intensity = 3.2;
        wrappingPaper = "White paper with red squares";
        cone = "Sugar cone";
        cost = 60;
        milk = "Fat-free milk";
    }
    public double cost(){
        return cost;
    }
}
