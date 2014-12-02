public class OrderedSuperArray extends SuperArray{

    public void add(String s){
	toResize();
	for(int i = 0; i < length+1; i++){
	    if(array[i].compareTo(s) <= 0){
		add(i+1, s);
		break;
	    }
	}
	length++;
    }

    public String set(int index, String s){
	


}     
