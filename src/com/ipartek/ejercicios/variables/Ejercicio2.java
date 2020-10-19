package com.ipartek.ejercicios.variables;

/**
 * Realizar una pequeña calculadora. Para ello se crearan 10 variables de distintos tipos numéricos. 
 * Una vez creadas dichas variables y asignadas desde código valores (se recomienda valores entre -10 y 10) 
 * realizar las siguientes operaciones:
 *<p>
 *<ul> - La suma de todos los números</ul>
 *<ul> - La resta de todos los números</ul>
 *<ul> - La media de todos los números</ul>
 *</p>
 * @author Alberto
 * @version 1.0
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		int num1 = 1, num2 = 4, num3 = 5;
		float num4 = 7, num5 = 3, num6 = 10;
		byte num7 = 11, num8 = 15, num9 = 12, num10 = 8;

		float resultado1, resultado2, resultado3;

		resultado1 = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
		resultado2 = num1 - num2 - num3 - num4 - num5 - num6 - num7 - num8 - num9 - num10;
		resultado3 = resultado1 / 10;

		System.out.println("La suma de todos los números es: " + resultado1);
		System.out.println("La resta de todos los números es: " + resultado2);
		System.out.println("La media de todos los números es: " + resultado3);

	}

}
