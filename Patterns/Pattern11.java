import java.util.*;
public class Pattern11 {
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = ob.nextInt();
        int c = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
                if(c==1){
                    c=0;
                }
                else{
                    c=1;
                }
            }
            System.out.println();
        }
    }
}
