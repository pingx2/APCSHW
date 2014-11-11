public class ArrayDriver{
    
    public static void main(String[]args){
	
	Integer x = new Integer(5);
	SuperArray L = new SuperArray();
	L.add(x);
	L.add(new Integer(99));
	System.out.println(L.toString());

	System.out.println("\n");

	SuperArray M = new SuperArray(6);

	try{
	    M.add("A");
	    M.add("B");
	    M.add(1);
	    M.add(2,"C");
	    M.add(2);
	    M.add(3);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Error. Index out of bounds.");
	}catch(Exception e){
	    System.out.println("Error");
	}
    
	System.out.println("M: "+M.toString());
	System.out.println("M.size(): "+M.size());

	try{    
	    System.out.println("M.get(2): "+M.get(2));
	    M.remove(2);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Error. Index out of bounds.");
	}catch(Exception e){
	    System.out.println("Error");
	}

	    System.out.println("M.remove(2): "+M.toString());
	    M.clear();
	    System.out.println("M.clear(): "+M.toString());
	    M.add("A");
	    System.out.println("M.add('A'): "+M.toString());

	    try{    
		System.out.println("M.get(2): "+M.get(2));
		M.remove(6);
	    }catch(IndexOutOfBoundsException e){
		System.out.println("Error. Index out of bounds.");
	    }catch(Exception e){
	    System.out.println("Error");
	    }
    }
}
