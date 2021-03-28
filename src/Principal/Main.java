package Principal;

import java.util.ArrayList;
import java.util.Arrays;

import Utiles.Escaner;

public class Main {

	public static void main(String[] args) {
		int ele = 0;
		String menu = "1- Comprar juegos " + "\n"
					+ "2- Modificar cuenta " + "\n"
					+ "3- Salir"
					+ "---------------------------------------------";
		Escaner esc = new Escaner();
		
		do {
			System.out.println(menu);
			switch (ele = esc.nextInt()) {
			case 1: {
				
				compra();
			}
			case 2: {
				
				modificacion();
			}
			case 3: {
				
				System.out.println("Saliendo...");
			}
			default:
				System.out.println("Opcion incorrecta vuelva a intentarlo...");
			}
		}while(ele == 3);

	}
	
	public static void compra() {
		Escaner esc = new Escaner();
		int ele = 0;
	//	ArrayList<Juego> carrito = new ArrayList<Juego>(); 
		String menu = "\t 1- añadir al carro \n"
					+ "\t 2- Pagar \n"
					+ "\t 3- Cancelar compra \n";
		
		do {
			System.out.println("todos los videojuegos // modificar con la lista");
			System.out.println(menu);
			
			switch (ele = esc.nextInt()) {
			case 1: {
				
				break;
			}case 2: {
				
				break;
			}case 3: {
				
				break;
			}
			default: System.out.println("Error de eleccion vuelva a intentarlo");
			}
			
			
		}while(ele == 3);
		
	}
	
	public static void modificacion() {
		
		
	}

}
