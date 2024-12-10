package Hashing;

import java.util.HashMap;

public class Question6 {
    public static void main(String[] args) {
        int[] arr = {3,2,3,3,1};
        int k = 2;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i], i);
            }
            else{
                int distance = i-hm.get(arr[i]);
                if(distance<=k){
                    System.out.println("Yes.");
                    return;
                }
            }
        }
        System.out.println("No.");
    }
}
