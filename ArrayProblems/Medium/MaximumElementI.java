package ArrayProblems.Medium;

import java.util.*;

public class MaximumElementI {
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
        System.out.println("The maximum element in the array is: "+brute(arr));
        System.out.println("The maximum element in the array is: "+loop(arr));
        System.out.println("The maximum element in the array is: "+better(arr));
        System.out.println("The maximum element in the array is: "+optimal(arr));
    }

    public static int brute(int arr[]){
        int n = arr.length;
        int ele = arr[0];
        int max_cnt = 0;
        for(int i=0;i<n;i++){
            int cnt = 1;
            for(int j=i+1;j<n;j++){
                if(arr[j]==arr[i]){
                    cnt++;
                }
            }
            if(cnt>max_cnt){
                max_cnt = cnt;
                ele = arr[i];
            }
        }
        return ele;
    }

    public static int loop(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }

    public static int better(int arr[]){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.replace(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i], 1);
            }
        }
        for(int ele: hm.keySet()){
            if(hm.get(ele)>arr.length/2){
                return ele;
            }
        }
        return -1; 
    }

    public static int optimal(int arr[]){
        int ele = 0;
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            if(cnt == 0){
                ele = arr[i];
                cnt = 1;
            }
            else{
                if(arr[i] == ele){
                    cnt++;
                }
                else{
                    cnt--;
                }
            }
        }
        return ele;
    }
}
