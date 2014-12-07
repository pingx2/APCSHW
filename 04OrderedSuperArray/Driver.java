import java.util.*;

public class Driver{

    public static void main(String[]args){
	
	Random rand = new Random();
	SuperArray array = new SuperArray();
	
	OrderedSuperArray array2 = new OrderedSuperArray();
	/*
	  real    0m55.886s
	  user    0m0.000s
	  sys     0m0.031s
	*/

	for(int i = 0; i < 70000; i++){
	    array.add(""+ rand.nextInt(1000));
	    array2.add(""+ rand. nextInt(5000));
	}
	
	//System.out.println(array.toString());
	
	array.selectionSort(); 
	/*
	  real    1m43.037s
	  user    0m0.000s
	  sys     0m0.015s
	*/

	array.insertionSort();
	/*
	  real    1m15.188s
	  user    0m0.015s
	  sys     0m0.000s
	*/

	
	
	
	    
	//System.out.println(array.toString());
    }
}
