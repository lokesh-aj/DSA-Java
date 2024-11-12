package Arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);// Creating an arraylist with an initial capacity i.e. size.

        list.add(2);//inserting a value in the list
        list.add(4);
        list.add(6);
        list.add(8);

        System.out.println(list);// displaying entire list, in string format.

        list.set(2, 12);// modifying the value at index number 2, from the value 6 to the value 12

        System.out.println(list);

        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        System.out.println(list);
        list.remove(4);// removing a value from an index
        System.out.println(list);

        //Iterating each element in the list
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }
    }
}
