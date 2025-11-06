package NovemberSixth;

public class RecursionDojoFive {
    static int index = 0;
    public static Boolean isSorted(int arr[]){
        if (index == arr.length - 1) {
            index=0;
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        index+=1;
        return isSorted(arr);
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 3, 2, 1};

        System.out.println(isSorted(arr1)); // true
        System.out.println(isSorted(arr2)); // false
    }
}
