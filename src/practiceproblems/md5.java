/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproblems;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jagadheesan Balu
 */
public class md5 {
    
    public static void main(String[] args) throws NoSuchAlgorithmException {
         
        while(true) {
        System.out.println("***********************MD5 Decrypter***********************");
        System.out.println();
        System.out.print("Enter the Hashcode:");

        Scanner sc = new Scanner(System.in);
        
        //encrypt
        /*String encryptedpassword = encrypt(pass);
        System.out.println(encryptedpassword);*/

        String input = sc.nextLine();
        
        System.out.println();
        System.out.println("Decrypting......");
        System.out.println();
        //decypt
        String decryptedpassword = decrypt(input);
        System.out.println("Decrypted value:"+decryptedpassword);
        
        }
    }
    
    private static String encrypt(String password) throws NoSuchAlgorithmException {
        
        MessageDigest md = MessageDigest.getInstance("md5");
        
        md.update(password.getBytes());
        
        byte[] b = md.digest();
        BigInteger bi = new BigInteger(1,b);
       
        String result = bi.toString(16);
        
        while(result.length() < 32)
            result = "0"+result;
        return result;
        
    }
    
    private static String decrypt(String hashpass) throws NoSuchAlgorithmException {
        
        int start= 00000000;
        int end= 99999999;
        
       for(int i=start,j=end;i<end/2 || j>=end/2;i++,j--) {
           
           //forward
           String temp = String.valueOf(i);
           while(temp.length() < 8)
            temp = "0"+temp;
           String es = encrypt(temp);
           if(es.equals(hashpass)) {
               //System.out.println("Found :"+es);
               return temp;
           }
           
           //backward
           String temp2 = String.valueOf(j);
           while(temp2.length() < 8)
            temp2 = "0"+temp2;
           String es2 = encrypt(temp2);
           if(es2.equals(hashpass)) {
               //System.out.println("Found :"+es2);
               return temp2;
           }
       } 
        return null;
    }
    
    /*for(int i=0;i<b.length;i++) {
            System.out.println(Integer.toString((b[i] & 0xff) + 0x100,16));
        
        }*/
    
}
