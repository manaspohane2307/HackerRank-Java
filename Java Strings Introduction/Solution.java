import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len_a = A.length();
        int len_b = B.length();
        System.out.println(len_a+len_b);
        
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        
        String a = Character.toUpperCase(A.charAt(0))+A.substring(1);
        String b = Character.toUpperCase(B.charAt(0))+B.substring(1);
        System.out.println(a+" "+b);
       
    }
}
