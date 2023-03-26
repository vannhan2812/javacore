import Entity.Inventory;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str = new String("abc");
        str.concat("-xyz");
        String str2 = str.concat("=zyx");
        System.out.println(str);
        System.out.println(str2);
    }

}