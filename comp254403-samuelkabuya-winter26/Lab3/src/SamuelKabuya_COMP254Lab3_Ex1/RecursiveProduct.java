package SamuelKabuya_COMP254Lab3_Ex1;

public class RecursiveProduct {

    public static int multiply(int m, int n) {
        if (n == 1) {
            return m;
        }

        if (n == 0 || m == 0) {
            return 0;
        }

        return m + multiply(m, n -1);
    }

    public static void main (String[] args){
        int m = 5;
        int n = 4;

        int result = multiply(m, n);

        System.out.println("Multi[lying " + m + " by " + n);
        System.out.println("Result: " + result);
    }
}




