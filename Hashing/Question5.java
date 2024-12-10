package Hashing;

import java.util.*;

/**
 * We are given an array of Numbers. We have to find and print any number with maximum frequency and minimum frequency.*/
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {3,2,3,2,4,3};
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max_frequency_key=0;
        int max_frequency_value=0;

        for (int i = 0; i < arr.length; i++) {
            int val = hm.getOrDefault(arr[i],0);
            hm.put(arr[i],val+1);
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(max_frequency_value< entry.getValue()){
                max_frequency_value = entry.getValue();
                max_frequency_key = entry.getKey();
            }
        }
        int min_frequency_value = max_frequency_value;
        int min_frequency_key=0;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(min_frequency_value > entry.getValue()){
                    min_frequency_value = entry.getValue();
                    min_frequency_key = entry.getKey();
            }
        }

        System.out.println("Key of Maximum Frequency: "+max_frequency_key+"\nValue of Maximum Frequency: "+max_frequency_value+"\nKey of Minimum Frequency: "+min_frequency_key+"\nValue of Minimum Frequency: "+min_frequency_value);
    }
}
