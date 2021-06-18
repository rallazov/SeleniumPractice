package Collections;

import java.util.*;

public class SetwithInteger {
    public static void main(String[] args) {
//        1. Create  String type of set which you can add null value

//        2. Add these elements into set. (Tom, John, Alex, Peter, null, Tom)

//        3. Get size of set


//        5. Add that list into set and print the set

        Set<String> text =  new HashSet(Arrays.asList("Tom", "John", "Alex", "Peter", null, "Tom"));
        System.out.println(text);
        System.out.println(text.size());
//        4. Create a String type of ArrayList and add Oliver and William into list
        List names = new ArrayList<>();
        names.add("Oliver");
        names.add("William");
        text.addAll(names);
        System.out.println(text);


    }
}
