package Revision;

import java.util.Scanner;

public class AbudantNumber { // Abudant Number is that number in which sum of divisors of given number is greater than number itself
    public static void main(String[] args) {
        int num, temp;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int sum=0;
        for (int i =1; i < num;i++){
            if (num %i == 0)
            {
                sum = sum + i;
            }
        }
        if (num < sum )
            System.out.println("Abudant Number");
        else
            System.out.println("Not Abudant Number");
    }
}
