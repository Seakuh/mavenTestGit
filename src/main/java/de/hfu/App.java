package de.hfu;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		System.out.println("Teteingabe: ");
		Scanner x = new Scanner(System.in);
		String x1 = x.nextLine();
		System.out.println("Textausgabe:");
		System.out.println(x1.toUpperCase());
		
	}

}
