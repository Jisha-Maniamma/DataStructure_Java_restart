package binary;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    static int min,max,mid;
    static int position=0;

    static Scanner scan= new Scanner(System.in);




    public static void main(String[] args) {
        System.out.println("Game on sorted array...");
        System.out.println(" Would you like to enter the array? enter y or n ");
        String choice= scan.nextLine();
        if(choice.equals("y")){
            int[] myarray=enterInput();
            System.out.println("Entered array is "+Arrays.toString(myarray));
            System.out.println("the best possible location of "+40+" is "+searchInsert(myarray,40));
        }
        else
            System.out.println("ok see you next time when you are ready");


    }

    private static int[] enterInput() {

        System.out.println("enter size of your array: ");
        int size=scan.nextInt();
        int[] userArray=new int[size];
        for(int i=0;i<size;i++){
            System.out.println(" enter the element "+i+" :");
            userArray[i]=scan.nextInt();


        }
        return userArray;
    }

    public static int searchInsert(int[] nums, int target) {
        int target_position=0;
        min=0;
        max=nums.length-1;
        mid=(min+max)/2;
        while(min<=max){

            if(nums[mid]>target){
                max=mid-1;
             //   System.out.println("1 min: "+min+" max: "+max);
            }
            else if(nums[mid]==target){
             //   System.out.println("2 min: "+min+" max: "+max);
                System.out.println("the value already exists");
                return mid;
            }
            else{
             //   System.out.println("3 min: "+min+" max: "+max);
                min=mid+1;
            }
            mid=(min+max)/2;
        }

        return max+1;

    }
}
