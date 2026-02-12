package SamuelKabuya_COMP254Lab2_Ex2;

public class PrefixAverageExperiment {

    public static void main (String [] args){
        int n = 100;
        int trial = 10;

        try{
            if(args.length > 0) trial = Integer.parseInt(args[0]);
            if(args.length > 1) n = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) { }

        int start = n;

        System.out.println("Testing prefixAverage1, slower one with O(n^2)");
        n = start;

        for (int t = 0; t < trial; t++) {
            double[] data = new double[n];

            long startTime = System.currentTimeMillis();
            PrefixAverage.prefixAverage1(data);
            long endTime = System.currentTimeMillis();

            long elapsed = endTime - startTime;
            System.out.println(String.format("n: %9d took %12d milliseconds", n, elapsed));
            n *= 2;
        }

            System.out.println("Testing prefixAverage2, Faster one with O(n)");
            n = start;

            for (int t = 0; t < trial; t++){
            double[] data = new double[n];

            long startTime = System.currentTimeMillis();
            PrefixAverage.prefixAverage2(data);
            long endTime = System.currentTimeMillis();

            long elapsed = endTime - startTime;
            System.out.println(String.format("n: %9d took %12d milliseconds", n, elapsed));
            n *= 2;
        }
    }
}
