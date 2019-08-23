import java.util.Scanner;

public class CrapsGame
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				
				System.out.println("What is your name?");
				
				String name = userInput.nextLine();
				
				System.out.println("Hello, " + name + "! Welcome to Craps!");
				
				int roll1 = (int) (Math.round(Math.random()* 6 + 1));
				int roll2 = (int) (Math.round(Math.random()* 6 + 1));

				int total = roll1 + roll2;
								
				System.out.println("You rolled " + roll1 + " and " + roll2 + " for a total of " + total + "!");
				
				boolean answer = true;
				
				while (answer)
					{
				
				if (total == 11 && total == 7)
					{
						System.out.println("You win, " + name + "!");
						answer = false;
					}
				
				
				if (total == 2 && total == 12)
					{
						System.out.println("Oh no! You loose, " + name + "!");
						answer = false;

					}
				else
					
					{
						System.out.println("Press enter to roll again!");
						String fake = userInput.nextLine();
						
							int roll3 = (int) (Math.round(Math.random()* 6 + 1));
							int roll4 = (int) (Math.round(Math.random()* 6 + 1));
						
							int total2 = roll3 + roll4;
						
									
						System.out.println("Your point is " + total + ". You rolled " + roll3 + " and " + roll4 + " for a total of " + total2 + "!");
						
						if (total == total2)
							{
								System.out.println("Congrats, " + name + "! You win!!");
								answer = false;
		
							}
						
						if (total2 == 7)
							
							{
								System.out.println("Sorry, " + name + "! YOU LOSE!!");
								answer = false;
							}
						
					}

					}
				
		

					
					}
			
			

	}
