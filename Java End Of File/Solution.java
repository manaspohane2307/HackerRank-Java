import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int lineno = 1;
        
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(lineno + " " + line);
            lineno++;
        }
        sc.close();
    }
}
