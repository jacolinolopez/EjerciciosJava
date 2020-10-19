package com.ipartek.ejercicios.excepciones;

import java.util.Scanner;

/**
 * Implemente un programa que lea un n�mero �a� y otro n�mero �b� y luego
 * calcule �a/b�. Pruebe a introducir b=0 <b> y ver que hace el programa con la
 * divisi�n por cero. Pruebe a introducir b=�Carlos� para ver c�mo se comporta
 * el programa. <b> A�ada excepciones para recoger estas excepciones y avisar
 * del problema al usuario
 * 
 * @author Alberto
 * @version 1.0
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		boolean isError = true;
		boolean isErrorb = true;
		Scanner sc = new Scanner(System.in);// Instanciamos clase Scanner

		do {

			try {
				System.out.println("inserta el primer n�mero: ");
				a = Integer.parseInt(sc.nextLine());
				isError = false;
			} catch (ArithmeticException e) {
				System.out.println("b no puede ser 0");
			} catch (Exception e) {
				System.out.println("Por favor, inserta un valor numerico");
			}

		} while (isError);

		do {

			try {
				System.out.println("inserta el segundo n�mero: ");
				b = Integer.parseInt(sc.nextLine());
				isErrorb = false;
			} catch (ArithmeticException e) {
				System.out.println("b no puede ser 0");
			} catch (Exception e) {
				System.out.println("Por favor, inserta un valor numerico");
			}
		} while (isErrorb);
		sc.close();
		System.out.println("El resultado es: " + (a / b));
	}

}
