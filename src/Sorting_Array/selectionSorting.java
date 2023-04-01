package Sorting_Array;

import java.util.Arrays;

public class selectionSorting {
    void selectionSorting(int[] array){
        int count = 0;
        int currentSmallest;
        int nextSmallest;
        for (int i=0;i<array.length;i++){
            currentSmallest=nextSmallest=i;
            for(int j=i+1;j<array.length;j++){
                count++;
                // System.out.println("i value is "+i+" j value is  "+j);
                if(array[i]>array[j]){
                    nextSmallest=j;

                }


            }
            if(nextSmallest!=currentSmallest){
                int temp=array[nextSmallest];
                array[nextSmallest]=array[currentSmallest];
                array[currentSmallest]=temp;
            }
        }

        System.out.println(Arrays.toString(array) +" "+count);

    }
}
