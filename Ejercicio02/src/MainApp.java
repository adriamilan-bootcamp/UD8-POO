import javax.swing.JOptionPane;

public class MainApp {

	/*
	 * Haz una una classe llamada Password que siga las siguientes condiciones:
	 * 
	 * - Que tenga los atributos longitud y contraseña. Por defecto, la longitud
	 *   será de 8.
	 * 
	 * - Un constructor con la longitud que nosotros le pasemos. Genera una
	 *   contraseña aleatoria con esa longitud.
	 */
	
	public static void main(String[] args) {
		
		Password contraseña = null;
		
		boolean salirPrograma = true;
		while(salirPrograma) {
			
			String accion = JOptionPane.showInputDialog("Bienvenido al generador de contraseñas!\nSelecciona una acción:\n- Por defecto (8 Caracteres) => DEFECTO\n- Seleccionar caracteres, ej: 12 => CARACTERES");
			
			switch (accion.toUpperCase()) {
				case "DEFECTO":
					contraseña = new Password();
					salirPrograma = false;
					break;
				case "CARACTERES":
					contraseña = new Password(Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud de tu contraseña, ej: 12")));
					salirPrograma = false;
					break;
				default:
					JOptionPane.showMessageDialog(null, "La acción seleccionada no existe, vuelve a intentarlo");
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "La contraseña generada es: " + contraseña.getContraseña());
		
	}
	
}
