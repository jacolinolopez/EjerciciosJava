package com.ipartek;

public class Utilidades {

	/**
	 * Calcula la letra del DNI
	 * 
	 * @param numeros String son los 8 numeros del DNI
	 * @return dni completo con los numeros + letra
	 * @throws Exception si no pasamos como parametros 8 numeros
	 */
	static public char calcularLetraDni(String numeros) throws Exception {

		char letraDni[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };

		if (numeros == null) {
			throw new Exception("No puede ser null");
		}

		if (numeros.length() != 8) {
			throw new Exception("Los numeros de un dni son 8");
		}

		int calculoDni = Integer.parseInt(numeros) % 23;

		return letraDni[calculoDni];
	}

	static public char posicionLetra(String texto, int posicion) throws Exception {

		char cadena[] = texto.toCharArray();

		return cadena[posicion + 1];
	}
}
