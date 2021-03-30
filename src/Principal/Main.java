package Principal;

import java.util.*;

import Utiles.*;

public class Main {
	// ALMACENAR LOS DATOS 
	public static ArrayList<Juego> juegos = new ArrayList<Juego>();
	public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	// INICIO MAIN
	public static void main(String[] args) {
		
		initialicer();
		
		int ele = 0;
		String menu = "1- Comprar juegos " + "\n"
					+ "2- Modificar Cliente " + "\n"
					+ "3- Añadir Juego \n"
					+ "4- Añadir Cliente \n"
					+ "5- Salir \n"
					+ "---------------------------------------------";
		Escaner esc = new Escaner();
		//PRIMER MENU DE OPCIONES
		do {
			System.out.println(menu);
			switch (ele = esc.nextInt()) {
			case 1: {
				
				compra();
				break;
			}
			case 2: {
				
				modificarCliente();
				break;
			}
			case 3: {
				
				añadirJuego();
				break;
			}
			case 4: {
				
				añadirCliente();
				break;
			}
			case 5: {
				
				// GUARDAR LOS CAMBIOS DE LOS VALORES.
				boolean flag = false;
				do {
					ArrayList<String> gameList = new ArrayList<String>();
					ArrayList<String> userList = new ArrayList<String>();
					for (Juego juegoG : juegos) {
						gameList.add(juegoG.getVa());
					}
					for (Usuario userG : usuarios) {
						userList.add(userG.getVa());
					}
					
					try {
						Utiles.EscrituraFichero.escribirFichero(gameList);
						
					} catch (Exception e) {
						System.out.println("ocurrio un error al guardar los juegos");
					}
					try {
						Utiles.EscrituraFichero.escribirFichero(userList);
						flag = true;
					} catch (Exception e) {
						System.out.println("ocurrio un error al guardar los usuarios");
						e.printStackTrace();
					}
					
					System.out.println("Saliendo...");
					
				}while(flag != true);
				break;
			}
			default:
				System.out.println("Opcion incorrecta vuelva a intentarlo...");
			}
		}while(ele != 5 );

	}
	// CARGAR LOS DATOS DE LOS FICHEROS PREDEFINIDOS. TOCARIA ELEGIRLOS AUTOMATICAMENTE PERO NO TENEMOS TIEMPO :D 
	public static void initialicer() {
		String[] datos;
		try {
			for (String string : Utiles.LecturaFichero.leerFichero("juegos.csv")) {
				
				datos = string.split(";");
				juegos.add(new Juego(Integer.parseInt(datos[0]),datos[1],datos[2],datos[3],Integer.parseInt(datos[4]),datos[5],Float.parseFloat(datos[6])));
				
			}
		} catch (Exception e) {
			System.out.println("error al cargar");
			e.printStackTrace();
		}
		
		try {
			for (String string : Utiles.LecturaFichero.leerFichero("usuario.txt")) {
				datos = string.split(";");
				usuarios.add(new Usuario(datos[0],datos[1],Integer.parseInt(datos[2]),datos[3],Integer.parseInt(datos[4])));
			}
			
		} catch (Exception e) { 
			System.out.println("error al cargar");
			e.printStackTrace();
		}
		
		
		
	}
	
