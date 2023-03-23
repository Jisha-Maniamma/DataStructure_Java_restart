package binarySearch_and_insert;

import java.util.Scanner;

public class searchAndInsert {
    public static int toSearch;
    public static int arraysize;
    private static int[] myArray;
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        getIntegerTosearch();


        System.out.println("enetr array size you want to play with");
        arraysize=scan.nextInt();
        getarray(arraysize);


    }
    private static void getIntegerTosearch(){
        System.out.print("enter your integer that you want to search: ");
        if(scan.hasNextInt())
        { toSearch=scan.nextInt();
            System.out.println(toSearch);}
        else
            System.out.println("Enter a valid number");
    }



}
