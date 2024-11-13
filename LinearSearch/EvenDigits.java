package LinearSearch;

public class EvenDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int i : nums) {
            int countDigits = 0;
            int num = i;

            if(num<0){
                num = num * -1;
            }

            while (num > 0) {
                countDigits++;
                num = num / 10;
            }
            if (countDigits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896, -111, -28};

        int count = findNumbers(nums);
        if (count == 0) {
            System.out.println("No value is present with even digits");
        } else {
            System.out.println("Count :" + count);
        }
    }
}
