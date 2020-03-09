package creational.builder;

public class Juice {
	 
    private int water;
    private int fruit;
    private int sugar;
    private int icecube;
    private String juicename;
 
    public int getWater() {
        return water;
    }
 
    public void setWater(int water) {
        this.water = water;
    }
 
    public int getFruit() {
        return fruit;
    }
 
    public void setFruit(int fruit) {
        this.fruit = fruit;
    }
 
    public int getSugar() {
        return sugar;
    }
 
    public void setSugar(int sugar) {
        this.sugar = sugar;
    }
 
    public int getIceCube() {
        return icecube;
    }
 
    public void setIceCube(int icecube) {
        this.icecube= icecube;
    }
 
    public String getJuiceName() {
        return juicename;
    }
 
    public void setJuiceName(String juicename) {
        this.juicename= juicename;
    }
 
    public String toString() {
        return "Cold" + juicename + "!!!!  [" + water + " ml of water, " + fruit + "as a fruit, " + sugar +
            " gm of sugar, " + icecube + " ml of " + juicename + "]\n";
    }
 
}