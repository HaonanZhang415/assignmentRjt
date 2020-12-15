package homework1209;

import java.util.ArrayList;
import java.util.Arrays;

public class Solutions1209 {

    public int findSumOfTwo(int a, int b) {
        return a + b;
    }

    public int findSumOfN(ArrayList<Integer> numberlist) {
        int result = 0;
        for (Integer number : numberlist) {
            result = result + number;
        }
        return result;
    }

    public int findLargestAmongThree(int a, int b, int c) {
        int maxValue = a;
        if (b > maxValue) {
            maxValue = b;
        }
        if (c > maxValue) {
            maxValue = c;
        }
        return maxValue;
    }

    public void printTriangle() {
        String symbol = "*";
        for (int i = 1; i < 6; i++) {
            System.out.println(symbol.repeat(i));
        }
    }

    public boolean checkPalindrome (Integer number) {
        String numberString = number.toString();
        int length = numberString.length();
        for (int i = 0; i < length / 2; i++) {
            if (numberString.charAt(i) != numberString.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solutions1209 sol = new Solutions1209();
        System.out.println(sol.findSumOfTwo(43, 45));
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(4, 6, 5, 2, 1));
        System.out.println(sol.findSumOfN(numList));
        System.out.println(sol.findLargestAmongThree(4, 6, 5));
        sol.printTriangle();
        System.out.println(sol.checkPalindrome(12900921));
    }

}
