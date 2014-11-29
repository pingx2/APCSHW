import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Driver{
    
     public static void main(String[]args) throws FileNotFoundException{

	 boolean fillRandomLetters = true;

	 /*this is the "NEW SECTION" 
	  *
	  *This is where you need to write something in order
	  *to get the values from args, OR decide to use default values 
	  */
	 /* if(args.length != 3 && args.length != 4){
	     System.out.println("Error. Please use the following format:");
	     System.out.println("java Driver rows cols randomSeed answers");
	     }
	 */
	 
	 try{
	     WordGrid w = new WordGrid(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	     if(args.length == 3 || args.length == 4){  /*see more notes on this later*/
		 w.setSeed(Integer.parseInt(args[2]));
	     }
	     if(args.length == 4 && Integer.parseInt(args[3])==1){
		 fillRandomLetters = false;
	     }
	     w.LoadWordsFromFile("SATwords;A;.txt", fillRandomLetters);
	     System.out.println( "Find these words:\n"+ w.WordsinPuzzle() );
	     System.out.println( w );
	 }catch(Exception e){
	     System.out.println("Error. Please use the following format:");
	     System.out.println("java Driver rows cols randomSeed answers");
	 }
     }
}

    
      
	 
       
