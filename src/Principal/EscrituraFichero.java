package Principal;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class EscrituraFichero {
	public static void main(String args[]) {
		
		ArrayList<String>pruebas=new ArrayList<String>();
		pruebas.add("Hola mundo");
		pruebas.add("que tal");
		pruebas.add("pruebas ed");
		pruebas.add("pruebas ed 2222");
		pruebas.add("pruebas ed 2222 ceinmark");
		try {
			escribirFichero(pruebas);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void escribirFichero(ArrayList<String> a) throws Exception {
		Scanner sc= new Scanner(System.in);
		File directorio=null;
		System.out.println("Escribe el directorio donde deseas guardar los datos");
		
		directorio = new File(sc.next().replace('/','\\'));
		System.out.println(directorio.getAbsolutePath());
				
		BufferedWriter bw=new BufferedWriter(new FileWriter(directorio, true));
				
		for (String z : a) {
			bw.write(z);
			bw.newLine();
		}
		bw.close();
		sc.close();
	}
}