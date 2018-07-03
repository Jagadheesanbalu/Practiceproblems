/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproblems;

import java.util.HashMap;

/**
 *
 * @author Jagadheesan Balu
 */
public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String, String>();
        
        map.put("a", "abc");
        
        String res =map.get("a");
        System.out.println(res);
//        int h=map.get("a").hashCode();
//                System.out.println(h);
//        h ^= (h >>> 20) ^ (h >>> 12);
//        int res =  h ^ (h >>> 7) ^ (h >>> 4);
//        
//
//        System.out.println(res);
    }
}
