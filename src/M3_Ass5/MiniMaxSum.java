package M3_Ass5;

/**
 * Given an array of elements, return the String that has two values separated
 * by commans. The first value is the sum of all the elements except minimum
 * and the second value is the sum of all the elements except the maximum.
 * 
 * Input : {1,2,3,4,5};
 * Output : 14,10
 * 
 * Input : {1,2}
 * Output : 2,1
 * 
 * @author Siva Sankar
 */

public class MiniMaxSum {

    /**
     * This method returns the minimum element in the array.
     * @param arr, contains the elements in arr.
     * @return the minimum element in the arr. If there are no elements, then
     * it should return -1.
     */
    public static int min(int[] arr) {
        //  Your code goes here...
        int min = arr[0];
        int n = arr.length;
        for(int j=0;j<n;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        return min;
    }

    /**
     * This method returns the maximum element in the array.
     * @param arr, contains the elements in arr.
     * @return the maximum element in the arr. If there are no elements, then
     * it should return -1.
     */
    public static int max(int[] arr) {
        //  Your code goes here...
        int max = arr[0];
        int n =arr.length;
        for(int j=1;j<n;j++){
            if(arr[j]>max){
                max = arr[j];
            }
        }
        return max;
    }

    /**
     * This method returns the sum of all the elements in the array.
     * @param arr, contains the elements in arr.
     * @return the sum of all the elements in the arr. returns -1 if there are
     * no elements.
     */
    public static int sum(int[] arr) {
        //  Your code goes here...
        int sum = 0;
        int n = arr.length;
        for(int j=0;j<n;j++){
            sum = sum+arr[j];
        }
        
        return sum;
    }
    
    /**
     * Make use of the functions defined for finding the 
     * minimum element, maximum element and the sum of all the elements of teh 
     * array arr.
     * 
     * @param arr, the input array.
     * @return the string version of maxSum and minSum separated by commas.
     */
    public static String miniMaxSum(int[] arr) {
        //  Your code goes here...
        int y = sum(arr)-min(arr);
        int z = sum(arr)-max(arr);
        String s1 =Integer.toString(y);
        String s2 = Integer.toString(z);
        String s3;
        s3=s1+","+s2;
        return s3;
    }
}