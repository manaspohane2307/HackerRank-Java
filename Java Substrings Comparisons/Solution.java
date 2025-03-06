import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int n = s.length();
        int n2 = n-k+1;
        String [] arr = new String[n2];
        for(int i=0;i<=n2;i++){
            arr[i] = s.substring(i,i+k);
        }
        //Arrays.sort()
        
        for (int i = 0; i < n2 - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n2; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) { // Find smallest lexicographically
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        
        smallest = arr[0];
        largest = arr[n2-1];
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}