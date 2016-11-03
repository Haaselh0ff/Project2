import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Ex89 {
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		System.out.println("Let's play Tic-Tac-Toe!");
		String GameGrid[][];
		GameGrid = new String [3][3];
		GameGrid[0][0] = "|   ";
		GameGrid[1][0] = "|   ";
		GameGrid[2][0] = "|   ";
		GameGrid[0][1] = "|   ";
		GameGrid[1][1] = "|   ";
		GameGrid[2][1] = "|   ";
		GameGrid[0][2] = "|   |";
		GameGrid[1][2] = "|   |";
		GameGrid[2][2] = "|   |";
		String Border = "-------------\n";
		String Border2 = "-------------\n";
		TicTacToeGridMaker(GameGrid, Border, Border2, ' ', 0, 0);
		int PlayerPicker = 0;
		boolean TicTacLoop = true;
		while (TicTacLoop = true){
			while (PlayerPicker == 0){
				char UserID = 'X';
				System.out.println("Enter a row (0, 1, 2) for Player X: ");
				int PlayerRow = input.nextInt();

				System.out.println("Enter a column (0, 1, 2) for Player X: ");
				int PlayerColumn = input.nextInt();
				TicTacToeGridMaker(GameGrid, Border, Border2, UserID, PlayerRow, PlayerColumn);

				PlayerPicker = 1;
			}
			while (PlayerPicker ==1){
				char UserID = 'O';
				System.out.println("Enter a row (0, 1, 2) for Player O: ");
				int PlayerRow = input.nextInt();

				System.out.println("Enter a column (0, 1, 2) for Player O: ");
				int PlayerColumn = input.nextInt();
				TicTacToeGridMaker(GameGrid, Border, Border2, UserID, PlayerRow, PlayerColumn);
				PlayerPicker = 0;
			}
		}
	}
	private static void TicTacToeGridMaker(String GameGrid[][], String Border, String Border2, char UserID, int PlayerRow, int PlayerColumn) {
		if (PlayerRow == 0){
			if(PlayerColumn == 0){
				if ((Arrays.asList(GameGrid[0][0]).contains("| X ")) || (Arrays.asList(GameGrid[0][0]).contains("| O "))){
					System.out.println("CHEATING DETECTED! YOU HAVE FORFEITED YOUR TURN");
				}
				else{
					GameGrid[0][0] = "| "+UserID+" ";
					System.out.println(Border + GameGrid[0][0] + GameGrid[0][1] + GameGrid[0][2] + "\n" + Border2 + GameGrid[1][0]
							+ GameGrid[1][1] + GameGrid[1][2] + "\n" + Border2 + GameGrid[2][0] + GameGrid[2][1] + GameGrid[2][2] + "\n" + Border2);
					if(Arrays.asList(GameGrid[0][0]).contains("| X ")){
						if(Arrays.asList(GameGrid[0][1]).contains("| X ")){
							if(Arrays.asList(GameGrid[0][2]).contains("| X |")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[0][0]).contains("| X ")){
						if(Arrays.asList(GameGrid[1][1]).contains("| X ")){
							if(Arrays.asList(GameGrid[2][2]).contains("| X |")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[0][0]).contains("| O ")){
						if(Arrays.asList(GameGrid[0][1]).contains("| O ")){
							if(Arrays.asList(GameGrid[0][2]).contains("| O |")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[0][0]).contains("| O ")){
						if(Arrays.asList(GameGrid[1][1]).contains("| O ")){
							if(Arrays.asList(GameGrid[2][2]).contains("| O |")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
				}
			}
			if(PlayerColumn == 1){
				if ((Arrays.asList(GameGrid[0][1]).contains("| X ")) || (Arrays.asList(GameGrid[0][1]).contains("| O "))){
					System.out.println("CHEATING DETECTED! YOU HAVE FORFEITED YOUR TURN");
				}
				else{
					GameGrid[0][1] = "| "+UserID+" ";
					System.out.println(Border + GameGrid[0][0] + GameGrid[0][1] + GameGrid[0][2] + "\n" + Border2 + GameGrid[1][0]
							+ GameGrid[1][1] + GameGrid[1][2] + "\n" + Border2 + GameGrid[2][0] + GameGrid[2][1] + GameGrid[2][2] + "\n" + Border2);
					if(Arrays.asList(GameGrid[0][0]).contains("| X ")){
						if(Arrays.asList(GameGrid[0][1]).contains("| X ")){
							if(Arrays.asList(GameGrid[0][2]).contains("| X |")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[0][1]).contains("| X ")){
						if(Arrays.asList(GameGrid[1][1]).contains("| X ")){
							if(Arrays.asList(GameGrid[2][1]).contains("| X ")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[0][0]).contains("| O ")){
						if(Arrays.asList(GameGrid[0][1]).contains("| O ")){
							if(Arrays.asList(GameGrid[0][2]).contains("| O |")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[0][1]).contains("| O ")){
						if(Arrays.asList(GameGrid[1][1]).contains("| O ")){
							if(Arrays.asList(GameGrid[2][1]).contains("| O ")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
				}
			}
			if(PlayerColumn == 2){
				if ((Arrays.asList(GameGrid[0][2]).contains("| X |")) || (Arrays.asList(GameGrid[0][2]).contains("| O |"))){
					System.out.println("CHEATING DETECTED! YOU HAVE FORFEITED YOUR TURN");
				}
				else{
					GameGrid[0][2] = "| "+UserID+" |";
					System.out.println(Border + GameGrid[0][0] + GameGrid[0][1] + GameGrid[0][2] + "\n" + Border2 + GameGrid[1][0]
							+ GameGrid[1][1] + GameGrid[1][2] + "\n" + Border2 + GameGrid[2][0] + GameGrid[2][1] + GameGrid[2][2] + "\n" + Border2);
					if(Arrays.asList(GameGrid[0][0]).contains("| X ")){
						if(Arrays.asList(GameGrid[0][1]).contains("| X ")){
							if(Arrays.asList(GameGrid[0][2]).contains("| X |")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[0][2]).contains("| X |")){
						if(Arrays.asList(GameGrid[1][2]).contains("| X |")){
							if(Arrays.asList(GameGrid[2][2]).contains("| X |")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[0][2]).contains("| X |")){
						if(Arrays.asList(GameGrid[1][1]).contains("| X ")){
							if(Arrays.asList(GameGrid[2][0]).contains("| X ")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[0][0]).contains("| O ")){
						if(Arrays.asList(GameGrid[0][1]).contains("| O ")){
							if(Arrays.asList(GameGrid[0][2]).contains("| O |")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[0][2]).contains("| O |")){
						if(Arrays.asList(GameGrid[1][2]).contains("| O |")){
							if(Arrays.asList(GameGrid[2][2]).contains("| O |")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[0][2]).contains("| O |")){
						if(Arrays.asList(GameGrid[1][1]).contains("| O ")){
							if(Arrays.asList(GameGrid[2][0]).contains("| O ")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
				}
			}
		}
		if(PlayerRow == 1){
			if(PlayerColumn == 0){
				if ((Arrays.asList(GameGrid[1][0]).contains("| X ")) || (Arrays.asList(GameGrid[1][0]).contains("| O "))){
					System.out.println("CHEATING DETECTED! YOU HAVE FORFEITED YOUR TURN");
				}
				else{
					GameGrid[1][0] = "| "+UserID+" ";
					System.out.println(Border + GameGrid[0][0] + GameGrid[0][1] + GameGrid[0][2] + "\n" + Border2 + GameGrid[1][0]
							+ GameGrid[1][1] + GameGrid[1][2] + "\n" + Border2 + GameGrid[2][0] + GameGrid[2][1] + GameGrid[2][2] + "\n" + Border2);
					if(Arrays.asList(GameGrid[1][0]).contains("| X ")){
						if(Arrays.asList(GameGrid[1][1]).contains("| X ")){
							if(Arrays.asList(GameGrid[1][2]).contains("| X |")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[1][0]).contains("| X ")){
						if(Arrays.asList(GameGrid[0][0]).contains("| X ")){
							if(Arrays.asList(GameGrid[2][0]).contains("| X ")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[1][0]).contains("| O ")){
						if(Arrays.asList(GameGrid[1][1]).contains("| O ")){
							if(Arrays.asList(GameGrid[1][2]).contains("| O |")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[1][0]).contains("| O ")){
						if(Arrays.asList(GameGrid[0][0]).contains("| O ")){
							if(Arrays.asList(GameGrid[2][0]).contains("| O ")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
				}
				//Now do it AGAIN!
			}
			if(PlayerColumn == 1){
				if ((Arrays.asList(GameGrid[1][1]).contains("| X ")) || (Arrays.asList(GameGrid[1][1]).contains("| O "))){
					System.out.println("CHEATING DETECTED! YOU HAVE FORFEITED YOUR TURN");
				}
				else{
					GameGrid[1][1] = "| "+UserID+" ";
					System.out.println(Border + GameGrid[0][0] + GameGrid[0][1] + GameGrid[0][2] + "\n" + Border2 + GameGrid[1][0]
							+ GameGrid[1][1] + GameGrid[1][2] + "\n" + Border2 + GameGrid[2][0] + GameGrid[2][1] + GameGrid[2][2] + "\n" + Border2);
					if(Arrays.asList(GameGrid[1][0]).contains("| X ")){
						if(Arrays.asList(GameGrid[1][1]).contains("| X ")){
							if(Arrays.asList(GameGrid[1][2]).contains("| X |")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[1][1]).contains("| X ")){
						if(Arrays.asList(GameGrid[0][1]).contains("| X ")){
							if(Arrays.asList(GameGrid[2][1]).contains("| X ")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[1][1]).contains("| X ")){
						if(Arrays.asList(GameGrid[0][0]).contains("| X ")){
							if(Arrays.asList(GameGrid[2][2]).contains("| X |")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[1][1]).contains("| X ")){
						if(Arrays.asList(GameGrid[0][2]).contains("| X |")){
							if(Arrays.asList(GameGrid[2][0]).contains("| X ")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[1][0]).contains("| O ")){
						if(Arrays.asList(GameGrid[1][1]).contains("| O ")){
							if(Arrays.asList(GameGrid[1][2]).contains("| O |")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[1][1]).contains("| O ")){
						if(Arrays.asList(GameGrid[0][1]).contains("| O ")){
							if(Arrays.asList(GameGrid[2][1]).contains("| O ")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[1][1]).contains("| O ")){
						if(Arrays.asList(GameGrid[0][0]).contains("| O ")){
							if(Arrays.asList(GameGrid[2][2]).contains("| O |")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[1][1]).contains("| O ")){
						if(Arrays.asList(GameGrid[0][2]).contains("| O |")){
							if(Arrays.asList(GameGrid[2][0]).contains("| O ")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
				}
				//Now do it AGAIN!
			}
			if(PlayerColumn == 2){
				if ((Arrays.asList(GameGrid[1][2]).contains("| X |")) || (Arrays.asList(GameGrid[1][2]).contains("| O |"))){
					System.out.println("CHEATING DETECTED! YOU HAVE FORFEITED YOUR TURN");
				}
				else{
					GameGrid[1][2] = "| "+UserID+" |";
					System.out.println(Border + GameGrid[0][0] + GameGrid[0][1] + GameGrid[0][2] + "\n" + Border2 + GameGrid[1][0]
							+ GameGrid[1][1] + GameGrid[1][2] + "\n" + Border2 + GameGrid[2][0] + GameGrid[2][1] + GameGrid[2][2] + "\n" + Border2);
					if(Arrays.asList(GameGrid[1][0]).contains("| X ")){
						if(Arrays.asList(GameGrid[1][1]).contains("| X ")){
							if(Arrays.asList(GameGrid[1][2]).contains("| X |")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[1][2]).contains("| X |")){
						if(Arrays.asList(GameGrid[0][2]).contains("| X |")){
							if(Arrays.asList(GameGrid[2][2]).contains("| X |")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[1][0]).contains("| O ")){
						if(Arrays.asList(GameGrid[1][1]).contains("| O ")){
							if(Arrays.asList(GameGrid[1][2]).contains("| O |")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[1][2]).contains("| O |")){
						if(Arrays.asList(GameGrid[0][2]).contains("| O |")){
							if(Arrays.asList(GameGrid[2][2]).contains("| O |")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
				}
				//NOW DO IT AGAIN
			}	
		}
		if(PlayerRow == 2){
			if(PlayerColumn == 0){
				if ((Arrays.asList(GameGrid[2][0]).contains("| X ")) || (Arrays.asList(GameGrid[2][0]).contains("| O "))){
					System.out.println("CHEATING DETECTED! YOU HAVE FORFEITED YOUR TURN");
				}
				else{
					GameGrid[2][0] = "| "+UserID+" ";
					System.out.println(Border + GameGrid[0][0] + GameGrid[0][1] + GameGrid[0][2] + "\n" + Border2 + GameGrid[1][0]
							+ GameGrid[1][1] + GameGrid[1][2] + "\n" + Border2 + GameGrid[2][0] + GameGrid[2][1] + GameGrid[2][2] + "\n" + Border2);
					if(Arrays.asList(GameGrid[2][0]).contains("| X ")){
						if(Arrays.asList(GameGrid[2][1]).contains("| X ")){
							if(Arrays.asList(GameGrid[2][2]).contains("| X |")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[2][0]).contains("| X ")){
						if(Arrays.asList(GameGrid[0][0]).contains("| X ")){
							if(Arrays.asList(GameGrid[1][0]).contains("| X ")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[2][0]).contains("| X ")){
						if(Arrays.asList(GameGrid[0][2]).contains("| X |")){
							if(Arrays.asList(GameGrid[1][1]).contains("| X ")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[2][0]).contains("| O ")){
						if(Arrays.asList(GameGrid[2][1]).contains("| O ")){
							if(Arrays.asList(GameGrid[2][2]).contains("| O |")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[2][0]).contains("| O ")){
						if(Arrays.asList(GameGrid[0][0]).contains("| O ")){
							if(Arrays.asList(GameGrid[1][0]).contains("| O ")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[2][0]).contains("| O ")){
						if(Arrays.asList(GameGrid[0][2]).contains("| O |")){
							if(Arrays.asList(GameGrid[1][1]).contains("| O ")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
				}
			}
			if(PlayerColumn == 1){
				if ((Arrays.asList(GameGrid[2][1]).contains("| X ")) || (Arrays.asList(GameGrid[2][1]).contains("| O "))){
					System.out.println("CHEATING DETECTED! YOU HAVE FORFEITED YOUR TURN");
				}
				else{
					GameGrid[2][1] = "| "+UserID+" ";
					System.out.println(Border + GameGrid[0][0] + GameGrid[0][1] + GameGrid[0][2] + "\n" + Border2 + GameGrid[1][0]
							+ GameGrid[1][1] + GameGrid[1][2] + "\n" + Border2 + GameGrid[2][0] + GameGrid[2][1] + GameGrid[2][2] + "\n" + Border2);
					if(Arrays.asList(GameGrid[2][1]).contains("| X ")){
						if(Arrays.asList(GameGrid[2][0]).contains("| X ")){
							if(Arrays.asList(GameGrid[2][2]).contains("| X |")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[2][1]).contains("| X ")){
						if(Arrays.asList(GameGrid[0][1]).contains("| X ")){
							if(Arrays.asList(GameGrid[1][1]).contains("| X ")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[2][1]).contains("| O ")){
						if(Arrays.asList(GameGrid[2][0]).contains("| O ")){
							if(Arrays.asList(GameGrid[2][2]).contains("| O |")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[2][1]).contains("| O ")){
						if(Arrays.asList(GameGrid[0][1]).contains("| O ")){
							if(Arrays.asList(GameGrid[1][1]).contains("| O ")){
								System.out.println("PLAYER O WON!");
							}
						}
					}

				}
			}
			if(PlayerColumn == 2){
				if ((Arrays.asList(GameGrid[2][2]).contains("| X |")) || (Arrays.asList(GameGrid[2][2]).contains("| O |"))){
					System.out.println("CHEATING DETECTED! YOU HAVE FORFEITED YOUR TURN");
				}
				else{
					GameGrid[2][2] = "| "+UserID+" |";
					System.out.println(Border + GameGrid[0][0] + GameGrid[0][1] + GameGrid[0][2] + "\n" + Border2 + GameGrid[1][0]
							+ GameGrid[1][1] + GameGrid[1][2] + "\n" + Border2 + GameGrid[2][0] + GameGrid[2][1] + GameGrid[2][2] + "\n" + Border2);
					if(Arrays.asList(GameGrid[2][0]).contains("| X ")){
						if(Arrays.asList(GameGrid[2][1]).contains("| X ")){
							if(Arrays.asList(GameGrid[2][2]).contains("| X |")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[2][2]).contains("| X |")){
						if(Arrays.asList(GameGrid[0][2]).contains("| X |")){
							if(Arrays.asList(GameGrid[1][2]).contains("| X |")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[2][2]).contains("| X |")){
						if(Arrays.asList(GameGrid[0][0]).contains("| X ")){
							if(Arrays.asList(GameGrid[1][1]).contains("| X ")){
								System.out.println("PLAYER X WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[2][0]).contains("| O ")){
						if(Arrays.asList(GameGrid[2][1]).contains("| O ")){
							if(Arrays.asList(GameGrid[2][2]).contains("| O |")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[2][2]).contains("| O |")){
						if(Arrays.asList(GameGrid[0][2]).contains("| O |")){
							if(Arrays.asList(GameGrid[1][2]).contains("| O |")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
					if(Arrays.asList(GameGrid[2][2]).contains("| O |")){
						if(Arrays.asList(GameGrid[0][0]).contains("| O ")){
							if(Arrays.asList(GameGrid[1][1]).contains("| O ")){
								System.out.println("PLAYER O WON!");
							}
						}
					}
				}

			}
		}
	}
	//TIC-TAC-TOE CODE END.
}