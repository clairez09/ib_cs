package NovemberEleven;

import java.util.Arrays;

public class psuedocode {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int temp1 = arr[0];
        int temp2 = arr[1];
        for (int i=2;i<n-1;i++){
            arr[i-2]=arr[i];
        }
        arr[n-2]=temp1;
        arr[n-1]=temp2;
        System.out.println("Array after shifting left by two position: " + Arrays.toString(arr));
    }    
}