	// MENU DE ACCIONES AL COMPRAR PRODUCTOS
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
		System.out.println(juegos.toString());
		do {
			flagCom = false;
			flagDev = false;
			ele = 0;
			id = 0;
			System.out.println(menu);
		
			switch (ele = esc.nextInt()) {
			case 1: {
				
				do {
				System.out.println("Escriba el ID");
				id = esc.nextInt();
				for (Juego busca : juegos) {
					if (busca.getId() == id) {
						carrito.add(id);
						flagCom = true;
						System.out.println("se añadio correctamente " + busca.getNombre());
						break;
					}
					
				}
				}while(flagCom != true);
				
				break;
			}case 2: {
				
				
				do {
				System.out.println("Escriba el ID que desea quitar");
				id = esc.nextInt();
				if (carrito.contains(id)) {
					for (int i = 0; i < carrito.size() ; i ++) {
						if(id== carrito.get(i)){
							carrito.remove(carrito.get(i));
							flagDev = true;
							System.out.println("Se ha eliminado el juego de la lista");
							break;
						}
					}
					
				}else{
					System.out.println("Juego no se encuentra en el carro");
				}
				
				}while(flagDev != true);
				
				
				break;
			}
			case 3: {
				
				
				if (carrito.size()>0) {
						
					
					fact = "Se ha comprado \n ";
					
					for (Integer busca : carrito) {
						for (Juego busca2 : juegos) {
							if (busca == busca2.getId()) {
								fact += busca2.toString() + "\n";
								total += busca2.getPrecio();
								
							}
						}
						
					}
					System.out.println(fact + "\n"
							+ "---------------------------------------------"
							+ "TOTAL A PAGAR : " + total + "€");
					ele = 4;
				}
				else {
					System.out.println("No hay nada en el carrito.");
				}
				
				
				break;
			}case 4: {
				System.out.println("Se ha cancelado la compra");
				
				break;
			}
			default: System.out.println("Error de eleccion vuelva a intentarlo");
			}
			
			
		}while(ele != 4);
		
	}
	
	// MODIFICAR UN CLIENTE EXISTENE
	public static void modificarCliente() {
		Escaner esc = new Escaner();
		int ele = 0;
		String id = "";
		//Eleccion del usuario
		System.out.println("Escriba el DNI del usuario o 10 para salir");
		ele = esc.nextInt();
		for (Usuario user : usuarios) {
			if (id.equalsIgnoreCase(user.getDni())) {
				System.out.println(user.getNombre() + "sera cambiado");
				// Elegir que campo desea cambiar
				System.out.println("Que se debe cambiar: \n"
									+ "1- Nombre \n"
									+ "2- DNI \n"
									+ "3- Telefono \n"
									+ "4- Email \n"
									+ "5- Edad \n"
									+ "6- Salir \n");
				do {
					ele = esc.nextInt();
					switch (ele) {
					case 1:
						user.setNombre(esc.next());
						
						break;
					case 2:
						user.setDni(esc.next());
						
						break;
					case 3:
						user.setTlfn(esc.nextInt());
						
						break;
					case 4:
						user.setMail(esc.next());
						
						break;
					case 5:
						user.setEdad(esc.nextInt());
						
						break;
					case 6:
						System.out.println("Saliendo...");
						break;
			
					default:
						System.out.println("Eleccion incorrecta vuelva a intentarlo");
					}
				}while(ele !=6);
				
			}else if (id.equalsIgnoreCase("s")) {
				System.out.println("volviendo al menu inicial...");
				break;	
			}
		}
		
		
		
	}
	
	// AÑADIR UN JUEGO A LA LISTA
	public static void añadirJuego() {
		Escaner esc = new Escaner();
		Juego juegoNuevo = new Juego();
		int id = 0;
		boolean flag = false;
		System.out.println("Escriba el id");
		do {
			esc = new Escaner();
			id = esc.nextInt();
			for (int i = 0; i < juegos.size(); i++) {
				if (id == juegos.get(i).getId() ) {
					System.out.println("el id ya existe vuelva a intentarlo");
					break;
				}else if (i+1 == juegos.size()) {
					System.out.println("se añadio correctamente");
					flag = true;
					
				}
								
			}
		}while(flag != true);
		
		System.out.println("Escriba el nombre");
		juegoNuevo.setNombre(esc.next());
		
		System.out.println("Escriba una descripcion");
		juegoNuevo.setDesc(esc.next());
		
		System.out.println("Escriba la categoria");
		juegoNuevo.setCateg();
		
		System.out.println("Escriba el pegi");
		juegoNuevo.setPegi(esc.nextInt());
		
		System.out.println("Escriba una descripcion del pegui");
		juegoNuevo.setDescPegi(esc.next());
		
		juegos.add(juegoNuevo);
		System.out.println("se añadio correctamente el juego " + juegoNuevo.getNombre());
		
	}
	
	// AÑADIR UN CLIENTE A LA LISTA
	public static void añadirCliente() {
		Escaner esc = new Escaner();
		Usuario userNu = new Usuario();
		
		System.out.println("Escriba el nombre");
		userNu.setNombre(esc.next());
		System.out.println("Escriba el dni");
		userNu.setDni(esc.next());
		System.out.println("Escriba el tlfn");
		userNu.setTlfn(esc.nextInt());
		System.out.println("Escriba el mail");
		userNu.setMail(esc.next());
		System.out.println("Escriba la edad");
		userNu.setEdad(esc.nextInt());
		
		usuarios.add(userNu);
		System.out.println("se añadio correctamente al usuario " + userNu.getNombre());
	}

}
