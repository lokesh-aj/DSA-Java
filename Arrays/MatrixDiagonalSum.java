package Arrays;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(i==j){
                    sum+= mat[i][j];
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(i!=j){
                    if(i+j== mat.length-1){
                        sum+= mat[i][j];
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
//        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr[][] = {{5}};
        System.out.println(diagonalSum(arr));
    }
}
