import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] sitzplan = new int[5][10];
		
		Scanner userEingabe = new Scanner(System.in);
		
		System.out.println("In welcher Reihe möchten Sie sizen? \nReihen: 1 - 5");
		int reihe = userEingabe.nextInt() - 1;
		
		System.out.println("Welchen Platz möchten Sie belegen? \nPlätze: 1 - 10");
		int platz = userEingabe.nextInt() - 1;
		
		//Eintrag im Sitzplan
		sitzplan[reihe][platz] = 1;
		
		//Ausgabe des Sitzplans
		for (int zeile = 0; zeile < sitzplan.length; zeile++) {
			for (int spalte = 0; spalte < sitzplan[zeile].length; spalte++) {
				System.out.print(sitzplan[zeile][spalte] + " ");
			}
			System.out.println();
		}

	}

}
