package creational.builder;

public class Main {
    public static void main(String[] args) {
 
        Juice orange = Builder.takeOrder("orange");
        System.out.println(orange);
 
        Juice apple = Builder.takeOrder("apple");
        System.out.println(apple);
    }
}