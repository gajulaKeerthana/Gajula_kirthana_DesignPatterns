package creational.builder;

public abstract class JuiceMaker {
	 
    private Juice juice;
 
    public Juice getJuice() {
        return juice;
    }
 
    public void setJuice(Juice juice) {
        this.juice = juice;
    }
 
    public final Juice makeJuice() {
        Juice juice = createJuice();
        setJuice(juice);
        setJuiceType();
        setWater();
        setFruit();
        setSugar();
        setIceCube();
        return juice;
    }
 
    abstract void setJuiceType();
 
    abstract void setWater();
 
    abstract void setFruit();
 
    abstract void setSugar();
 
    abstract void setIceCube();
 
    abstract Juice createJuice();
 
}