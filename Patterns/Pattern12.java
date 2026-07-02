import java.util.*;
public class Pattern12 {
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = ob.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n;j++){
                if(j>=1 && j<=i){
                    System.out.print(j);
                }
                else if(j>2*n-i && j<=2*n){
                    System.out.print(2*n-j+1);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
