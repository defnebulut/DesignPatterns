/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 19.12.2022
 */
public class TurkishChocolateIceCream extends IceCream{
    public TurkishChocolateIceCream(){
        name = "Turkey Chocolate Ice Cream";
        intensity = 4.0;
        wrappingPaper = "White paper with chocolate points";
        cone = "Kid cone";
        cost = 3;
        milk = "Reduced fat milk";
    }
    public double cost(){
        return cost;
    }
}
