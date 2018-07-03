/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Jagadheesan Balu
 */
public class ListProblem {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();
        li.add(1);li.add(2);li.add(1);li.add(4);li.add(2);
        System.out.println(li);
        
//        Set<Integer> tr = new TreeSet<Integer>();
//        tr.addAll(li);
//        System.out.println(tr);
        
//        for(int i=0;i<li.size()-1;i++) {
//            for(int j=i+1;j<li.size();j++) {
//                if(li.get(i) == li.get(j)) {
//                    li.set(j, 0);
//                }
//            }
//        }
//        System.out.println(li);
        
//        for(int i=0;i<li.size()-1;i++) {
//            for(int j=i+1;j<li.size();j++) {
//                if(li.get(i) == li.get(j)) {
//                    li.remove(j);
//                }
//            }
//        }
        
       // List<Integer> li1 = new ArrayList<Integer>(new HashSet<Integer>(li));
        System.out.println(li);
    }
}
