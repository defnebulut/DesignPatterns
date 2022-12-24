/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 19.12.2022
 */
public class TurkishVanillaIceCream extends IceCream{
    public TurkishVanillaIceCream(){
        name = "Turkey Vanilla Ice Cream";
        intensity = 3.5;
        wrappingPaper = "White paper with red points";
        cone = "Chocolate Dipped cone";
        cost = 2.5;
        milk = "Whole milk";
    }
    public double cost(){
        return cost;
    }
}
