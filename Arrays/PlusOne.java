package Arrays;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits){String str = null;
        for (int i = 0; i < digits.length; i++) {
            if(str==null){
                str = String.valueOf(digits[i]);
            }
            else{
                str += String.valueOf(digits[i]);
            }
        }

        int val = Integer.parseInt(str);
        val ++;
        int[] arr = new int[sizeOf(val)];
        int i = 0;
        while(val>0){
            arr[i] = val%10;
            val /= 10;
            i++;
        }
        return reverse(arr);
    }
    public static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<= end){
            int a = arr[start];
            int b = arr[end];
            int temp = b;

            b = a;
            a = temp;

            arr[start] = a;
            arr[end] = b;

            start++;
            end--;
        }
        return arr;
    }

    public static int sizeOf(int num){
        int size = 0;
        while(num>0){
            num /=10;
            size++;
        }
        return size;
    }
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
