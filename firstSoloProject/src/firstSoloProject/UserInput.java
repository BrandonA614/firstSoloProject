package firstSoloProject;
import java.util.Scanner;
@SuppressWarnings("resource")

public class UserInput
	{

//		display.boardO;
		static boolean Win = true;
		
		
		public static void locationChoice(){
			
				System.out.println("Where would you like to go?");
				Scanner locationInput = new Scanner(System.in);
				String location = locationInput.nextLine();
				
				
				while(Win = true){
				if(location.equals("A1") && location != Display.computerGiven){
					Display.boardO[0][0] = Display.userChoice;	
					break;
					
					
				}else if(location.equals("A2") && location != Display.computerGiven){
					Display.boardO[1][0] = Display.userChoice;
					break;
				}
				else if(location.equals("A3") && location != Display.computerGiven){
					Display.boardO[2][0] = Display.userChoice;
					break;
				}
				else if(location.equals("B1") && location != Display.computerGiven){
					Display.boardO[0][1] = Display.userChoice;
					break;
				}
				else if(location.equals("B2") && location != Display.computerGiven){
					Display.boardO[1][1] = Display.userChoice;
					break;
				}
				else if(location.equals("B3") && location != Display.computerGiven){
					Display.boardO[2][1] = Display.userChoice;
					break;
				}
				else if(location.equals("C1") && location != Display.computerGiven){
					Display.boardO[0][2] = Display.userChoice;
					break;
				}
				else if(location.equals("C2") && location != Display.computerGiven){
					Display.boardO[1][2] = Display.userChoice;
					break;
				}
				else if(location.equals("C3") && location != Display.computerGiven){
					Display.boardO[2][2] = Display.userChoice;
					break;
				}
			}
		}
				
			
		
//		public static void LocationQuestion(){
//			System.out.println("Where would you like to go?");
//			Scanner locationInput = new Scanner(System.in);
//			String location = locationInput.nextLine();
//			
//			
//		}
		public static void winValue(){
	
			if(
			//A to 3 B to 3 and C to 3 = Win 
			Display.boardO[0][0].equals(Display.userChoice) && Display.boardO[1][0].equals(Display.userChoice) && Display.boardO[2][0].equals(Display.userChoice)||
			Display.boardO[0][1].equals(Display.userChoice) && Display.boardO[1][1].equals(Display.userChoice) && Display.boardO[2][1].equals(Display.userChoice)||
			Display.boardO[0][2].equals(Display.userChoice) && Display.boardO[1][2].equals(Display.userChoice) && Display.boardO[2][2].equals(Display.userChoice)||
			//1 to C 2 to C and 3 to C = Win
			Display.boardO[0][0].equals(Display.userChoice) && Display.boardO[0][1].equals(Display.userChoice) && Display.boardO[0][2].equals(Display.userChoice)||
			Display.boardO[1][0].equals(Display.userChoice) && Display.boardO[1][1].equals(Display.userChoice) && Display.boardO[1][2].equals(Display.userChoice)||
			Display.boardO[2][0].equals(Display.userChoice) && Display.boardO[2][1].equals(Display.userChoice) && Display.boardO[2][2].equals(Display.userChoice)||
			//A1 to C 3 = Win
			Display.boardO[0][2].equals(Display.userChoice) && Display.boardO[1][1].equals(Display.userChoice) && Display.boardO[2][0].equals(Display.userChoice)||
			//A 3 to C 1 = Win
			Display.boardO[2][2].equals(Display.userChoice) && Display.boardO[1][1].equals(Display.userChoice) && Display.boardO[0][0].equals(Display.userChoice)
			)				
				{
				System.out.println("You have won! Congratulations");
				Display.win = false;				
				}
				
				
					
					
					
					
					
					
				
			}
			
	}
	
		
