import javax.swing.JOptionPane;

public class betting {
	public static void main(String[] args) {
		int money = (10);

		do {
			int secret = (int) (Math.random() * 11);
			String response = JOptionPane.showInputDialog("Guess a number");
			int usernum = Integer.parseInt(response);
			if (usernum > 10) {
				System.out.println("Don't try to cheat. We took one coin");
				usernum = (usernum - 1);
			} else {
				if (usernum < 1)
					;
				System.out.println("Don't try to cheat. We took one coin");
				money = (money - 1);
			}
			if (usernum == secret) {
				money = (money + 3);
				System.out.println("You got it.You got 3 coins");
			} else {
				if (usernum != secret)
					;
				money = (money - 1);
				System.out.println("You guessed " + usernum + " and the number was " + secret + " we took a coin");
     
			}

		} while (money > 0);
	}
}