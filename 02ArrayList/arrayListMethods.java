import java.util.*;

public class arrayListMethods{
    
    public static void collapseDuplicates(ArrayList<Integer> L){
	for(int i = 0; i<L.size()-1; i++){
	    if(L.get(i)==L.get(i+1)){
		L.remove(i);
		i--;
	    }
	}
    }

    public static void randomize(ArrayList<Integer> L){
        Random rand = new Random();
	int n = -1;
	int pos = -1;
	for(int i = L.size()-1; i>0; i--){
	    pos = rand.nextInt(i);
	    n = L.get(pos);
	    L.remove(pos);
	    L.add(n);
	}
    }

    public static void main(String[]args){
	ArrayList<Integer> A = new ArrayList<Integer>();
	
	A.add(5);
	A.add(2);
	A.add(7);
	A.add(7);
	A.add(4);
	A.add(8);
	A.add(0);
	A.add(2);
	A.add(9);
	A.add(1);
	A.add(1);
	A.add(1);

	collapseDuplicates(A);
	System.out.println(A);
	
	randomize(A);
	System.out.println(A);
	randomize(A);
	System.out.println(A);
	randomize(A);
	System.out.println(A);

    }
	
}	    
