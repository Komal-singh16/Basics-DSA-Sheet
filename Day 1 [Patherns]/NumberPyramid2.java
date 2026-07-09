import java.util.Scanner;

public class NumberPyramid2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            //spaces loop
            for(int k=n;k>i;k--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            //last part
            for(int l=1;l<i;l++){
                System.out.print(i-l+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
