package Sorting_Array;

import java.util.Arrays;

public class bubbleSorting {
    void bubbleSortarray(int[] input) {
        int  count=0;
        int arrayLength= input.length;
        for(int i=0;i<arrayLength;i++){
            for(int j=i+1;j<arrayLength;j++){
                count++;
                if(input[i]>input[j]) {
                    int temp=input[i];
                    input[i] = input[j];
                    input[j]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(input)+ " "+count);
    }
}
