package ARRAY_CHALLENGE;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverse {

    public static void main(String[]args){
        String[] pallets={"B14", "A11", "B12", "A13"};

        //sorting in ascending order
        System.out.println("Sorted...");
        Arrays.sort(pallets);
        for(String pallet:pallets){
            System.out.println("-- "+pallet);
        }

        //Reversed sorted array

        System.out.println("\n Reversed");
        List<String> palletList=Arrays.asList(pallets);
        Collections.reverse(palletList);
        for (String pallet:palletList){
            System.out.println("-- "+pallet);

        }
    }
}
