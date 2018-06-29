package Decorator;

/**
 * Decorator pattern Implementation
 *
 * @author Adam Dębczak
 */
public class Main {
    public static void main(String[]args)
    {
        Pancake plain = new PlainPancake();
        plain.Serve();
        Pancake withBlueberries = new Blueberries(new PlainPancake());
        withBlueberries.Serve();
        Pancake all = new Blueberries(new Sprinkles(new MapleSyrup(new PlainPancake())));
        all.Serve();
    }
}
