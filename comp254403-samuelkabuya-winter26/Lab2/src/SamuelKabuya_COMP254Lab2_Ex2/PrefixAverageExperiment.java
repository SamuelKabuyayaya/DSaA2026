package SamuelKabuya_COMP254Lab2_Ex2;

public class PrefixAverageExperiment {

    public static void main (String [] args){
        int n = 1000;
        int trial = 10;

        try{
            if(args.length > 0) trial = Integer.parseInt(args[0]);
            if(args.length > 1) n = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {}
        int star = n;

    }

}
