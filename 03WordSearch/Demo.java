public class Demo{
    
     public static void main(String[]args){

    	WordGrid data = new WordGrid(10,10);
      	
	data.addWordHorizontal("cat", 5, 2);
	data.addWordVertical("dog", 1, 1);
	data.addWordDiagonal("taco", 5, 4);
	System.out.println(data.toString());
	

    }	
}
