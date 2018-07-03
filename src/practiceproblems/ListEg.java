/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Jagadheesan Balu
 */
public class ListEg {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        
        list.add("abc");
        list.add("bcd");
        list.add("cde");
        
        ListIterator<String> li = list.listIterator(list.size());
        
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
        
    }
}
