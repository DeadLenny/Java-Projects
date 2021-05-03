import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		
		boolean finished = false;
		
		do {
			char[][] board = new char[7][8];
			Scanner input = new Scanner(System.in);
			
			boolean gameOver = false;
			int numMoves = 0;
			char Player1='X';
			char Player2='O';
			boolean player1=true;
			boolean player2=false;
			DisplayStartingBoard(board);
			
			do {
				
				
				int columnChosen = 0;
				do {
					System.out.println("Enter the column you want to place your piece.");
					columnChosen = input.nextInt();
				}
				while (columnChosen < 1 || columnChosen > 7 || board[1][columnChosen] != '_');
				if(player1==true) {
					if(board[6][columnChosen]=='_') {
						board[6][columnChosen]=Player1;
					}else if(board[5][columnChosen]=='_') {
						board[5][columnChosen]=Player1;
					}else if(board[4][columnChosen]=='_') {
						board[4][columnChosen]=Player1;
					}else if(board[3][columnChosen]=='_') {
						board[3][columnChosen]=Player1;
					}else if(board[2][columnChosen]=='_') {
						board[2][columnChosen]=Player1;
					}else {
						board[1][columnChosen]=Player1;
					}
				}else {
					if(board[6][columnChosen]=='_') {
						board[6][columnChosen]=Player2;
					}else if(board[5][columnChosen]=='_') {
						board[5][columnChosen]=Player2;
					}else if(board[4][columnChosen]=='_') {
						board[4][columnChosen]=Player2;
					}else if(board[3][columnChosen]=='_') {
						board[3][columnChosen]=Player2;
					}else if(board[2][columnChosen]=='_') {
						board[2][columnChosen]=Player2;
					}else {
						board[1][columnChosen]=Player2;
					}
				}
				
				numMoves+=1;
				DisplayBoard(board);
				// check for win
				if (CheckForWin(board))
				{
					if(player1==true) {
						System.out.println("Congratulations Player 1. You won");
						gameOver=true;
						// if winner, display congratulations and set gameOver true
					}else {
						System.out.println("Congratulations Player 2. You won");
						gameOver=true;
					}
				}
				else if (numMoves == 42)
				{
					System.out.println("It's a tie");
					gameOver=true;
					// if tie, display result and set gameOver true
				}
				else
				{
					if(player1==true) {
						player1=false;
						player2=true;// switch current player
					}else {
						player1=true;
						player2=false;
					}
				}
			}
			while(!gameOver);
			input.nextLine();
			System.out.println("Do you want to play again?");
			String answer = input.nextLine();
			System.out.println(answer);
			//if(answer=="Yes"||answer=="Y"||answer=="yes") {
			if(answer.equals("Yes")||answer.equals("Y")||answer.equals("yes")) {
				
				finished=false;
			}else {
				finished=true;
				System.out.println("Thank you for playing.");
			}
			
		}
		while(!finished);		
	}
	public static void DisplayBoard(char[][] board) {
	 
	 System.out.println("\t1\t2\t3\t4\t5\t6\t7");
	 for(int r=1;r<=6;r++) {
		 System.out.print(r);
			for(int c=1;c<=7;c++) {
				{ System.out.print("\t"+(board[r][c]));
				}
				
			}
			System.out.println();
		}
	}
	public static void DisplayStartingBoard(char[][] board) {
		System.out.println("\t1\t2\t3\t4\t5\t6\t7");
		 for(int r=1;r<=6;r++) {
			 System.out.print(r);
				for(int c=1;c<=7;c++) {
					{ System.out.print("\t"+(board[r][c]='_'));
					}
					
				}
				System.out.println();
			}
		}
	
	public static boolean CheckForWin(char[][] board) {
		//check for horizontal
		for(int r=1;r<=6;r++) {
			for(int c=1;c<=4;c++) {
				if (board[r][c] == board[r][c+1] &&
					    board[r][c] == board[r][c+2] &&
					    board[r][c] == board[r][c+3] &&
					    board[r][c] != '_')
					    {
						return true;
						}
			}
		}
		//check for vertical
		for(int c=1;c<=7;c++) {
			for(int r=1;r<=3;r++) {
				if (board[r][c] == board[r+1][c] &&
					    board[r][c] == board[r+2][c] &&
					    board[r][c] == board[r+3][c] &&
					    board[r][c] != '_')
					    {
						return true;
						}
			}
		}
		//check for diagonal up
		for(int r=6;r>=4;r--) {
			for(int c=1;c<=4;c++) {
				if (board[r][c] == board[r-1][c+1] &&
					    board[r][c] == board[r-2][c+2] &&
					    board[r][c] == board[r-3][c+3] &&
					    board[r][c] != '_')
					    {
						return true;
						}
			}
		}
		//check for diagonal up the other way
		for(int c=7;c>=4;c--) {
			for(int r=6;r>=4;r--) {
				if (board[r][c] == board[r-1][c-1] &&
					    board[r][c] == board[r-2][c-2] &&
					    board[r][c] == board[r-3][c-3] &&
					    board[r][c] != '_')
					    {
						return true;
						}
			}
		}
		//check for diagonal down
		for(int r=1;r<=3;r++) {
			for(int c=1;c<=4;c++) {
				if (board[r][c] == board[r+1][c+1] &&
					    board[r][c] == board[r+2][c+2] &&
					    board[r][c] == board[r+3][c+3] &&
					    board[r][c] != '_')
					    {
						return true;
						}
			}
		}
		// check for diagonal down other way
		for(int c=7;c>=4;c--) {
			for(int r=1;r<=3;r++) {
				if (board[r][c] == board[r+1][c-1] &&
					    board[r][c] == board[r+2][c-2] &&
					    board[r][c] == board[r+3][c-3] &&
					    board[r][c] != '_')
					    {
						return true;
						}
			}
		}
		return false;
	}

}
