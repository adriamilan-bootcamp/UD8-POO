
public class MainApp {

	/*
	 * Crearemos una clase llamada Electrodomestico con las siguientes características:
	 * 
	 * - Sus atributos son precio base, color, consumo energético (letras entre A y F) y
	 * peso. Indica que se podrán heredar.	
	 * 
	 * - Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el
	 * nombre esta en mayúsculas o en minúsculas.
	 * 
	 * - Los constructores que se implementaran serán:
	 * = Un constructor por defecto.
	 * = Un constructor con el precio y peso. El resto por defecto.
	 * = Un constructor con todos los atributos.
	 */
	
	public static void main(String[] args) {
	
		inputOutput();		
		
	}
	
	public static void inputOutput() {
	
		Electrodomestico televisor = new Electrodomestico();
		Electrodomestico nevera = new Electrodomestico(122.21, 85.24);
		Electrodomestico laptop = new Electrodomestico(654, "rojo", 'B', 3.43);
		
		System.out.println("TELEVISOR\n=> " + televisor.getPrecioBase() + "€\n=> " + televisor.getPeso() + "kg\n=> Tipo " + televisor.getConsumoEnergetico() + "\n=> " + televisor.getColor());
		System.out.println("NEVERA\n=> " + nevera.getPrecioBase() + "€\n=> " + nevera.getPeso() + "kg\n=> Tipo " + nevera.getConsumoEnergetico() + "\n=> " + nevera.getColor());
		System.out.println("LAPTOP\n=> " + laptop.getPrecioBase() + "€\n=> " + laptop.getPeso() + "kg\n=> Tipo " + laptop.getConsumoEnergetico() + "\n=> " + laptop.getColor());

	}
	
}
