package creational.builder;

public class Builder {
	 
    public static Juice takeOrder(String juiceType) {
 
        JuiceMaker juiceMaker = null;
 
        if (juiceType.equalsIgnoreCase("orange")) {
            juiceMaker = new OrangeJuice();
        } else if (juiceType.equalsIgnoreCase("apple")) {
            juiceMaker = new AppleJuice();
        } else {
            System.out.println("Sorry we don't take order for  " + juiceType);
        }
        return juiceMaker.makeJuice();
    }
 
}