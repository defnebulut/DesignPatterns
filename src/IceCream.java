/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 19.12.2022
 */
public abstract class IceCream {
    String name;
    double cost;
    String cone;
    double intensity;
    String wrappingPaper;

    void prepare() {
        System.out.println(name + " is preparing with intensity of "
                + intensity);
        System.out.println("Adding Sugar, spice, and everything nice\n" +
                "These were the ingredients chosen\n" +
                "To create the perfect ice cream\n");
    }

    void packaging() {
        System.out.println("Placed into the " + cone);
        System.out.println("Wrapped with " + wrappingPaper);
    }

    abstract double cost();
    String getDescription(){
        return name;
    }
}
