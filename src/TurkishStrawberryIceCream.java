/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 19.12.2022
 */
public class TurkishStrawberryIceCream extends IceCream{
    public TurkishStrawberryIceCream(){
        name = "Turkish Strawberry Ice Cream";
        intensity = 6.7;
        wrappingPaper = "Dark blue paper with black lines";
        cone = "Waffle cone";
        cost = 3;
    }
    public double cost(){
        return cost;
    }
}
