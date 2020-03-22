//Given a string,s, of length N that is indexed from 0 to N-1 , 
//print its even-indexed and odd-indexed characters as 2 
//space-separated strings on a single line.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{

    public static void main(String[] args) 
    {
         
        

        Scanner input= new Scanner ( System.in);
        String S;
        int T = input.nextInt();
        input.nextLine();       
        for ( int i=0; i<T ; i++ )
        { 
            S = input.nextLine();
            char[] g = S.toCharArray(); 
            for (int j = 0; j < g.length; j++)
             { 
                System.out.print(g[j]);
                j++; 
             } 
            System.out.print(" "); 
            for (int k = 1; k < g.length; k++) 
            { 
                System.out.print(g[k]);
                k++; 
            } 
            System.out.println();
        }  
    }
}
