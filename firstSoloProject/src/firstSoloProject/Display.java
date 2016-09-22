package firstSoloProject;
import java.util.Scanner;
import java.util.Arrays;

@SuppressWarnings("resource")


public class Display
	{
		static boolean win = true;
		//User Variables (X or Os)
		static String userChoice;
		static String computerGiven;
		
		//Board Setup
		static String[][] boardO = new String[3][3];
		
		public static void main(String[] args)
			{
				
				fillArray();
				Choice();
				System.out.println(userChoice);
				visualDisplay();
				while(win){
					UserInput.locationChoice();
					ComputerInput.play();
					UserInput.winValue();
					
				}
//				UserInput.locationChoice();
//				ComputerInput.play();
			}

		//Setup Board, Contains array within, basically complete
		public static void visualDisplay(){
			
			System.out.println("     1    2    3");
			System.out.println("   ___________________");
			System.out.println("   |    "+" |    "+" |    "+" |");
			System.out.println("A  " + "|  " + boardO[0][0] + "  |  " + boardO[1][0] + "  |  " + boardO[2][0] + "  |");
			System.out.println("   |    "+" |    "+" |    "+" |");
			System.out.println("   ___________________");
			System.out.println("   |    "+" |    "+" |    "+" |");
			System.out.println("B  "+"|  " + boardO[0][1] +"  |  " + boardO[1][1] +"  |  "+ boardO[2][1] +"  |");
			System.out.println("   |    "+" |    "+" |    "+" |");
			System.out.println("   ___________________");
			System.out.println("   |    "+" |    "+" |    "+" |");
			System.out.println("C  "+"|  " + boardO[0][2] +"  |  " + boardO[1][2] +"  |  " + boardO[2][2] +"  |");
			System.out.println("   |    "+" |    "+" |    "+" |");
			System.out.println("   ___________________");
			
		}
		
		//Completed Choice, Is able to choose either "X or O"
		
		public static void Choice(){
			System.out.println("Would you like to be X's or O's? " );
			Scanner userXorOinput = new Scanner(System.in);
			String userXorO = userXorOinput.nextLine();
			System.out.println("You have chosen " + userXorO);
			
			 
			
			if(userXorO.equals("X")){
				userChoice = "X";
				computerGiven = "O";
			}else{
				userChoice = "O";
				computerGiven = "X";
			}
			
			
			
		}
		//Starts array Filled with Null / Spaces
		public static void fillArray(){
			
			 for (int i = 0; i < boardO.length; i++){
			        Arrays.fill(boardO[i], " ");
			    }
						
				
			}
			

				
		}
		

	