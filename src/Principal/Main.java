package Principal;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import Utiles.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Juego> juegos = new ArrayList<Juego>();
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		
		
		int ele = 0;
		String menu = "1- Comprar juegos " + "\n"
					+ "2- Modificar Cliente " + "\n"
					+ "3- Añadir Juego \n"
					+ "4- Añadir Cliente \n"
					+ "5- Salir"
					+ "---------------------------------------------";
		Escaner esc = new Escaner();
		
		do {
			System.out.println(menu);
			switch (ele = esc.nextInt()) {
			case 1: {
				
				compra();
			}
			case 2: {
				
				modificarCliente();
			}
			case 3: {
				
				añadirJuego();
			}
			case 4: {
				
				añadirCliente();
			}
			case 5: {
				
				System.out.println("Saliendo...");
			}
			default:
				System.out.println("Opcion incorrecta vuelva a intentarlo...");
			}
		}while(ele != 3);

	}
	
	public static void compra() {
		Escaner esc = new Escaner();
		int total = 0;
		int ele = 0;
		Integer id = 0;
		boolean flagCom = false;
		boolean flagDev = false;
		
		
		ArrayList<Integer> carrito = new ArrayList<Integer>(); 
		
		String fact = "";
		String menu = "\t 1- añadir al carro \n"
					+ "\t 2- Quitar del carro \n"
					+ "\t 3- Pagar \n"
					+ "\t 4- Cancelar compra \n";
		
		do {
			System.out.println("todos los videojuegos // modificar con la lista");
			System.out.println(menu);
		
			switch (ele = esc.nextInt()) {
			case 1: {
				/**
				
				do {
				System.out.println("Escriba el ID");
				id = esc.nextInt();
				for (Juego busca : Juego) {
					if (busca.getId() == id) {
						carrito.add(id);
						flag = true;
						break;
					}					
				}
				}while(flagCom == true)
				**/
			
				break;
			}case 2: {
				
				/**
				do {
				System.out.println("Escriba el ID que desea quitar");
				id = esc.nextInt;
				if (carrito.contains(id)) {
					for (int i = 0; i < carrito.zice() ; i ++) {
						if(id== carrito.get(i)){
							carrito.remove(carrito.get(i));
							flag = true;
							syso("Se ha eliminado el juego de la lista")
							break;
						}
					}
					
				}else{
					syso("Juego no se encuentra en el carro")
				}
				
				}while(flagDev == true)
				**/
				
				break;
			}
			case 3: {
				
				fact = "Se ha comprado \n ";
				/**
				for (Integer busca : carrito) {
					for (Juego busca2 : juego) {
						if (busca == juego.getId()) {
							fact += juego.toString() + "\n";
							total += juego.getPrecio();
						}
					}
					
				}
				System.out.println(fact + "\n"
						+ "--------------------------------------------------------"
						+ "TOTAL A PAGAR : " + total);
						
				
				**/
				break;
			}case 4: {
				System.out.println("Se ha cancelado la compra");
				
				break;
			}
			default: System.out.println("Error de eleccion vuelva a intentarlo");
			}
			
			
		}while(ele != 4);
		
	}
	
	public static void modificarCliente() {
		
		System.out.println("Que se debe cambiar: \n"
							+ "");
		
	}
	
	public static void añadirJuego() {
		
	}
	
	public static void añadirCliente() {
		
	}

}
