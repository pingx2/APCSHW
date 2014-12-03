public class SuperArray{
    String[] array;
    private int length = 0;
    
    public SuperArray(){
	array = new String[10];
    }

    public SuperArray(int c){
	array = new String[c];
    }

    public String toString(){
	String s = "";
	s += "[";
	for(int i = 0; i<size(); i++){
	    s += array[i];
	    s += ", ";
	}
	s = s.substring(0,s.length()-2);
	s += "]";
	return s;
    }

    public void resize(int newCapacity){
	if(newCapacity>0){
	    String newArray[] = new String[newCapacity];
	    for(int i = 0; i<array.length && i<newArray.length; i++){
		newArray[i] = array[i];
	    }
	    array = newArray;
	}
	else{
	    throw new IndexOutOfBoundsException();
	}
    }

    public void toResize(){
	if(length == array.length){
	    resize(array.length*2);
	}
	if(length <= 1/4*array.length){
	    resize(array.length/2);
	}
    }

    public void add(String e){
	toResize();
	array[length] = e;
	length++;
    }

    public void add(int index, String e){
	toResize();
	if(index>=0 && index<length){
	    String copy[] = new String[length];
	    for(int i = 0; i<length; i++){
		copy[i] = array[i];
    }
	    array[index] = e;
	    length++;
	    for(int i = index; i<copy.length; i++){
		array[i+1] = copy[i];
	    }
    }
	else if(index >= length){
	    array[length] = e;
	    length++;
	}
	else{
	    throw new IndexOutOfBoundsException();
	}
    }
    
    public int size(){
	return length;
    }
    
    public void clear(){
	for(int i = 0; i<array.length; i++){
	    array[i] = null;
	}
	length = 0;
    }
    public String get(int index){
	if(index >= 0 && index < size()){
	    return array[index];
	}
	else{
	    throw new IndexOutOfBoundsException();
	}
    }

    public String set(int index, String e){
	String replace = null;
	if(index >= 0 && index < length){
	    replace = array[index];
	    array[index] = e;
	}
	else{
	    throw new IndexOutOfBoundsException();
	}
	return replace;
    }

    public String remove(int index){
	String obj = null;
	if(index >= 0 && index < length){
	    String copy[] = new String[length];
	    for(int i = 0; i<length; i++){
		copy[i] = array[i];
	    }
	    obj = array[index];
	    for(int i = index; i<length-1; i++){
		array[i]=copy[i+1];
	    }
	    length--;
	    if(length == array.length){
		resize(array.length*2);
	    }
	}
	else{
	    throw new IndexOutOfBoundsException();
	}
	return obj;
    }

   public void insertionSort(){
	String s = "";
	for(int i = 1; i < size(); i++){
	    if(get(i).compareTo(get(i-1)) < 0){
		s = get(i);
		int r = i;
	        while(s.compareTo(get(r-1)) < 0){
		    set(r,get(r-1));
		    r--;
		}
		set(r,s);	
	    } 
	}
	
   }
    
    public static void main(String[]args){
	
	SuperArray array = new SuperArray();
	array.add("a");
	array.add("dog");
	array.add("c");
	array.add("cat");
	System.out.println(array);
	array.insertionSort();
	System.out.println(array);

    }
}
 
