package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio2 {

	static final int EDAD_MAX = 150;
	static final int EDAD_MIN = 0;

	public static void main(String[] args) {

		int entrada = 0;
		int intentos = 0;

		Scanner sc = new Scanner(System.in);// Instanciamos clase Scanner
		do {
			if (intentos < 3) {
				System.out.printf("Introduzca una edad entre %s y %s: ", EDAD_MIN, EDAD_MAX);
			} else {
				System.out.println("El número no es correcto, borrego!!. Introduzca una edad entre 0 y 150: ");
			} // IF
			entrada = Integer.parseInt(sc.nextLine());
			intentos++;
		} while (entrada > EDAD_MAX || entrada < EDAD_MIN);
		System.out.println("El número introducido es correcto");
		sc.close();
	}
}
