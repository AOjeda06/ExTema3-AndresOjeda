package fecha;

public class Fecha {
	/**
	 * Atributo para almacenar el dia
	 */
	private int d;

	/**
	 * Atributo para almacenar el mes
	 */
	private int m;

	/**
	 * Atributo para almacenar el año
	 */
	private int a;

	/**
	 * Constructor 1 de la clase fecha
	 */
	public Fecha() {

	}

	/**
	 * Constructor 2 de la clase fecha
	 * 
	 * @param dia  valor del dia
	 * @param mes  valor del mes
	 * @param anio valor del anho
	 */
	public Fecha(int dia, int mes, int anio) {
		this.d = dia;
		this.m = mes;
		this.a = anio;
	}

	/**
	 * Metodo que comprueba si una fecha es válida
	 * 
	 * @return true/false si es o no es válida
	 */
	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, anioCorrecto;
		anioCorrecto = a > 0;
		mesCorrecto = m >= 1 && m <= 12;
		switch (m) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = d >= 1 && d <= 29;
			} else {
				diaCorrecto = d >= 1 && d <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = d >= 1 && d <= 30;
			break;
		default:
			diaCorrecto = d >= 1 && d <= 31;
		}
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

	/**
	 * Metodo para comprobar si un anho es bisiesto
	 * 
	 * @return true/false si es o no es bisiesto
	 */
	private boolean esBisiesto() {
		boolean esBisiesto = (a % 4 == 0 && a % 100 != 0 || a % 400 == 0);
		return esBisiesto;
	}

	/**
	 * Método para incrementar en 1 el dia, y consecuentemente actualizar el resto
	 * de valores (mes y anho) si es necesario
	 */
	public void diaSiguiente() {
		d++;
		if (!fechaCorrecta()) {
			d = 1;
			m++;
			if (!fechaCorrecta()) {
				m = 1;
				a++;
			}
		}
	}

	/**
	 * Override el metodo toString de java
	 * 
	 * @return Un String con la informacion de la fecha
	 */
	public String toString() {
		if (d < 10 && m < 10) {
			return "0" + d + "-0" + m + "-" + a;
		} else if (d < 10 && m >= 10) {
			return "0" + d + "-" + m + "-" + a;
		} else if (d >= 10 && m < 10) {
			return d + "-0" + m + "-" + a;
		} else {
			return d + "-" + m + "-" + a;
		}
	}

}
