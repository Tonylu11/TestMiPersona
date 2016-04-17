package testMiPersona;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class TestMiPersona {
	public static void main(String[] args) {
		try {
			guardar();
			leer();
		} catch (IOException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * Recupera un archivo.
	 * 
	 * @throws IOException
	 *             Excepcion de entrada/salida.
	 * @throws FileNotFoundException
	 *             Cuando el archivo no se encuentra.
	 * @throws ClassNotFoundException
	 */
	private static void leer() throws IOException, FileNotFoundException, ClassNotFoundException{
		System.out.println("Recuperando archivo..");
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("ficha.obj")));
		System.out.println(ois.readObject());
	}

	/**
	 * Guardar un archivo.
	 * 
	 * @throws IOException
	 *             Error de entrada/salida.
	 * @throws FileNotFoundException
	 *             Cuando el archivo no se encuentra.
	 */
	private static void guardar() throws IOException, FileNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("ficha.obj")));
		Persona persona = new Persona("Antonio", "Luque Bravo", new GregorianCalendar(1996, 07, 11));
		System.out.println("Muestro persona antes de guardarla en el fichero..\n" + persona.toStringFechaNacimiento());
		oos.writeObject(persona);
		oos.close();
		System.out.println("Guardado.");
	}
}
