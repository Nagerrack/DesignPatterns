package Builder;

/**
 * Builder pattern Implementation
 *
 * @author Adam Dębczak
 */

public class Main {
    public static void main(String[]args)
    {
        Kitchen kitchen = new Kitchen.KitchenBuilder(3,4,"Maple 2x3m","Beko 5600W","Stainless Steel")
                .setMicrowave(true).setDishwasher(true).build();

        System.out.println(kitchen);
    }

}
