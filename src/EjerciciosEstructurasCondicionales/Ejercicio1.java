package EjerciciosEstructurasCondicionales;

/**
 * Realizar un programa que realice la siguiente funcionalidad Se crearan 5
 * variables enteras con los nombres a, b, c, d y e con los valores 6, 8, 0, 8 y
 * 9
 * <ul>
 * <li>Comparar las variables a y c, indicar por consola cual es mayor</li>
 * <li>Indicar cual de las variables es la que tiene menor valor y la de mayor
 * valor</li>
 * <li>Compara las variables b y d y comprueba si son iguales</li>
 * <li>Comprobar si se puede realizar la división de a/c si no se puede realizar
 * indicarlo, en caso contrario realizar la división</li>
 * </ul>
 * 
 * 
 * @author hezmo
 * @version 1.0
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		int a = 6, b = 8, c = 0, d = 8, e = 9;
		int numeros[] = { a, b, c, d, e };
		int mayor = 0, menor = 0;

		System.out.println("COMPARAR A Y C");
		System.out.println("--------------");
		if (a > c) {
			System.out.println("a es mayor que c");

		} else {
			System.out.println("c es mayor que a ");

		} // if
		System.out.println("");

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		System.out.println("NÚMEROS MAYOR Y MENOR");
		System.out.println("---------------------");
		System.out.println("El número mayor es: " + mayor);
		System.out.println("El número menor es: " + menor);
		System.out.println("");
		System.out.println("COMPARANDO B Y D");
		System.out.println("----------------");
		if (b == d) {
			System.out.println("B y D son el mismo número");
		} else {
			System.out.println("B y D son distintos");
		}
		System.out.println("");
		System.out.println("DIVIDIENDO A ENTRE C");
		System.out.println("--------------------");
		if (c == 0) {
			System.out.println("No se puede dividir entre 0!!");
		} else {
			System.out.println("El resultado de la división es" + (a / c));
		}
	}

}
