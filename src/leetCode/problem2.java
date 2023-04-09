package leetCode;

import java.util.Arrays;

public class problem2 {
    static int[] array1={1,2,3,4};
   static  int[] array2={2,3,4};
    public static void main(String[] args) {
        add(array1,array2);
    }
    static void add(int []a,int[] b){

        int ii=0;
        StringBuilder number1=new StringBuilder();
        StringBuilder number2=new StringBuilder();
        System.out.println();
        //return finalResult;
        for(int i:a){
            number1.append(i);
        }
        for(int i:b){
            number2.append(i);
        }
        int result=Integer.parseInt(String.valueOf(number1))+Integer.parseInt(String.valueOf(number2));
        int[] finalResult=new int[String.valueOf(result).length()];
        System.out.println(result);
        while(result>0){

            finalResult[ii]=result%10;
            System.out.println(result%10+ " "+finalResult[ii]);
            result=result/10;
            ii++;
        }
        System.out.println(Arrays.toString(finalResult));
    }
}
