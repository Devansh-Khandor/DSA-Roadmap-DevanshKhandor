import java.util.*;
public class Pattern9 {
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = ob.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(j>n-i && j<=n+i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(j>=i && j<=2*n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
