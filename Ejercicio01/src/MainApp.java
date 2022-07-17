
public class MainApp {

	/*
	 * Haz una classe llamada Persona que siga las siguientes condiciones:
	 * - Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer),
	 * peso y altura. No queremos que se accedan directamente a ellos.
	 * Piensa que modificador de acceso es el más adecuado, también su
	 * tipo. Si quieres añadir algun atributo puedes hacerlo.
	 * 
	 * - Por defecto, todos los atributos menos el DNI serán valores por
	 * defecto según su tipo (0 números, cadena vacía para String, etc.).
	 * Sexo sera hombre por defecto, usa una constante para ello.
	 * 
	 * - Se implantaran varios constructores:
	 * = Un constructor por defecto
	 * = Un constructor con el nombre, edad y sexo, el resto por defecto.
	 * = Un constructor con todos los atributos como parámetro.
	 */
	
	public static void main(String[] args) {
		
		/*
		 * Instanciamos una persona por cada método como modo de prueba
		 */
		Persona persona1 = new Persona("12345678C");
		Persona persona2 = new Persona("Milan", 18, "Hombre", "12345678C");
		Persona persona3 = new Persona("Maria", 24, "Mujer", 64.43, 1.72, "12345678C");
		
		/*
		 * Mostramos el resultado
		 */
		System.out.println("Persona1\n=> " + persona1.getNombre() + "\n=> " + persona1.getEdad() + " años\n=> " + persona1.getSexo() + "\n=> " + persona1.getPeso() + "kg\n=> " + persona1.getAltura() + "m\n=> " + persona1.getDni() + "\n");
		System.out.println("Persona2\n=> " + persona2.getNombre() + "\n=> " + persona2.getEdad() + " años\n=> " + persona2.getSexo() + "\n=> " + persona2.getPeso() + "kg\n=> " + persona2.getAltura() + "m\n=> " + persona2.getDni() + "\n");
		System.out.println("Persona3\n=> " + persona3.getNombre() + "\n=> " + persona3.getEdad() + " años\n=> " + persona3.getSexo() + "\n=> " + persona3.getPeso() + "kg\n=> " + persona3.getAltura() + "m\n=> " + persona3.getDni() + "\n");

	}
	
}
