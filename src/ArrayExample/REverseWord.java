/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayExample;
import java.util.Scanner;
/**
 *
 * @author Kaur Gurleen
 */
public class REverseWord {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        
        char[] s=new char[word.length()];
        
        int i;
        for(i=0;i<word.length();i++){
            s[i]=word.charAt(i);
            
        }
        for(int x=s.length;x>=0;x--){
        System.out.println(s[x]);
       
        
    }
        
    }}
