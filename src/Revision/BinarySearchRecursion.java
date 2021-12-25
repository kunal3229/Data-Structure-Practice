package Revision;

// Java representation of recursive Binary Search
public class BinarySearchRecursion {
    // Returns index of x if it is present in arr[l,r],else return -1
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - 1) / 2;

            //If the element is present at the mid itself
            if (arr[mid] == x)
                return mid;

                //If the element is smaller than mid, then
                //it can only be present in left subarray
                if (arr[mid] > x){
                    return binarySearch(arr, l, mid - 1, x);}
                //Else the element can only be present in
                //right subarray
            else{
                return binarySearch(arr, mid + 1, r, x);}
            }
        // we reach when element is not present in array
        return -1;

    }

    public static void main(String[] args) {
        BinarySearchRecursion ob = new BinarySearchRecursion();
        int arr[] = {2, 3, 4, 10, 40 };
        int l = 0;
        int r = arr.length-1;
        int x =10;
        int result = ob.binarySearch(arr, l, r, x);
        if (result == -1)
            System.out.println("Element not present ");
        else
            System.out.println("Element found at index " + result);
    }
}
//Complexity of binary search using iterative = O(1)
//Complexity of binary search using recursion = O(logN)

