import java.awt.image.ImagingOpException;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		String[] tablica = new String[5];
		int liczba = 0;

		do {
			System.out.println("Wpisz swoje imie: ");
			String imie;
			Scanner input = new Scanner(System.in);
			imie = input.nextLine();

			System.out.println("Pobrano imiê: " + imie);
			liczba++;
		} while (liczba < 5);
		System.out.println("Koniec! Nie mo¿esz wprowadziæ wiêcej imion!");

	}
	
}