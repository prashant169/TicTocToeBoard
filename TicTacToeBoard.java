package TicTocToeBoard;

public class TicTacToeBoard {
	
	  static void startGame () {
 		char[] gameChar = new char[10];       //create a arrey f 10 size
			  
		for (int i = 1; i <gameChar.length; i++)
			gameChar[i]= ' ' ;
	 }
				 public static void main(String []args) {
					 TicTacToeBoard.startGame();         //calling the method 
				 }

	}
