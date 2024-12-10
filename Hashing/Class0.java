package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Class0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int[] arr;
        int[] queries;

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        arr = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            int val = hashmap.getOrDefault(arr[i], 0);
            hashmap.put(arr[i], val+1);
        }

        System.out.println("Enter the total number of queries you want to check");
        int sizeQ = sc.nextInt();

        queries = new int[sizeQ];

        for (int i = 0; i < queries.length; i++) {
            int query = sc.nextInt();
            int count = hashmap.getOrDefault(query, 0);
            System.out.println("Query: "+query+" Count: "+count);
        }
}
}
