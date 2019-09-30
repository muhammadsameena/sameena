package M3_Ass6; /**
 * Given an array of integers Find the mean, median, mode, standard deviation
 * and variance.
 * 
 * Mean
 * Input : [1,2,3,4,5]
 * Output : 3.0
 * 
 * Median
 * Input : [1,2,3,4,5]
 * Output : 3.0
 * 
 * Mode
 * Input : [1,1,2,2,3]
 * Output : [1,2]
 * 
 * Variance
 * Input : [1,2,3,4,5]
 * Output : 2.0
 * 
 * Standard Deviation
 * Input : [1,2,3,4,5]
 * Output : 1.41421356
 * 
 * @author Siva Sankar
 */

import java.util.*;

public class Stats {

    /**
     * This method should return the mean of the elements of the array.
     * If the arr is empty (length is 0), return the mean as 0.
     * @param arr, the input array contians elements.
     * @return the mean of the array.
     */
    public static double mean(int[] arr) {
        //  Your code goes here....
        double mean=0;
        for(int i=0;i<arr.length;i++)
            mean=mean+arr[i];
        {
            return mean;
        }
    }

    /**
     * This method returns the median of the elements of the array.
     * Prerequisite : The array should be sorted to find the median.
     * 
     * Hint : Arrays.sort(arr) sorts the elements of the array.
     * 
     * @param arr, the input array contains random elements (not in sorted order)
     * @return the median of the elements of the array.
     */
    public static double median(int[] arr) {
        //  Your code goes here...
        Arrays.sort(arr);
        double median;
        if (arr.length % 2 == 0)
            median=(arr[(arr.length - 1) / 2] + arr[arr.length/ 2]) / 2.0;
        else
            median= arr[arr.length/ 2];
        return median;
    }

    /**
     * This method returns the mode of the array. If there is no mode, then it returns
     * 0 as the mode.
     * 
     * @param arr, the input array.
     * @return the mode of the array, 0 otherwise if there is no mode.
     */
    public static int mode(int[] arr) {
        //  Your code goes here....
        int maxv = 0, maxc = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count += 1;
                }
                if (count > maxc) {
                    maxc = count;
                    maxv = arr[i];
                }
            }
        }

        return maxv;

    }

    /**
     * This method returns the variance of the input array.
     * Make use of the mean functon which has already written.
     * 
     * @param arr, the input array
     * @return the variance of the array.
     */
    public static double variance(int[] arr) {
        //  Your code goes here....
        double sum=0;
        double variance=0;
        for(int i=0;i<arr.length;i++) {
            double a = arr[i] - mean(arr);
            sum = sum + a;
        }
        variance = sum / arr.length;
        {
            return variance;
        }
    }


    /**
     * This method returns the standard deviation of the array.
     * Hint : You can find the square root using Math.sqrt() method.
     * @param arr, the input array
     * @return the standard deviation of the input array.
     */
    public static double standardDeviation(int[] arr) {
        //  Your code goes here....
        double sum=0,sd=0;
        for(double num:arr){
            sum+=num;
        }
        double mean=sum/arr.length;
        for(double num:arr) {
            sd += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sd/arr.length);
    }
}