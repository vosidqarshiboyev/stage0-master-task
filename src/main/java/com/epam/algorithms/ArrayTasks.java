package com.epam.algorithms;



/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"winter","spring","summer","autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[]a=new int[length];
        for(int i=1;i<=length;i++){
            a[i-1]=i;
        }
        return a;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int a=0;
        for(int b:arr){
            a=a+b;
        }
        return a;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number){
                return i;
            }
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[]a=new String[arr.length];
        for (int i=0;i<arr.length;i++){
            a[i]=arr[arr.length-1-i];
        }
        return a;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int[]a=new int[arr.length];
        int count=0;
        int k=0;
        for(int b=0;b<arr.length;b++){
            if(arr[b]>0){
                a[k++]=arr[b];
            }
            else {
                count++;
            }

        }
        int[]b=new int[arr.length-count];
        for (int c=0;c<b.length;c++){
            b[c]=a[c];
        }
        return b;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        int[][]b=new int[arr.length][];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j+1<arr.length;j++){
                if(arr[j].length>arr[j+1].length){
                    int[]c=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=c;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            sortlash(arr[i]);
        }
return arr;
    }
    private int[]sortlash(int[] q){
        for(int i=0;i<q.length;i++){
            for(int j=0;j+1<q.length;j++){
                if(q[j]>q[j+1]){
                    int temp=q[j+1];
                    q[j+1]=q[j];
                    q[j]=temp;
                }
            }
        }
        return q;
    }

}
