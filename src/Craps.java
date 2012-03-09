import java.util.*;

public class Craps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		int playerNumber = 0; 
		int dii1, dii2;
		boolean first = true;
		
		while(true) {
			dii1 = rn.nextInt(6) + 1;
			System.out.print("Dii 1: " + dii1);
			dii2 = rn.nextInt(6) + 1;
			System.out.print("\tDii 2: " + dii2);
			int dice = dii1 + dii2;
			System.out.println("\tSum of both dice: " + dice);
			
			if (first){
				if(dice == 7 || dice == 11) {
					System.out.println("YOU WIN"); 
					break;
				}
				if(dice == 2 || dice == 3 || dice == 12) {
					System.out.println("YOU LOSE"); 
					break;
				}
				
				playerNumber = dice;
			}
			
			else {
				if (dice == 7) {
					System.out.println("YOU LOSE"); 
					break;
				}
				if (dice == playerNumber) {
					System.out.println("YOU WIN");
					break;
				}
			}
			first = false;
			
		}
			
		
	}

}
