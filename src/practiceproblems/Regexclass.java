/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproblems;

/**
 *
 * @author Jagadheesan Balu
 */
public class Regexclass {
    public static void main(String[] args) {
        String split = "50$";
        split = split.trim();
        String cs_regex = "^[a-zA-Z0-9% ]+$";
        
        if(!split.matches(cs_regex)) {
            System.out.println("Not allowed");
        } else {
            System.out.println("yes");
        }
    }
}
