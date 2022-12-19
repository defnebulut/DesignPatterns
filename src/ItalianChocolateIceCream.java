/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 19.12.2022
 */
public class ItalianChocolateIceCream extends IceCream{
    public ItalianChocolateIceCream(){
        name = "Italian Chocolate Ice Cream";
        intensity = 4.9;
        wrappingPaper = "Dark paper with purple flowers";
        cone = "Waffle Cone";
        cost = 40;
    }
    public double cost(){
        return cost;
    }
}