import java.util.Scanner;

public class Studierender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrNummer = 22222;
		boolean validMatrNum = false;
		
		if (matrNummer > 9999 && matrNummer < 100000 && matrNummer % 2 == 1) {
			System.out.println("korrekt");
			validMatrNum = true;
		} else {
			System.out.println("nicht erlaubt");
		}
		System.out.println(validMatrNum);

	}

}
