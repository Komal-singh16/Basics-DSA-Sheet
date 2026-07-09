import java.util.Scanner;

public class HollowDiamondStarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            //1st upper
            for(int j=1;j<=i;j++) System.out.print("*");

            for(int j=i;j<n;j++) System.out.print(" ");

            for(int j=i;j<n;j++) System.out.print(" ");

            for(int j=1;j<=i;j++) System.out.print("*");

            System.out.println();
        }
        for(int i=1;i<=n;i++){
            //1st upper
            for(int j=1;j<=i;j++) System.out.print("*");

            for(int j=i;j<n;j++) System.out.print(" ");

            for(int j=i;j<n;j++) System.out.print(" ");

            for(int j=1;j<=i;j++) System.out.print("*");

            System.out.println();
        }
        sc.close();
    }
}
