public class WordGrid{

    private char[][]data;
    private int rows, cols;

    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */
    public WordGrid(int rows,int cols){
	this.rows = rows;
	this.cols = cols;
	char[][]data = new char[rows][cols];
	clear();
    }
    /**Set all values in the WordGrid to spaces ' '*/
    private void clear(){
	for(int h = 0; h<rows; h++){
	    for(int w = 0; w<cols; w++){
		data[h][w]=' ';
	    }
	}
    }
    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and each row
     *separated by newlines.
     */
    public String toString(){
	String result = "";
	for(int h = 0; h<rows; h++){
	    result += "[";
	    for(int w = 0; w<cols; w++){
		result += data[h][w];
		result += ", ";
	    }
	    result += "]";
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
    public boolean addWordHorizontal(String word,int row, int col){
	if(row <= this.rows && col <= this.cols){
	    if(this.cols-col>=word.length()){
		for(int i = 0; i<word.length(); i++){
		    data[row][col+i]=word.charAt(i);
		}
		return true;
	    }
	}
	return false;
    }
    //vertical + diagonal should be implemented as well.
    
    public static void main(String[]args){

	WordGrid[][]data = new WordGrid[8][8];
	
	System.out.println(data.toString());

	//data.addWordHorizontal("word", 3, 5);
    }	
  
}
