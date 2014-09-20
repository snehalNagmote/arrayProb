/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayprob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class ArrayProb {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ArrayProb ex=new ArrayProb();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;   
        System.out.println("Enter string to match: ");
        input = br.readLine();
        boolean value = ex.MatchString(input);
        if(!value)
            System.out.println("It does not have unique values");
        else
            System.out.println("It has unique values");  
    }
    
    public boolean MatchString(String match){
        for(int i=0;i<match.length()-1;i++)
        {
            char ar[]=match.toCharArray();
            if(ar[i]==ar[i+1])
            {
             return false;   
            }
        }
         return true;
    }
    
}
