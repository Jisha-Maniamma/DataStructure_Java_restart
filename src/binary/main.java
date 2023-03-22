package binary;

public class main {
    static int min,max,mid;
    static int position=0;




    public static void main(String[] args) {
        int[] myarray= {1,10,40,50,60};
        System.out.println("the value is "+searchInsert(myarray,31));

    }

    public static int searchInsert(int[] nums, int target) {
        int target_position=0;
        min=0;
        max=nums.length-1;
        mid=(min+max)/2;
        while(min<=max){

            if(nums[mid]>target){
                max=mid-1;
                System.out.println("1 min: "+min+" max: "+max);
            }
            else if(nums[mid]==target){
                System.out.println("2 min: "+min+" max: "+max);
                return mid;
            }
            else{
                System.out.println("3 min: "+min+" max: "+max);
                min=mid+1;
            }
            mid=(min+max)/2;
        }

        return max+1;

    }
}
