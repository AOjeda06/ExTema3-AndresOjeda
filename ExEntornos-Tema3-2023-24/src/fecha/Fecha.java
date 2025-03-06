package fecha;

public class Fecha {
<<<<<<< HEAD
	public static final int DIEZ = 10;
	private int d;
	private int mes;
	private int a;

	/**
=======
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
>>>>>>> javadoc
	 * Constructor 1 de la clase fecha
	 */
	public Fecha() {

	}

	/**
	 * Constructor 2 de la clase fecha
	 * 
<<<<<<< HEAD
	 * @param dia	Valor del atributo dia
	 * @param mes 	Valor del atributo mes
	 * @param anho	Valor del atributo anho
=======
	 * @param dia  valor del dia
	 * @param mes  valor del mes
	 * @param anio valor del anho
>>>>>>> javadoc
	 */
	public Fecha(int dia, int mes, int anio) {
		this.d = dia;
		this.mes = mes;
		this.a = anio;
	}

	/**
<<<<<<< HEAD
	 * Metodo que comprueba si una fecha es valida
	 * 
	 * @return	true o false segun sea o no valida
=======
	 * Metodo que comprueba si una fecha es válida
	 * 
	 * @return true/false si es o no es válida
>>>>>>> javadoc
	 */
	public boolean fechaCorrecta() {
		boolean diaCorrecto;
		boolean mesCorrecto;
		boolean anioCorrecto;

		anioCorrecto = a > 0;
		mesCorrecto = mes >= 1 && mes <= 12;
		boolean diaMayor1 = d >= 1;
		switch (mes) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = diaMayor1 && d <= 29;
			} else {
				diaCorrecto = diaMayor1 && d <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = diaMayor1 && d <= 30;
			break;
		default:
			diaCorrecto = diaMayor1 && d <= 31;
		}
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

	/**
<<<<<<< HEAD
	 * Metodo que comprueba si un anho es bisisesto
	 * 
	 * @return true/false si es o no bisiesto
=======
	 * Metodo para comprobar si un anho es bisiesto
	 * 
	 * @return true/false si es o no es bisiesto
>>>>>>> javadoc
	 */
	private boolean esBisiesto() {
		return a % 4 == 0 && a % 100 != 0 || a % 400 == 0;
	}

	/**
<<<<<<< HEAD
	 *  Metodo que suma 1 dia a la fecha y actualiza el resto de atributos si es necesario
	 */
	public void nextDay() {
=======
	 * Método para incrementar en 1 el dia, y consecuentemente actualizar el resto
	 * de valores (mes y anho) si es necesario
	 */
	public void diaSiguiente() {
>>>>>>> javadoc
		d++;
		if (!fechaCorrecta()) {
			d = 1;
			mes++;
			if (!fechaCorrecta()) {
				mes = 1;
				a++;
			}
		}
	}

	/**
<<<<<<< HEAD
	 * Metodo que hace override al metodo original toString
	 * 
	 * @return nos devuelve un String con la info del objeto
=======
	 * Override el metodo toString de java
	 * 
	 * @return Un String con la informacion de la fecha
>>>>>>> javadoc
	 */
	public String toString() {
		String resultado;
		if (d < DIEZ && mes < DIEZ) {
			resultado = "0" + d + "-0" + mes + "-" + a;
		} else if (d < DIEZ && mes >= DIEZ) {
			resultado = "0" + d + "-" + mes + "-" + a;
		} else if (d >= DIEZ && mes < DIEZ) {
			resultado = d + "-0" + mes + "-" + a;
		} else {
			resultado = d + "-" + mes + "-" + a;
		}
		return resultado;
	}

}
