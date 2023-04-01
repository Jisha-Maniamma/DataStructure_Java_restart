package Sorting_Array;

import java.util.Arrays;

public class sortingArray1 {
   static int[] input={5,2,3,1};
   static int count;
//    Input: nums = [5,2,3,1]
//    Output: [1,2,3,5]

    public static void main(String[] args) {
        bubbleSortarray(input);
        selectionSorting(input);
    }

    private static void bubbleSortarray(int[] input) {
        int arrayLength= input.length;
        for(int i=0;i<arrayLength;i++){
            for(int j=i+1;j<arrayLength;j++){
                if(input[i]>input[j]) {
                    int temp=input[i];
                    input[i] = input[j];
                    input[j]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(input));
    }
    private static void selectionSorting(int[] array){
      //  int count = 0;
        int currentSmallest;
        int nextSmallest;
        for (int i=0;i<array.length;i++){
        currentSmallest=nextSmallest=i;
            for(int j=i+1;j<array.length;j++){
                count++;
                System.out.println("i value is "+i+" j value is  "+j);
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
