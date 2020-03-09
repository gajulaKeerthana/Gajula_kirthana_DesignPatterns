package creational.builder;

public class OrangeJuice extends JuiceMaker {
    Juice createJuice() {
        return new Juice();
    }
 
    public void setWater() {
        System.out.println("Step 1 : Adding water into the juicer");
        getJuice().setWater(40);
    }
 
    public void setFruit() {
        System.out.println("Step 2 : Adding fruit into the juicer");
        getJuice().setFruit(4);
    }
 
    void setSugar() {
        System.out.println("Step 3 : Adding sugar into the juicer");
        getJuice().setSugar(10);
    }
 
    void setIceCube() {
        System.out.println("Step 4 : Adding 5 to 6 numbers of ice cubes into the juicer");
        getJuice().setIceCube(6);
    }
 
    void setJuiceType() {
        System.out.println("orange");
        getJuice().setJuiceName("orange");
    }
 
}