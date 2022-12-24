/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 19.12.2022
 */
public class JapaneseChocolateIceCream extends IceCream{
    public JapaneseChocolateIceCream(){
        name = "Japanese Chocolate Ice Cream";
        intensity = 2.0;
        wrappingPaper = "White paper with chocolate points";
        cone = "Cake cone";
        cost = 35;
        milk = "Nut milk";
    }
    public double cost(){
        return cost;
    }
}
