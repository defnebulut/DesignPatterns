/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 19.12.2022
 */
public class ItalianStrawberryIceCream extends IceCream{
    public ItalianStrawberryIceCream(){
        name = "Italian Strawberry Ice Cream";
        intensity = 7.5;
        wrappingPaper = "Purple paper with dark flowers";
        cone = "Cake Cone";
        cost = 65;
        milk = "Low fat milk";
    }
    public double cost(){
        return cost;
    }
}
