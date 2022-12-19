/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 19.12.2022
 */
public class ItalianLemonIceCream extends IceCream{
    public ItalianLemonIceCream(){
        name = "Italian Lemon Ice Cream";
        intensity =6.4;
        wrappingPaper = "Blue paper with green circles";
        cone = "Pretzel Cone";
        cost = 45;
    }
    public double cost(){
        return cost;
    }
}
