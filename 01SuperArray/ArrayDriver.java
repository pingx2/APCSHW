public class ArrayDriver{
    
    public static void main(String[]args){
	
	Integer x = new Integer(5);
	SuperArray L = new SuperArray();
	L.add(x);
	L.add(new Integer(99));
	L.add(4,x);
	System.out.println(L.toString());

	System.out.println("\n");

	SuperArray M = new SuperArray(6);
	M.set(0,"A");
	M.set(1,"B");
	M.set(2,"C");
	M.set(3,1);
	M.set(4,2);
	M.set(5,3);
	System.out.println("M: "+M.toString());
	System.out.println("M.size(): "+M.size());
	System.out.println("M.get(2): "+M.get(2));
	M.resize(3);
	System.out.println("M.resize(3): "+M.toString());
	M.remove(2);
	System.out.println("M.remove(2): "+M.toString());
	M.clear();
	System.out.println("M.clear(): "+M.toString());


    }
}
