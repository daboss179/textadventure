import javax.swing.JOptionPane;

public class game {
	public static void main(String[] args) {
		String response = null;
		int Health = 10;
		int outcome;
		int random;
        int hunger = 0;
		System.out.println("Hello welcome to the world called Rayton.");
		System.out.println(" you were a astronaut that crashed in a world called Rayton and all your comunication");
		System.out.println(
				"Devices have broke from the crash. as well all other astronaut's on the ship have died from the crash.");
		System.out.println("your objective for this game is to explore the world and find a way to get back to");
		System.out.println("youre home planet.            Ps: DONT DIE!!!!!");
		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] choices = { "Wait", "Ignore" };
		int optionNum = JOptionPane.showOptionDialog(null,
				"You wake up your leg is broken wait for it to heal or ignore it", response,
				JOptionPane.WARNING_MESSAGE, 0, null, choices, choices[0]);
		String choice = choices[optionNum];
		if (choice.equals("Wait")) {
			Health = Health + 1;
			System.out.println("you must now wait 10 seconds");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("youre leg is now healed");
		} else {
			Health = Health - 2;
			System.out.println("you have lost 2 health. you have " + Health + " Health left");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(
				"now you dicied to go and explore the planet" + " it turns out that you can breath on the planet");

		String[] B = { "Eat", "Keep exploring" };
		do{
			int A = JOptionPane.showOptionDialog(null, "you are very hungry you encounter a wierd looking fruit tree",
		
				response, JOptionPane.WARNING_MESSAGE, 0, null, B, B[0]);
		choice = B[A];
		hunger = hunger + 1;
		if (choice.equals("Eat")) {
			Health = Health + 1;
			System.out.println("You are now full you gain 1 health. you have " + Health + " Health left");
          hunger= hunger + 1;
		} else {
			Health = Health - 2;
			System.out.println("You starve you lose 2 health " + Health + " Health left");
		}
		
	    }while(hunger < 2);
		
		String[] X = { "go in", "walk away" };
		int Y = JOptionPane.showOptionDialog(null, "you encounter a crater ", response, JOptionPane.WARNING_MESSAGE, 0,
				null, X, X[0]);
		choice = X[Y];
		if (choice.equals("go in")) {
			System.out.println("You slide down the crater");
		} else {
			System.out.println("You start walking away but you stumble down the crater you lose 2 health");

			Health = Health - 2;
			System.out.println("You have " + Health + " Health left");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		String[] M = { "try to befriend him", "try to kill him" };
		int R = JOptionPane.showOptionDialog(null, "You find a person with a ship", response,
				JOptionPane.WARNING_MESSAGE, 0, null, M, M[0]);
		String choice1 = M[R];
		if (choice1.equals("try to kill him")) {
			System.out.println("as you kill him you lose 9 health");
			Health = Health - 9;
			System.out.println("You have "+Health+" Health left");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (Health < 0.1) {
			System.out.println("You have died trying to kill him");
			System.out.println("game over please try again");
		}else {
			System.out.println("You have succecsfully killed him");
			System.out.println("You then took his space ship and flew back to your home planet");
			System.out.println("good job you have won the game");
		
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		} else {
			random = (int) (Math.random() * 2);
			random = random + 1;
			if (random == 1) {
				System.out.println("You have succecsfully befriended him");
				System.out.println("Both you and him have gone to the space ship and have left back to your home planet");
				System.out.println("good job you have won the game");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			
			} else {
				System.out.println("You tried to befriend him but he saw you as a threat and killed you");
				System.out.println("You have died and lost the game plzz try again");
		
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
