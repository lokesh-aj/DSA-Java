package Arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>(candies.length);
        int max = 0;

        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>max){
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            int greatest = candies[i]+extraCandies;

            if(greatest>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        System.out.println(kidsWithCandies(arr, 3));
    }
}
