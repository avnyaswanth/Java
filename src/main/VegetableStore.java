package main;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VegetableStore {
    public static int totalPrice(Map<String, Pair> veggies, Map<String, Integer> cart) {
        int cost = 0;

        for(Map.Entry<String, Integer> entry : cart.entrySet()) {
            Pair p =  veggies.get(entry.getKey());

            int kgs = entry.getValue();
            p.setQuantity(p.getQuantity() - kgs);
            cost += (kgs)*(p.price);
        }

        String disc = "0%";

        System.out.println("Gross price = " + cost);

        if(cost >= 500 && cost < 1000) {
            disc = "5%";
            cost = (int) (cost - (0.05 * cost));
        }
        else if(cost >= 1000) {
            disc = "10%";
            cost = (int) (cost - (0.1 * cost));
        }

        System.out.println("Discount percentage = " + disc);

        return cost;
    }

    public static void main(String[] args) {
        Map<String, Pair> vegetables = new HashMap<>();
        vegetables.put("Carrot", new Pair(100, 20));
        vegetables.put("Brinjal", new Pair(50, 30));
        vegetables.put("Potato", new Pair(120, 50));
        vegetables.put("Tomato", new Pair(200, 40));
        vegetables.put("Beans", new Pair(75, 25));

        Map<String, Integer> cart = new HashMap<>();

        // items will be added to the cart
        Scanner sc = new Scanner(System.in);

        String veg;
        int quantity;
        int n = sc.nextInt();
        for(int i=0;i<n;++i) {
            veg = sc.next();
            quantity = sc.nextInt();
            cart.put(veg, quantity);
        }

        System.out.println("Net Price = " + totalPrice(vegetables, cart));

    }
}
