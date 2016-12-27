import java.util.Scanner;

public class Names {
	public static void main(String[] args) {

		String[] tab1 = new String[5];
		int[] tab2 = new int[5];

		Scanner input = new Scanner(System.in);

		// name input
		for (int i = 0; i < 5; i++) {

			System.out.println("Wpisz swoje imiê:");
			tab1[i] = input.next();
			System.out.println("Witaj " + tab1[i] + "!");

			// age input
			System.out.println("Wpisz swój wiek:");
			tab2[i] = input.nextInt();

		}
		for (int i = 0; i < 5; i++)
			System.out.print(tab1[i] + " ma " + tab2[i] + " lat. \n");
	}
}