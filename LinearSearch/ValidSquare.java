package LinearSearch;

public class ValidSquare {
    public static boolean isPerfectSquare(int num) {
        long start = 0;
        long end = 100;

        while(start<=end){
            long mid = start + (end-start)/2;
            long sqre = mid*mid;
            if(sqre==num){
                return true;
            } else if (sqre<num) {
                start = mid+1;
            } else if (sqre>num) {
                end = mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(10));
    }
}
