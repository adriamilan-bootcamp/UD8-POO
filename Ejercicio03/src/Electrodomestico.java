
import java.util.Arrays;

public class Electrodomestico {
	
	// Declaramos los tipos de consumo energético
	public char[] consumosEnergeticos = {'A', 'B', 'C', 'D', 'E', 'F'};
	
	// Declaramos los colores disponibles
	public String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
	
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	
	/*
	 * Constructor por defecto
	 */
	public Electrodomestico() {
		this.precioBase = 100.00;
		this.color = colores[0];
		this.consumoEnergetico = consumosEnergeticos[5];
		this.peso = 5.00;
	}
	
	/*
	 * Constructor:
	 * - Precio
	 * - Peso
	 */
	public Electrodomestico(double precio, double peso) {
		this.precioBase = precio;
		this.color = colores[0];
		this.consumoEnergetico = consumosEnergeticos[5];
		this.peso = peso;
	}
	
	/*
	 * Constructor:
	 * - Precio base
	 * - Color
	 * - Consumo Energético
	 * - Peso
	 */
	public Electrodomestico(double precio, String color, char consumo, double peso) {
		this.precioBase = precio;
		this.color = colorChecker(color.toLowerCase());
		this.consumoEnergetico = consumoChecker(consumo);
		this.peso = peso;
	}
	
	/* Getters & Setters */
	public double getPrecioBase() {
		return precioBase;
	}
	
	public String getColor() {
		return color;
	}
	
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	
	public double getPeso() {
		return peso;
	}
	
	/*
	 * Método para comprobar si el color introducido esta disponible,
	 * si lo esta lo devuelve
	 */
	public String colorChecker(String color) {
		for(String x : colores){
			if(x == color.toLowerCase()){
		        return color; // Devuelve el color
		    }
		}
		return colores[0];
	}
	
	/* 
	 * Método para comprobar si el tipo de consumo introducido esta disponible,
	 * si lo esta lo asigna.
	 */
	public char consumoChecker(char consumo) {
		for(char x : consumosEnergeticos){
			if(x == consumo){
		        return consumo; // Devuelve el consumo
		    }
		}
		return consumosEnergeticos[5];
	}
	
}
