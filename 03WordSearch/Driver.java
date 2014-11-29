import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Driver{
    
     public static void main(String[]args) throws FileNotFoundException{

      
	 File text = new File("SATwords;A;.txt");
	 Scanner  in = new Scanner(text);

	 Random rand = new Random();
	 
	 ArrayList<String> Words = new ArrayList<String>();

	 while(in.hasNext()){
	     Words.add(in.next());
	 }
	 
	 WordGrid data = new WordGrid(20,20);
	 

	 for(int i = 0; i < Words.size(); i++){
	     data.AddWordRandomly(Words.get(i),rand.nextInt(20), rand.nextInt(20));
	 }
	 
	 data.Fill();

	 System.out.println(data.toString());
	 
	 
     }	
}
