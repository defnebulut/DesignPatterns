/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 19.12.2022
 */
public class TurkishLemonIceCream extends IceCream{
    public TurkishLemonIceCream(){
        name = "Turkish Lemon Ice Cream";
        intensity = 4.7;
        wrappingPaper = "Red paper with pink flowers";
        cone = "Cake Cone";
        cost = 4.5;
        milk = "Low fat milk";
    }
    public double cost(){
        return cost;
    }
}