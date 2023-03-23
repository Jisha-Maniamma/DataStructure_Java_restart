package binarySearch_and_insert;

import java.util.Arrays;
import java.util.Scanner;

public class searchAndInsert {
    public static int toSearch;
    public static int arraysize;
    private static int[] myArray;
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        getIntegerTosearch();


        System.out.print("enetr array size you want to play with");
        arraysize=scan.nextInt();
        getarray(arraysize);
        System.out.println(Arrays.toString(myArray));


    }
    private static void getIntegerTosearch(){
        System.out.print("enter your integer that you want to search: ");
        if(scan.hasNextInt())
          toSearch=scan.nextInt();

    }

    private static void getarray(int size){
        int position=0;
        myArray=new int[size];
        while(position<size){
            System.out.print("eneter number at position "+position+" :");
            myArray[position]=scan.nextInt();
            position++;
        }

    }


}
