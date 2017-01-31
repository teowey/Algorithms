/**
 * Created by teowey on 31/01/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bubble {

    /*
     * @params 
     */
    public static void bubbleSort(int[] a){
        int totalSwaps=0;

        if(a.length == 0) System.out.println("Array is empty");

        for (int i=0; i<a.length;i++){
            int numSwaps = 0;
            for (int j=0; j<a.length-1;j++){
                if (a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    numSwaps++;
                }
            }
            totalSwaps = numSwaps;
            if (numSwaps==0) break;
        }
        System.out.println(totalSwaps);
        System.out.println(a[0]);
        System.out.println(a[a.length-1]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        bubbleSort(a);
    }
}
