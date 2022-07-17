
public class mainApp {

	/*
	 * Creamos una clase llamada Serie con las siguientes características:
	 * 
	 * - Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
	 * 
	 * - Por defecto, el numero de temporadas es de 3 temporadas y entregado false.
	 *   El resto de atributos serán valores por defecto ségun el tipo del atributo.
	 *   
	 * - Los constructores que se implementaran serán:
	 *   - Un constructor por defecto.
	 *   - Un constructor con el titulo y creador. El resto por defecto.
	 *   - Un constructor con todos los atributos, excepto de entregado.
	 */
	
	public static void main(String[] args) {
		
		inputOutput();
		
	}
	
	public static void inputOutput() {
		
		Serie friends = new Serie();
		Serie tBBT = new Serie("The big bang theory", "Chuck Lorre");
		Serie hIMYM = new Serie("How I meet your mother", 9, true, "comedia", "Bob Saget");
		
		System.out.println(friends.getTitulo() + "\nNumero temporadas=> " + friends.getNumeroTemporadas() + "\nEntregado=>" + friends.isEntregado() + "\nGenero=> " + friends.getGenero() + "\nCreador=>" + friends.getCreador() + "\n");
		System.out.println(tBBT.getTitulo() + "\nNumero temporadas=> " + tBBT.getNumeroTemporadas() + "\nEntregado=>" + tBBT.isEntregado() + "\nGenero=> " + tBBT.getGenero() + "\nCreador=>" + tBBT.getCreador() + "\n");
		System.out.println(hIMYM.getTitulo() + "\nNumero temporadas=> " + hIMYM.getNumeroTemporadas() + "\nEntregado=>" + hIMYM.isEntregado() + "\nGenero=> " + hIMYM.getGenero() + "\nCreador=>" + hIMYM.getCreador() + "\n");
	}
	
}
