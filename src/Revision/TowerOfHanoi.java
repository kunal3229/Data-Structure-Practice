package Revision;
import java.util.*;
public class TowerOfHanoi {
    static void hanoi(int n, char from_rod, char to_rod, char aux_rod){ // n is no. of disks  and 3 rods
        if (n==1) { // if problem has only one disk
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod); // move disk 1 from rod1 to rod3
            return;
        }
        hanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk "+ n + " from rod " + from_rod +" to rod " + to_rod);
        hanoi(n-1, aux_rod,to_rod,from_rod);
    }

    public static void main(String[] args) {
        int n = 5;
        hanoi(n, 'A', 'C', 'B');
    }
}
