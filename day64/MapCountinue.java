package day64;

import java.util.*;

public class MapCountinue {
    public static void main(String[] args) {


        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        Set<String> allName = groceryPriceMap.keySet();

        for (String eachName:allName) {
            System.out.println("eachName = " + eachName);
            System.out.println("value is = " + groceryPriceMap.get(eachName));
        }

        Collection<Double> allPrices = groceryPriceMap.values();
        System.out.println("allPrices = " + allPrices);
        List<Double> pricesCopy = new ArrayList<>(allPrices);
        System.out.println("pricesCopy = " + pricesCopy);






        
        
        Set<String> allNames = groceryPriceMap.keySet();
        System.out.println("allNames = " + allNames);

        allNames.remove("Tomato");
        System.out.println("allNames after removed tomato = " + allNames);

        System.out.println("groceryPriceMap after removed tomato = " + groceryPriceMap);

        Set<String> namesCopy = new HashSet<>(allNames);
        System.out.println("namesCopy = " + namesCopy);

        namesCopy.remove("Tomato");
        System.out.println("namesCopy after removed tomato = " + namesCopy);
        System.out.println("groceryPriceMap after removed copy of tomato = " + groceryPriceMap);







    }
}
