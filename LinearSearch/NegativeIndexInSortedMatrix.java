package LinearSearch;

public class NegativeIndexInSortedMatrix {
    public static int countNegatives(int[][] grid) {
        int negative = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j]<0){
                    negative = 0;
                }
            }
        }
        return negative;
    }

    public static void main(String[] args) {
        int[][] arr = {{5,1,0},{-5,-5,-5}};
        System.out.println(countNegatives(arr));
    }
}
