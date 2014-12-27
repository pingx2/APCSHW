import java.util.*;
import java.io.*;

public class Driver{
    
    
    public static void main(String[] args){
	
	Random rand = new Random();
	long startTime, endTime, time;
	int n = 80000;
	int[]a = new int[n];
	int[]b = new int[n];
	int[]c = new int[n];

	for(int i = 0; i < n; i++){
	    a[i] = rand.nextInt(500);
	    b[i] = rand.nextInt(500);
	    c[i] = rand.nextInt(500);;
	}

	System.out.println("Bubble Sort");
	//System.out.println(Arrays.toString(a));
	startTime = System.currentTimeMillis();
	Sorts.BubbleSort(a);
	endTime = System.currentTimeMillis();
	//System.out.println(Arrays.toString(a));
	time = endTime - startTime;
	System.out.println(time + "");
	
	System.out.println("Insertion Sort");
	//System.out.println(Arrays.toString(b));
	startTime = System.currentTimeMillis();
	Sorts.InsertionSort(b);
	endTime = System.currentTimeMillis();
	//System.out.println(Arrays.toString(b));
	time = endTime - startTime;
	System.out.println(time + "");
	
	System.out.println("Selection Sort");
	//System.out.println(Arrays.toString(c));
	startTime = System.currentTimeMillis();
	Sorts.SelectionSort(c);
	endTime = System.currentTimeMillis();
	//System.out.println(Arrays.toString(c));
	time = endTime - startTime;
	System.out.println(time + "");

	
    }    
    

}
