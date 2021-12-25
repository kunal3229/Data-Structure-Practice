package Starting.Recursion;

import java.util.Scanner;

public class StringReverse {
    public static void printRev(String str, int idx){
        if (idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str,idx-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        printRev(str, str.length()-1);
    }
}
// Time Complexity: O(n)  n is the length of string
