/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 19.12.2022
 */
public class JapaneseVanillaIceCream extends IceCream{
    public JapaneseVanillaIceCream(){
        name = "Japanese Vanilla Ice Cream";
        intensity = 2.2;
        wrappingPaper = "Red paper with white points";
        cone = "Waffle cone";
        cost = 80;
    }
    public double cost(){
        return cost;
    }
}
