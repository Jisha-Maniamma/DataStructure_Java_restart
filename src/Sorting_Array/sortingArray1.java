package Sorting_Array;

public class sortingArray1 {
   static int[] input={5,2,3,1};

//    Input: nums = [5,2,3,1]
//    Output: [1,2,3,5]

    public static void main(String[] args) {
       new bubbleSorting().bubbleSortarray(input);
        new selectionSorting().selectionSorting(input);
        new insertionSorting(input);
    }


}
