package Revision;

public class AmstrongNumber {
    static void findAmstrong(int high, int low){
        for (int i=low+1;i<high;i++){
            // Number of digits calculation
            int x=i;
            int n=0;
            while (x != 0){
                x /= 10;
                ++n;
            }
            // Compute sum of nth power of its digits
            int pow_sum = 0;
            x = i;
            while (x != 0){
                int digit = x%10;
                pow_sum += Math.pow(digit,n);
                x /= 10;
            }
            // Checks if the number is amstrong
            if (pow_sum == i)
                System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 400;
        findAmstrong(num1,num2);
        System.out.println();
    }
}
