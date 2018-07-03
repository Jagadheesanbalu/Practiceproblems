/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fork.join;

import static java.util.concurrent.ForkJoinTask.invokeAll;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Jagadheesan Balu
 */
public class FindMaxTask extends RecursiveTask<Integer> {
     private int[] myArray;
    private int start;
    private int end;
    private int threshold;

    public FindMaxTask(int[] myArray, int start, int end, int threshold) {
        this.myArray = myArray;
        this.start = start;
        this.end = end;
        this.threshold = threshold;
    }

    @Override
    protected Integer compute() {
        if(end-start<threshold){
            int max = Integer.MIN_VALUE;
            for(int i=start;i<=end;i++){
                int n = myArray[i];
                if(n>max)
                    max = n;
            }
            return max;
        } else {
            int mid = (end - start)/2 + start;
            FindMaxTask t1 = new FindMaxTask(myArray, start, mid, threshold);
            t1.fork();
            FindMaxTask t2 = new FindMaxTask(myArray, mid+1, end, threshold);
            return Math.max(t2.compute(), t1.join());
        }
    }
}
