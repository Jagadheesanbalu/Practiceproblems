/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fork.join;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Jagadheesan Balu
 */
public class MainClass {
    
    public static void main(String[] args) {
        
        int[] data = new int[1024 * 1024 * 128];
        
//        for (int i = 0; i < data.length; i++) {
//            data[i] = ThreadLocalRandom.current().nextInt();
//        }
        ForkJoinPool pool = new ForkJoinPool();
        
        RandomArrayAction a1 = new RandomArrayAction(data, 0, data.length-1, data.length/16);
        pool.invoke(a1);
        
        FindMaxTask t1 = new FindMaxTask(data, 0, data.length-1, data.length/16);
        int result = pool.invoke(t1);
        System.out.println("Find max :"+result);
        
        
    }
}
