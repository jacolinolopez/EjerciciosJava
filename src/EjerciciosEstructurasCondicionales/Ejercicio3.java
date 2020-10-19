package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

/**
 * Pedir por teclado al usuario que introduzca una distancia en cm<br>
 * Una vez introducida, se solicitará que escoja a que unidad se van a
 * convertir, <br>
 * introduciendo la opción por teclado<br>
 * <ul>
 * <li>A convertir a metros</li>
 * <li>B: convertir a pulgadas</li>
 * <li>C: convertir a pies</li>
 * <li>D:convertir a yardas</li>
 * </ul>
 * 
 * @author hezmo
 * @version 1.0
 */
public class Ejercicio3 {

	static final float YARDA = 91.4f;
	static final int METRO = 100;
	static final float PULGADA = 2.54f;
	static final float PIE = 30.48f;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float distancia = 0;
		String opcion = "";
		String unidad = "";
		int intentos = 0;

		System.out.println("Introduzca la distancia en cm: ");
		distancia = Integer.parseInt(sc.nextLine());
		do {
			if (intentos == 0) {
				System.out.printf("Seleccione la opción:\n\n a.- Yardas \n b.- Metros \n c.- Pulgadas \n d.- Pies \n");
			} else {
				System.out.printf(
						"POR FAVOR, ELIJA UNA DE LAS OPCIONES DISPONIBLES. \n Seleccione la opción:\n\n A.- Yardas \n B.- Metros \n C.- Pulgadas \n D.- Pies");
			}
			opcion = sc.nextLine();
			intentos++;
		} while (!"a".equalsIgnoreCase(opcion) && !"b".equalsIgnoreCase(opcion) && !"c".equalsIgnoreCase(opcion)
				&& !"d".equalsIgnoreCase(opcion)); // Comparando strings
		switch (opcion) {
		case "a":
			distancia = distancia / YARDA;
			unidad = "YARDAS";
			break;
		case "b":
			distancia = distancia / METRO;
			unidad = "METROS";
			break;
		case "c":
			distancia = distancia / PULGADA;
			unidad = "PULGADAS";
			break;
		case "d":
			distancia = distancia / PIE;
			unidad = "PIES";
			break;
		}
		System.out.printf("La distancia en %s es: %s", unidad, distancia);

		sc.close();
	}

}
