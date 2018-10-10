package Collections;

import java.util.HashSet;
import java.util.*;

/**
 * Created by Alexey Dvoryaninov on 23.06.2018 - (lexxzone@gmail.com)
 */

public class SetInterface {
    public static void main(String[] args) {
        /**
         * SortedSet - интерфейс который сортирует все поступающие элементы в правильном порядке
         */
        /*SortedSet<Integer> numberSet = new TreeSet<>();

        int[] array = new int[]{9, 5, 4, 2, 8, 1, 6, 3, 7, 0};

        for (int i = 0; i < array.length; i++) {
            numberSet.add(i);
        }

        System.out.println("First element of numberSet is " + numberSet.first());
        System.out.println("Last element of numberSet is " + numberSet.last());

        *//**
         *  subSet(a, b) - делает выборку из, например, sortedSet новый set с элемента a до элемента b (не включая его)
         *//*
        SortedSet<Integer> subSet = ((TreeSet<Integer>) numberSet).subSet(0, 4);

        System.out.println("SubSet равен: " + subSet);
        System.out.println("\n------------------------------------\n");
*/
        /*
         *  NavigableSet - интерфейс
         */

        String [] brands = {"Dell", "IBM", "Apple", "Samsung", "Microsoft", "Asus", "HP"};

        List<String> listBrand = Arrays.asList(brands);

        System.out.printf("%s ", listBrand);


        Set<String> set = new HashSet<String>(listBrand);




    }
}
