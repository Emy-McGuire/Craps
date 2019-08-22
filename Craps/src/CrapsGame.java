import java.util.Scanner;

public class CrapsGame
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				
				System.out.println("What is your name?");
				
				String name = userInput.nextLine();
				
				System.out.println("Hello, " + name + "! Welcome to Craps!");
				
				int roll1 = (int) (Math.round(Math.random()* 7 + 1));
				int roll2 = (int) (Math.round(Math.random()* 7 + 1));

				int total = roll1 + roll2;
				
				boolean answer = true;
				
				System.out.println("You rolled " + roll1 + " and " + roll2 + " for a total of " + total + "!");
				
				if (total == 11)
					{
						System.out.println("You win, " + name);
					}
				if (total == 7)
					{
						System.out.println("You win, " + name);
					}
				
				if (total == 2)
					{
						System.out.println("You win, " + name);
					}
				if (total == 12)
					{
						System.out.println("You win, " + name);
					}
				
			}

	}
