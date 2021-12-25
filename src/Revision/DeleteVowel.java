package Revision;

import java.util.Scanner;

public class DeleteVowel {
    public static void main(String[] args) {
        System.out.println("enter the String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = input.replaceAll("[AEIOUaeiou]", "");
        System.out.println(result);
    }
}
