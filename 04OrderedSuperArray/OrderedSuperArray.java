public class OrderedSuperArray extends SuperArray{

    public OrderedSuperArray(){
	array = new String[10];
    }
    
    public OrderedSuperArray(int c){
	array = new String[c];
    }

   public void add(String s){
	int i;
	for(i = size(); i > 0; i--){
	    if(get(i-1).compareTo(s) <= 0){
		break;
	    }
	}
	super.add(i, s);
    }
    
    
    public void add(int i, String s){
	add(s);
    }

    public String set(int i, String s){
	super.remove(i);
	add(s);
	//return 
    }

    public int find(String s){
	int x = 0;
	int y = size();
	int m = (x+y)/2;
	int index = -1;
	while(x <= y){
	    if(array[m].comparesTo(s) >= 0){
		if(array[m].comparesTo(s) = 0){
		    index = m;
		}
	        y = m;	
	    }
	    else{
		x = m;
	    }
	    m = (x+y)/2;
	}
	return index;		
    }
    
    public static void main(String[]args){
	
	OrderedSuperArray array = new OrderedSuperArray();
	array.add("b");
	array.add("dog");
	array.add("a");
	array.add("c");
	array.add("A");
	System.out.println(array.toString());
    }

}     
