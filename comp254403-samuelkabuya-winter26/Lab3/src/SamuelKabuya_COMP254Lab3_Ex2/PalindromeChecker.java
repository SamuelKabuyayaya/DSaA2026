package SamuelKabuya_COMP254Lab3_Ex2;

import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String s){

        if (s.length() <= 1){
            return true;
        }

        if (Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(s.charAt(s.length() - 1))){
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: " + input + " is a palindrome.");
        }else{
            System.out.println("Result: " + input + " is not a palindrome.");
        }
        scanner.close();
    }

}
