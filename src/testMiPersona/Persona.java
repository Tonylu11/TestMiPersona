package testMiPersona;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * TestMiPersona Implementa el programa "TestMiPersona.java" que: Guarde un
 * objeto persona en un flujo con los siguientes datos: Tu nombre Tus apellidos
 * Tu fecha de nacimiento (utiliza la clase Calendar) Recupere el objeto persona
 * y muestre: Tu nombre Tus apellidos Tu edad 1. Indica: 1. Clases de flujos
 * utilizadas 2. Métodos de flujos utilizadas 3. Forma de tratar las excepciones
 * 4. Interfaces que hayas manejado y por qué.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class Persona implements Serializable {
	/**
	 * Nombre de la persona.
	 */
	private String nombre;

	/**
	 * Apellidos de la persona.
	 */
	private String apellidos;
	/**
	 * Fecha del sistema
	 */
	private Calendar sysdate = Calendar.getInstance();
	/**
	 * Fecha de nacimiento de la persona.
	 */
	private GregorianCalendar fechaNacimiento;

	/**
	 * 
	 * @param nombre
	 *            Nombre de la persona.
	 * @param apellidos
	 *            Apellidos de la persona.
	 * @param fechaNacimiento
	 *            Fecha de nacimiento de la persona.
	 */
	Persona(String nombre, String apellidos, GregorianCalendar fechaNacimiento) {
		setNombre(nombre);
		setApellidos(apellidos);
		setFechaNacimiento(fechaNacimiento);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	private void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public GregorianCalendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	private void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Calcula la edad entre dos a&ntilde;os.
	 * 
	 * @return Calcula la edad entre dos a&ntilde;os.
	 */
	private int calcularEdad() {
		return sysdate.get(Calendar.YEAR) - getFechaNacimiento().get(Calendar.YEAR);
	}

	/**
	 * Muestra la fecha de nacimiento de la persona.
	 * 
	 * @return cadena con la fecha de nacimiento.
	 */
	public String mostrarFechaNacimiento() {
		return getFechaNacimiento().get(Calendar.DAY_OF_MONTH) + "/" + getFechaNacimiento().get(Calendar.MONTH) + "/"
				+ getFechaNacimiento().get(Calendar.YEAR);
	}

	/**
	 * toString() para la fecha de nacimiento.
	 * 
	 * @return fecha de nacimiento.
	 */
	public String toStringFechaNacimiento() {
		return "Persona: \n\tNombre: " + getNombre() + "\n\tApellidos: " + getApellidos() + "\n\tFecha de Nacimiento: "
				+ mostrarFechaNacimiento();
	}

	@Override
	public String toString() {
		return "Persona: \n\tNombre: " + getNombre() + "\n\tApellidos: " + getApellidos() + "\n\tEdad: "
				+ calcularEdad() + " años";
	}

}
