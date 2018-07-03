/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproblems;

/**
 *
 * @author Jagadheesan Balu
 */
public class ExceptionEg {
    public static void main(String[] args) {
        try {
            throw new NullPointerException("nullll");
        } catch (ArithmeticException ex) {
            System.out.println("exp:"+ex);
        }
        finally {
            System.out.println("finally");
        }
    }
    
    public void display() {
        throw new ArithmeticException();
    }
}
