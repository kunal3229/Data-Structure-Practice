package Starting.Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void TOH(int n, String src, String helper, String dest){
        if (n==1){
            System.out.println("Transfer disk "+ n + " from " +src+ " to " +dest);
            return;
        }
        TOH(n-1, src, dest, helper);
        System.out.println("Transfer disk "+ n + " from " +src+ " to " +dest);
        TOH(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of disks: ");
        int n = sc.nextInt();
        TOH(n, "S", "H", "D");

    }
}
// Time Complexity: O(2^n-1) ~ O(2^n)
//    Steps:
//        T(n) = 2T(n-1)+1
//        T(n-1)= 2T(n-2)+1
//        T(1)= 1
