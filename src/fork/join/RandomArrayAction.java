/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fork.join;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Jagadheesan Balu
 */
public class RandomArrayAction extends RecursiveAction {
    
    private int[] myArray;
    private int start;
    private int end;
    private int threshold;

    public RandomArrayAction(int[] myArray, int start, int end, int threshold) {
        this.myArray = myArray;
        this.start = start;
        this.end = end;
        this.threshold = threshold;
    }

    
    protected void compute() {
        if(end-start<threshold){
            for(int i=start;i<=end;i++){
                myArray[i] = ThreadLocalRandom.current().nextInt();
            }
        } else {
            int mid = (end - start)/2 + start;
            RandomArrayAction t1 = new RandomArrayAction(myArray, start, mid, threshold);
            RandomArrayAction t2 = new RandomArrayAction(myArray, mid+1, end, threshold);
            invokeAll(t1,t2);
        }
    }

    
}
