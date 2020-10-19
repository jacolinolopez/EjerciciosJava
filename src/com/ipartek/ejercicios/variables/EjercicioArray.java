package com.ipartek.ejercicios.variables;

public class EjercicioArray {

	public static void main(String[] args) {

		int temperaturaSemana[] = { 10, 12, 13, 16, 21, 23, 20 };
		String diaSemana[] = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
		float mediaSemana = 0;

		for (int i = 0; i < temperaturaSemana.length; i++) {
			System.out.println(diaSemana[i] + " hace " + temperaturaSemana[i]);
			mediaSemana = mediaSemana + temperaturaSemana[i];
		}
		mediaSemana = mediaSemana / temperaturaSemana.length;
		System.out.printf("La media de la semana es %.2f ", mediaSemana);
	}

}
