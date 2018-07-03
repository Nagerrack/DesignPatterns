package Builder;

/**
 * Builder pattern Implementation
 *
 * @author Adam Debczak
 */
public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen.KitchenBuilder(3, 4, "Maple 2x3m", "Beko 5600W", "Stainless Steel")
                .setMicrowave(true).setDishwasher(true).build();


        Kitchen kitchen2 = new Kitchen.KitchenBuilder(2, 2, "Oak 2x2.5m", "Electrolux 4800@", "Stone")
                .build();

        System.out.println(kitchen);
        System.out.println(kitchen2);

    }

}
