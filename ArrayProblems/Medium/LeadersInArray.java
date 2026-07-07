package ArrayProblems.Medium;

import java.util.*;

public class LeadersInArray {
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of elements in your array");
        int n = ob.nextInt(); 
        int arr[] = new int[n]; 
        System.out.println("Start entering your elements");

        for(int i=0;i<arr.length;i++){
            System.out.print("Element "+(i+1)+": ");
            arr[i] = ob.nextInt();
            System.out.println();
        }
        ArrayList<Integer> leaders = leaders(arr);
        System.out.println(leaders);
    }
    public static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[arr.length-1];
        list.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=max){
                list.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}
