/**
 * @author Kaan AKGUN & Defne BULUT
 * @since 19.12.2022
 */
public abstract class IceCream {
    protected String name;
    protected double cost;
    protected String cone;
    protected double intensity;
    protected String wrappingPaper;
    protected String milk;

    public void prepare() {
        System.out.println(name + " is prepared with " + milk +
                " and " + intensity+" intensity.\n");
        System.out.println("""
                Adding Sugar, spice, and everything nice
                These were the ingredients chosen
                To create the perfect ice cream
                """);
    }

    public void packaging() {
        System.out.println("Placed into the " + cone);
        System.out.println("Wrapped with " + wrappingPaper +"\n");
    }

    protected abstract double cost();
    public String getDescription(){
        return name;
    }

    public void setMilk(String milk){
        this.milk = milk;
    }
    public void setCost(double cost){
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCone(String cone) {
        this.cone = cone;
    }

    public void setIntensity(double intensity) {
        this.intensity = intensity;
    }

    public void setWrappingPaper(String wrappingPaper) {
        this.wrappingPaper = wrappingPaper;
    }
}
