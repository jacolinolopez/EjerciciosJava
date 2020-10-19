package com.ipartek.ejercicios.variables;

/**
 * 
 * Realizar un programa que cree una variable de cada uno de los tipos de datos
 * simples que podemos encontrar en el lenguaje de programaci�n Java,
 * asign�ndoles un valor Una vez creadas, se mostraran por pantalla los valores
 * de cada una de ellas De manera adicional, se buscara por internet o otras
 * fuentes, los valores m�ximos y m�nimos que pueden albergar
 * 
 * @author Alberto
 * @version 1.0
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		byte TipoByte = 10;
		short TipoShort = 1000;
		int TipoInt = 345334543;
		long TipoLong = 726464737;
		float TipoFloat = (float) 56474.555;
		double TipoDouble = 64546;
		char TipoChar = 'v';
		String Nombre = "Alberto";
		boolean isOk = true;

		System.out.println("Este n�mero es un tipo Byte: " + TipoByte + ". El valor m�ximo es " + Byte.MIN_VALUE
				+ " Y el m�nimo " + Byte.MAX_VALUE);
		System.out.println("Este n�mero es un tipo Short: " + TipoShort + ". El valor m�ximo es " + Short.MIN_VALUE
				+ " Y el m�nimo " + Short.MAX_VALUE);
		System.out.println("Este n�mero es un tipo Float: " + TipoFloat + ". El valor m�ximo es " + Float.MIN_VALUE
				+ " Y el m�nimo " + Float.MAX_VALUE);
		System.out.println("Este n�mero es un tipo String: " + Nombre);

	}

}
