public class SuperArray{
    private Object[] array;
    private int length;

    public SuperArray(){
	array = new Object[10];
    }
    
    public SuperArray(int c){
	array = new Object[c];
    }

    public String toString(){
        String s = "";
	s += "[";
	for(int i = 0; i<array.length; i++){
	    s += array[i];
	    s += ", ";
	}
	s = s.substring(0,s.length()-2);
	s += "]";
	return s;
    }

    public void resize(int newCapacity){
	if(newCapacity>0){
	    Object newArray[] = new Object[newCapacity];
	    for(int i = 0; i<array.length && i<newArray.length; i++){
		newArray[i] = array[i];
	    }
	    array = newArray;
	}
	else{
	    System.out.println("Error");
	}
    }

    public void add(Object e){
	resize(array.length+1);
	array[array.length-1] = e;
 
    }

    public void add(int index, Object e){
	if(index>=0 && index<array.length){
	    Object copy[] = new Object[array.length];
	    for(int i = 0; i<array.length; i++){
		copy[i] = array[i];
	    }
	    resize(array.length+1);
	    array[index]=e;
	    for(int i = index; i<copy.length; i++){
		array[i+1]=copy[i];
	    }
	}
	else{
	    System.out.println("Error");
	}
    }

    public int size(){
	length = array.length;
	return length;
    }


    public void clear(){
	for(int i = 0; i<array.length; i++){
	    array[i]=null;
	}
    }

    public Object get(int index){
	if(index>=0 && index<array.length){
	    return array[index];
	}
	else{
	    System.out.println("Error");
	}
	return null;
    }

    public Object set(int index, Object e){
	Object replace = null;
	if(index>=0 && index<array.length){
	    replace = array[index];
	    array[index] = e;
	}
	else{
	    System.out.println("Error");
	}
	return replace;
    }

    public Object remove(int index){
	Object obj = null;
	if(index>=0 && index<array.length){
	    Object copy[] = new Object[array.length];
	    for(int i = 0; i<array.length; i++){
		copy[i] = array[i];
	    }
	    obj = array[index];
	    for(int i = index; i<array.length-1; i++){
		array[i]=copy[i+1];
	    }
	    resize(array.length-1);
	}
	else{
	    System.out.println("Error");
	}
	return obj;
    }

}
  
