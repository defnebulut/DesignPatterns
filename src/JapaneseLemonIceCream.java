/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 19.12.2022
 */
public class JapaneseLemonIceCream extends IceCream{
    public JapaneseLemonIceCream(){
        name = "Japanese Lemon Bomb";
        intensity = 1.3;
        wrappingPaper = "White paper";
        cone = "Sugar cone";
        cost = 45;
        milk = "Soy milk";
    }
    public double cost(){
        return cost;
    }
}
