import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WordGrid{

    private char[][]data;
    ArrayList<String> Added;
    Random rand = new Random();


    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */
    public WordGrid(int rows,int cols){
	data = new char[rows][cols];
	Added = new ArrayList<String>();
	clear();
    }
    /**Set all values in the WordGrid to spaces ' '*/
    private void clear(){
	for(int h = 0; h < data.length; h++){
	    for(int w = 0; w < data[h].length; w++){
		data[h][w]='_';
	    }
	}
    }


    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and each row
     *separated by newlines.
     */
    public String toString(){
	String result = "";
	for(int h = 0; h < data.length; h++){
	    result += "{";
	    for(int w = 0; w < data[h].length; w++){
		result += data[h][w];
		result += " ";
	    }
	    result += "}";
	    result += "\n";
	}
	return result;
    }
    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
*/
		
    public boolean CheckWord(String word, int row, int col, int dx, int dy){
	if(dx==0 && dy==0){
	    return false;
	}
	else if(dx*word.length()+col >= data[0].length || dy*word.length()+row >= data.length){
	    return false;
	}
	else if(dx*word.length()+col < 0 || dy*word.length()+row < 0){
	    return false;
	}
	for(int i = 0; i < word.length(); i++){
	    if(data[dy*i+row][dx*i+col]!='_' && data[dy*i+row][dx*i+col]!=word.charAt(i)){
		return false;
		
	    }
	    
	}
	return true;
    }
    

    public boolean AddWord(String word, int row, int col, int dx, int dy){
	if(CheckWord(word, row, col, dx, dy)){
	    for(int i = 0; i < word.length(); i++){
		data[dy*i+row][dx*i+col] = word.charAt(i);
	    }
	    Added.add(word);
	    return true;
	}
	else{
	    return false;
	}
    }
    
    public boolean AddWordRandomly(String word, int row, int col){
	//dx & dy = -1, 0 ,1
	int dx = rand.nextInt(3) - 1;
	int dy = rand.nextInt(3) - 1;
	return (AddWord(word, row, col, dx, dy));
    }
    
    public void Fill(){
	for(int r = 0; r < data.length; r++){
	    for(int c = 0; c < data.length; c++){
		if(data[r][c] == '_'){
		    data[r][c] = (char)('a'+(int)(Math.random()*26));
		}
	    }
	}
    }
    
    public void LoadWordsFromFile(String fileName, boolean fillRandomLetters) 
	throws FileNotFoundException{
	File text;
	Scanner in;
	try{
	    text = new File(fileName);
	    in = new Scanner(text);
	}catch(Exception e){
	    System.out.println("File not found");
	}
	ArrayList<String> Words = new ArrayList<String>();
	while(in.hasNext()){
	    Words.add(in.next());
	}	
	if(fillRandomLetters){
	    data.Fill();
	}
    }
    
    public String WordinPuzzle(){	
	String WordBox = "";
	for(int i = 0; i < Added.size(); i++){
	    WordBox += Added.get(i);
	    WordBox += "\t";
	    if(i!=0 && i%4 == 0){
		WordBox += "\n";
	    }
	}
	return WordBox;
    }


    public boolean addWordHorizontal(String word,int row, int col){
	if(row < data.length && col < data[row].length){
	    if(data[row].length-col >= word.length()){
		for(int i = 0; i < word.length(); i++){
		    if(data[row][col+i]!='_' && data[row][col+i]!=word.charAt(i)){
			return false;
		    }
		}
		for(int i = 0; i < word.length(); i++){
		    data[row][col+i]=word.charAt(i);

		}
		return true;
	    }
	}
	return false;
    }
    
    public boolean addWordVertical(String word, int row, int col){
	if(row < data.length && col < data[row].length){
	    if(data.length - row >= word.length()){
		for(int i = 0; i < word.length(); i++){
		    if(data[row+i][col]!='_' && data[row+i][col]!=word.charAt(i)){
			return false;
		    }
		}
		for(int i = 0; i < word.length(); i++){
		    data[row+i][col]=word.charAt(i);
		}
		return true;	
	    }
	}
	return false;
    }
	
    public boolean addWordDiagonal(String word, int row, int col){
	if(row < data.length && col < data[row].length){
	    if(data[row].length - col >= word.length() && data.length - row >= word.length()){
		for(int i = 0; i < word.length(); i++){
		    if(data[row+i][col+i]!='_' && data[row+i][col+i]!=word.charAt(i)){
			return false;
		    }
		}
		for(int i = 0; i < word.length(); i++){
		    data[row+i][col+i]=word.charAt(i);
		}
		return true;
	    }
	}
	    return false;
    }
    
}
