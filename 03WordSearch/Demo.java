public class Demo{
    
     public static void main(String[]args){

    	WordGrid data = new WordGrid(8,8);
      	
	data.addWordHorizontal("cat", 4, 2);
	data.addWordVertical("dog", 1, 1);
	System.out.println(data.toString());
	

    }	
}
