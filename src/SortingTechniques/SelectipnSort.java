package SortingTechniques;

import java.util.Scanner;

public class SelectipnSort {
    void sort(int arr[]) {
        int n = arr.length;
        // One by one moving boundry of unsorted subarray
        for (int i = 0; i < n; i++) {
            // Find the min. element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }

                //Swap the found min. element with first element
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    }
        // Prints the array
        void  printArray(int arr[]){
        int n = arr.length;
            for (int i=0;i<n;++i)
                System.out.println(arr[i]+" ");
            System.out.println();
    }

    public static void main(String[] args) {
        SelectipnSort ob = new SelectipnSort();
        Scanner sc = new Scanner(System.in);

        System.out.println("Give the size of first Array: ");
        int p = sc.nextInt();
        int arr1[] = new int[p];
        System.out.println("Enter elements of first Array: ");
        for (int i=0;i<p;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Give the size of second array: ");
        int q = sc.nextInt();
        int arr2[] = new int[q];
        System.out.println("Enter elements of second array: ");
        for (int i=0;i<q;i++){
            arr2[i] = sc.nextInt();
        }

        int c = p+q;
        int arr[] = new int[c];
        System.arraycopy(arr1,0,arr,0,q);
        System.arraycopy(arr2,0,arr,q,p);
        for (int item: arr){
            System.out.println(item+" ");
        }


    }
}
