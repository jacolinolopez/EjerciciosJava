package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

import com.ipartek.Utilidades;

/**
 * Realice un m�todo que reciba como argumento un String y un n�mero y muestre
 * la letra de la posici�n indicada. <b> Ll�melo pasando como par�metro un
 * String sin inicializar. Dicha llamada se encontrara dentro de un bloque try
 * catch, <b> que en caso de producirse una excepci�n por un paso de par�metros
 * a null, no acabe con la ejecuci�n del programa. <b> As� mismo, se controlara
 * tambi�n que si el numero pasado es mayor que el tama�o del string, capturara
 * el error y nos <b> solicitara meter un numero valido, indic�ndonos los
 * valores en los que puede estar comprendido<b> (para este apartado se le pasa
 * como string la cadena de texto �La lluvia en Sevilla no es una maravilla�)
 * 
 * @author Alberto
 * @version 1.0
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		int numero = 0;
		char letra;
		Scanner sc = new Scanner(System.in);
		boolean isError = true;

		try {

			System.out.println("Introduce el texto:");
			String texto = sc.nextLine();
			System.out.println("Introduce el n�mero:");
			numero = Integer.parseInt(sc.nextLine());
			letra = Utilidades.posicionLetra(texto, numero);
			System.out.println("La letra es: " + letra);
			isError = false;

		} catch (Exception e) {

		}

	}

}
