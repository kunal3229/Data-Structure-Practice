package Revision;

import java.util.*;

public class MCat {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        System.out.println("give the size of first array");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("now give the digits of first array");
        for(int i = 0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }


        System.out.println("give the size of second array");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.println("now give the digits of second array");
        for(int i = 0;i<n;i++) {
            arr2[i] = sc.nextInt();
        }


        int c = m + n;
        int arrfinal[] = new int[c];
        System.arraycopy(arr1, 0, arrfinal, 0, n);
        System.arraycopy(arr2, 0, arrfinal, n, m);
        for(int item: arrfinal){
            System.out.print(item + " ");
        }
        System.out.println();


        for(int i = 0; i<c;++i)  {
            int minind = i;
            for(int j = i;j<c;j++) {
                if(arrfinal[j]<arrfinal[minind]) {
                    minind = j;
                }
            }
            int temp = arrfinal[i];
            arrfinal[i] = arrfinal[minind];
            arrfinal[minind] = temp;
            System.out.println(arrfinal[i]);
            break;
        }

    }
}
