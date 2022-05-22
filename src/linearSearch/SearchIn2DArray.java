package linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,4},
                {5,76},
                {34, 98, 123, 987}
        };
        int target = 987;
        int[] result = search(array, target);
        System.out.println(Arrays.toString(result));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]){
                    return new int[]{row,col};
                }
            }

        }
        return new int[]{-1,-1};
    }
}
