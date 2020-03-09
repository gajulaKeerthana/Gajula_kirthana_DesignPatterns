package creational.builder;

public class AppleJuice extends JuiceMaker {
    Juice createJuice() {
        return new Juice();
    }
 
    public void setWater() {
        System.out.println("Step 1 : Adding water into the juicer");
        getJuice().setWater(50);
    }
 
    public void setFruit() {
        System.out.println("Step 2 : Adding fruit into the juicer");
        getJuice().setFruit(6);
    }
 
    void setSugar() {
        System.out.println("Step 3 : Adding sugar into the juicer");
        getJuice().setSugar(20);
    }
 
    void setIceCube() {
        System.out.println("Step 4 : Adding 7 to 8 numbers of ice cubes into the juicer");
        getJuice().setIceCube(8);
    }
 
    void setJuiceType() {
        System.out.println("apple");
        getJuice().setJuiceName("apple");
    }
 
}