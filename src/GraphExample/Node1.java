package GraphExample;

import java.util.ArrayList;

public class Node1 {
    int data;
    Node1 left;
    Node1 right;

    ArrayList<Integer> a=new ArrayList<>();
    Node1(int data){
        this.data=data;
        this.left=
        this.right= null;
        a.add(data);

        System.out.print(data+" ");
    }
   //to print the list of all nodes added
   //    public void printNodes(){
   //        for (int num : a){
   //            System.out.print(num+" ");
   //
   //        }
   //    }
}
