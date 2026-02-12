package SamuelKabuya_COMP254Lab2_Ex3;


import java.util.Arrays;

class Uniqueness {
    public static boolean unique1(int[] data) {
    int n = data.length;
    for (int j=0; j < n-1; j++)
        for (int k=j+1; k < n; k++)
            if (data[j] == data[k])
                return false;                    // found duplicate pair
    return true;                           // if we reach this, elements are unique
}

    public static boolean unique2(int[] data) {
        int n = data.length;
        int[] temp = Arrays.copyOf(data, n);   // make copy of data
        Arrays.sort(temp);                     // and sort the copy
        for (int j=0; j < n-1; j++)
            if (temp[j] == temp[j+1])            // check neighboring entries
                return false;                      // found duplicate pair
        return true;                           // if we reach this, elements are unique
    }
}


public class UniqnessExperiment {
    public static void findMaxN(int low, long targetTime, boolean isUnique1) {
        int n = low;
        long elapsed = 0;


        while (elapsed < targetTime) {
            int[] data = new int[n];
            for (int i = 0; i < n; i++) data[i] = i;

            long startTime = System.currentTimeMillis();

            if (isUnique1) {
                Uniqueness.unique1(data);
            } else {
                Uniqueness.unique2(data);
            }

            long endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;

            System.out.println("n: " + n + " takes " + elapsed + " ms");

            if (elapsed < targetTime) {
                n += (isUnique1 ? 5000 : 500000);
            }
        }

    }


    public static void main(String[] args) {
        System.out.println("Running Experiment for unique1 (O(n^2))");
        findMaxN(10000, 60000, true);

    }
}