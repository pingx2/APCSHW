import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Demo{
    
     public static void main(String[]args) throws FileNotFoundException{

      
	 File text = new File("SATwords;A;.txt");
	 Scanner  in = new Scanner(text);

	 Random rand = new Random();
	 
	 ArrayList<String> Words = new ArrayList<String>();

	 while(in.hasNext()){
	     Words.add(in.next());
	 }
	 
	 WordGrid data = new WordGrid(15,15);
	 
	 for(int i = 0; i < Words.size(); i++){
	     if(rand.nextInt(3) == 0){
		 if(!data.addWordHorizontal(Words.get(i),rand.nextInt(15),rand.nextInt(10))){
		     data.addWordHorizontal(Words.get(i),rand.nextInt(15),rand.nextInt(10));
		 }
	     }
	     else if(rand.nextInt(3) == 1){
		 if(!data.addWordVertical(Words.get(i),rand.nextInt(10),rand.nextInt(15))){
		     data.addWordVertical(Words.get(i),rand.nextInt(10),rand.nextInt(15));
		 }
	     }
	     else if(rand.nextInt(3) == 2){ 
		 if(!data.addWordDiagonal(Words.get(i),rand.nextInt(10),rand.nextInt(10))){
		     data.addWordVertical(Words.get(i),rand.nextInt(10),rand.nextInt(15));
		 }
	     }
	 }
	 
	 System.out.println(data.toString());
	 
	 
     }	
}
