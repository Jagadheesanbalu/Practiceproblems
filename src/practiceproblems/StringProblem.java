/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproblems;

/**
 *
 * @author Jagadheesan Balu
 */
public class StringProblem {
    public static void main(String[] args) {
//        String s = "Jaga is awesome";
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        System.out.println(sb);
        
//        String s = "Jaga is awesome";
//        String[] sa = s.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for(int i=sa.length-1;i>=0;i--) {
//            sb.append(sa[i]);
//            sb.append(" ");
//        }
//        System.out.println(sb);
        
        String s = "Jaga is awesome yes";
        String[] sa = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=sa.length-1;i>=0;i--) {
            if(i%2==0) {
                StringBuilder sb1 = new StringBuilder(sa[i]);
                sb1.reverse();
                sb.append(sb1);
            } else
                sb.append(sa[i]);
            sb.append(" ");
        }
        System.out.println(sb);
        
    }
}
