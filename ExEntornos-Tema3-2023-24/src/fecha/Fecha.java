package fecha;

public class Fecha {
	public static final int DIEZ = 10;
	private int d;
	private int mes;
	private int a;

	/**
	 * Constructor 1 de la clase fecha
	 */
	public Fecha() {

	}

	/**
	 * Constructor 2 de la clase fecha
	 * 
	 * @param dia	Valor del atributo dia
	 * @param mes 	Valor del atributo mes
	 * @param anho	Valor del atributo anho
	 */
	public Fecha(int dia, int mes, int anio) {
		this.d = dia;
		this.mes = mes;
		this.a = anio;
	}

	/**
	 * Metodo que comprueba si una fecha es valida
	 * 
	 * @return	true o false segun sea o no valida
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
	 * Metodo que comprueba si un anho es bisisesto
	 * 
	 * @return true/false si es o no bisiesto
	 */
	private boolean esBisiesto() {
		return a % 4 == 0 && a % 100 != 0 || a % 400 == 0;
	}

	/**
	 *  Metodo que suma 1 dia a la fecha y actualiza el resto de atributos si es necesario
	 */
	public void nextDay() {
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
	 * Metodo que hace override al metodo original toString
	 * 
	 * @return nos devuelve un String con la info del objeto
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
