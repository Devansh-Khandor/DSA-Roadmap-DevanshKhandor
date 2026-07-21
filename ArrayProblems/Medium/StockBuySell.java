package ArrayProblems.Medium;

import java.util.*;

public class StockBuySell {

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
        System.out.println("Maximum profit possible is: "+maxProfit(arr));
    }

    public static int maxProfit(int[] arr) {
        int min = arr[0];
        int profit = 0;
        for(int i=1;i<arr.length;i++){
            profit = Math.max(profit, arr[i]-min);
            min = Math.min(min, arr[i]);
        }
        return profit;
    }
}
