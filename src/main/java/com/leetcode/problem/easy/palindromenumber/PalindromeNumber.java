package com.leetcode.problem.easy.palindromenumber;

import java.util.Random;

public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber pN = new PalindromeNumber();
        Random random = new Random();
        for (int i= 0; i < 10; i++) {
            int x = random.nextInt(1000);
            System.out.println("Является ли число " + x + " палиндромом? " + pN.isPalindrome(x));
        }
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversNumber = 0;
        while(x > reversNumber) {
            reversNumber = reversNumber * 10 + x % 10;
            x /= 10;
        }
        return x == reversNumber || x == reversNumber / 10;
    }
}
