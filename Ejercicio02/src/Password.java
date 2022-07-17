
public class Password {

	private int longitud;
	private String contraseña;
	
	/*
	 *  Constructor por defecto
	 *  - Longitud => 8 caracteres
	 */
	public Password () {
		this.longitud = 8;
		this.contraseña = passwordGenerator(this.longitud);
	}
	
	/*
	 * Constructor con longitud predefinida
	 */
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = passwordGenerator(longitud);
	}
	
	/* Getters & Setters */
	
	public String getContraseña() {
		return contraseña;
	}
	
	/* 
	 * Método para generar la contraseña
	 */
	public String passwordGenerator(int longitud) {
		
		// Caracteres alfanumericos
		String caracteresAlfanumericos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
		
		// Inicializamos la variable password
		String password = "";
		
		for (int i = 0; i < longitud; i++) {
			  
			/*
			 * Generando un número aleatorio entre 0 y la longitud 
			 * de la variable alphaNumericString
			 */
            int index = (int)(caracteresAlfanumericos.length() * Math.random());
  
            // Añadiendo el caracter a la contraseña
            password += caracteresAlfanumericos.charAt(index);
        }
		
		// Devolvemos la contraseña generada
		return password;
		
	}
	
}
