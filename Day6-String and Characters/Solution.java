import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int a = 1; a <= T; a++) {
            String s = scan.next();
            add(s);
        }
    }
    static void add(String s) {
        int length = s.length();
        String x = "", y = "";
        
        for(int j=0 ; j<length ; j++)
        {
            if(j%2 == 0)
            {
                x += s.charAt(j);
            }
            if(j%2 == 1)
            {
                y += s.charAt(j);
            }
        }
        System.out.println(x + " " + y);
    }
}