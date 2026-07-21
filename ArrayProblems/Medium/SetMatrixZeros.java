package ArrayProblems.Medium;

import java.util.*;

public class SetMatrixZeros {

    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = ob.nextInt();
        System.out.println("Enter the number of columns:");
        int m = ob.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = ob.nextInt();
            }
        }
        setZeroes(arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;

        boolean r[] = new boolean[rows];
        boolean c[] = new boolean[columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(arr[i][j]==0){
                    r[i] = true;
                    c[j] = true;
                }
            }
        }

        for(int i=0;i<rows;i++){
            if(r[i]==true){
                for(int j=0;j<columns;j++){
                    arr[i][j] = 0;
                }
            }
        }

        for(int i=0;i<columns;i++){
            if(c[i]==true){
                for(int j=0;j<rows;j++){
                    arr[j][i] = 0;
                }
            }
        }
    }
}
