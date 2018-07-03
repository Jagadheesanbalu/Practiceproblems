/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproblems;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jagadheesan Balu
 */
public class GridWayCount {

    static boolean flag=false;
    static int count;
    
    public static void main(String[] args) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                //process(i,j);
                process(i,j);
            }
        }
        
        System.out.println(count);
    }
    
    public static void process(int a , int b){
        
        while(a!=2 || b!=2) {
            if(flag) {
                if(a!=2)
                    a++;
                flag=false;
            }else {
                if(b!=2)
                    b++;
                flag=true;
            }
            process(a,b);
        }
        count++;
        //return a+","+b;
    }
}
