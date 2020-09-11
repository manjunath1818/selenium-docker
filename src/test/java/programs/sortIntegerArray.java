package programs;

import java.util.Arrays;

public class sortIntegerArray {
	   
    public static void main(String[] args) {
        int[] arr={2,9,3,5,4,7,1,8,6};
        int temp;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}