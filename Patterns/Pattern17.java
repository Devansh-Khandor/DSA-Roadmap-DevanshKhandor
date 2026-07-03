import java.util.*;

public class Pattern17 {
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = ob.nextInt();
        char c = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(j<=n-i || j>=n+i){
                    System.out.print(" ");
                }
                else{
                    System.out.print((char)(c+(Math.abs(n-j)-i+1)*-1));
                }
            }
            System.out.println();
        }
    }
}
