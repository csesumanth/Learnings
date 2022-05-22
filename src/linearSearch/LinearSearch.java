package linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,-1,98,8};
        int result = linearSearch(arr, 88);
        if(result != -1){
            System.out.println(result);
        }    else{
            System.out.println("element not found!!!");
        }
    }

    private static int linearSearch(int[] arr, int target) {
        if (arr == null || arr.length==0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (target == arr[index]){
                return index;
            }
        }
        return -1;
    }
}
