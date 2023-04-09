package leetCode;
//435. Non-overlapping Intervals
//Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
//
//
public class problem1 {
    static int myarray[][]={{1,100},{11,22},{1,11},{2,12}};
            //{{1,2},{2,3},{3,4},{3,4},{3,4}};

    public static void main(String[] args) {
       // myFunction(myarray);
        twoSum(new int[]{1,2,3},9);
    }


    public static int[] twoSum(int[] nums, int target) {
        int [] myarray=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    myarray[0]=i;
                    myarray[1]=j;
                    break;
                }
            }
        }
        return myarray;
    }


//    static void myFunction(int[][] myArray){
//        int count=0;
//       for(int i=0;i<myArray.length;i++){
//        //   for(int j=0;j< myArray.length;j++){
//               if(i+1< myarray.length)
//               if(myArray[i][1]==myArray[i+1][0] || myArray[i][1]<myArray[i+1][1])
//                   System.out.println("");
//               else {
//                   System.out.println(i+" "+1+" "+(i+1)+" "+0);
//                   count++;
//                  // break;
//               }
//
//       //    }
//       }
//        System.out.println("count value is "+count);
//    }
}
