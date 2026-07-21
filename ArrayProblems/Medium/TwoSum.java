package ArrayProblems.Medium;
import java.util.*;

public class TwoSum {
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
        System.out.println("Enter the value of k");
        int k = ob.nextInt();
        int[] ans = better(arr, k);
        if(ans.length==0){
            System.out.println("No pair found");
        } else {
            System.out.println("Pair found at indices: "+ans[1]+", "+ans[0]);
        }
    }
    public static int[] brute(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] better(int arr[], int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(arr[0], 0);
        for(int i=1;i<arr.length;i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                return new int[]{i, map.get(rem)};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }
}
