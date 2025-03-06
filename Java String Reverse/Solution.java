import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int n = A.length();
        boolean isPalindrome = true;
        // while(i<n){
        // if(A.charAt(i)!=A.charAt(n-i-1)){
        // isPalindrome=false;
        // break;
        // }
        // }
        for (int i = 0; i < n / 2; i++) {
            if (A.charAt(i) != A.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
