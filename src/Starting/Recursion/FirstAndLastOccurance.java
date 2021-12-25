package Starting.Recursion;

import java.util.Scanner;

public class FirstAndLastOccurance {
   public static int first = -1;
   public static int last = -1;
   public static void findOccurance(String str, int idx, char element){
       if (idx == str.length()){
           System.out.println(first);
           System.out.println(last);
           return;
       }
       char currChar = str.charAt(idx);
       if (currChar == element){
           if (first == -1){
               first = idx;
           }
           else {
               last = idx;
           }
       }
       findOccurance(str,idx+1,element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        findOccurance(str,0, 'a');


    }
}
// Time Complexity: O(n)   n is the length of String
