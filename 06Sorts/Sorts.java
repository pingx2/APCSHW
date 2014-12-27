public class Sorts{
    
    public static String name() {
	return "Zeng, Ping Ping";
    }
    
    public static int period() {
	return 6;
    }
    
    public static void BubbleSort(int[]c){
	int t;
	boolean swap = true;
	for(int i = c.length; i > 0 ; i--){
	    if(swap){
		swap = false;
		for(int j = 1; j < c.length; j++){
		    if(c[j-1] > c[j]){
			t = c[j-1];
			c[j-1] = c[j];
			c[j] = t;
			swap = true;
		    }
		}
	    }
	}
    }
    
    public static void InsertionSort(int[]c){
	int n;
	for(int i = 1; i < c.length; i++){
	    if(c[i] < c[i-1]){
		n = c[i];
		int r = i;
		while(r > 0 && n < c[r-1]){
		    c[r] = c[r-1];
		    r--;
		}
		c[r] = n;
	    } 
	}
    }
    
    public static void SelectionSort(int[]c){
	for(int i = 0; i < c.length; i++){
	    int n = c[i];	
	    int pos = i;
	    for(int j = i+1; j < c.length; j++){
		if(n > c[j]){
		    n = c[j];
		    pos = j;
		}
	    }
	    c[pos] = c[i];
	    c[i] = n;
	}
    }

    public static int numDigits(int a){
	int n = 1;
	while(a / 10 > 0){
	    n++;
	    a = a / 10;
	}
	return n;
    }

    public static void RadixSort(int[]c){
	int max = c[0]; 
	int n = 1; 
	int length = c.length;
        for(int i = 1; i < length; i++){
            if (c[i] > max){
                max = c[i];
	    }
	}
	int d = numDigits(max);
        int[][] bucket = new int[10][d];
        while(max / n > 0){
	    for(int i = 0; i < 10; i++){
		bucket[n-1][(c[i] / n) % 10]=c[i];
	    }
	    
        {

    
}
