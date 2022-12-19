/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 19.12.2022
 */
public class JapaneseStrawberryIceCream extends IceCream{
    public JapaneseStrawberryIceCream(){
        name = "Japanese Strawberry Bomb";
        intensity = 3.9;
        wrappingPaper = "Pink paper with black triangles";
        cone = "Pretzel cone";
        cost = 75;
    }
    public double cost(){
        return cost;
    }
}
