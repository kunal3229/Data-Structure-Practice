package Revision;

import java.util.Scanner;

public class TimePass {
    public static void main(String[] args) {
        int n, i ,j;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i=1;i<=n;i++){
            for (j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){


                System.out.print("*");}
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
