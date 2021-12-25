package Revision;

import java.util.Scanner;

public class MCat2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int nonrep = 0;

        for(int i = 0;i < str.length();i++) {
            int sum = 0;

            for(int j = 0 ;j < str.length();j++) {
                if(i == j) {

                }
                else if(str.charAt(i) == str.charAt(j)) {
                    sum = sum+1;
                }

            }
            if(sum == 0) {
                nonrep += 1;
            }
        }
        System.out.println(nonrep);
    }
}
