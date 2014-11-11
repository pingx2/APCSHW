public class SuperArray{
    private Object[] array;
    private int length = 0;

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

    public void add(Object e){
	toResize();
	array[length] = e;
	length++;
    }

    public void add(int index, Object e){
	toResize();
	if(index>=0 && index<length){
	    Object copy[] = new Object[length];
	    for(int i = 0; i<length; i++){
		copy[i] = array[i];
	    }
	    array[index] = e;
	    length++;
	    for(int i = index; i<copy.length; i++){
		array[i+1]=copy[i];
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
	    array[i]=null;
	}
	length = 0;
    }

    public Object get(int index){
	if(index>=0 && index<length){
	    return array[index];
	}
	else{
	    throw new IndexOutOfBoundsException();
	}
    }

    public Object set(int index, Object e){
	Object replace = null;
	if(index>=0 && index<length){
	    replace = array[index];
	    array[index] = e;
	}
	else{
	    throw new IndexOutOfBoundsException();
	}
	return replace;
    }

    public Object remove(int index){
	Object obj = null;
	if(index>=0 && index<length){
	    Object copy[] = new Object[length];
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
    
}
