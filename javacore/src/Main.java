import Entity.Inventory;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Inventory> inventories = Arrays.asList(
                new Inventory(1L,1L,2),
                new Inventory(2L,2L,1),
                new Inventory(3L,3L,8),
                new Inventory(4L,3L,4),
                new Inventory(3L,3L,9),
                new Inventory(3L,3L,5)
        );
        List<Inventory> secondLargestInv;
        secondLargestInv = inventories
                .stream().sorted(Comparator.comparing(Inventory::getQuantity))
                .collect(Collectors.toList());
//        secondLargestInv = secondLargestInv.stream()
//                        .max(Comparator.comparing(Entity.Inventory::getQuantity)).stream().collect(Collectors.toList());
        System.out.println(secondLargestInv.get(secondLargestInv.size()-1));

    }

}