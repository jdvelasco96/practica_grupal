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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void escribirFichero(ArrayList<String> a) throws Exception {
		Scanner sc= new Scanner(System.in);
		File directorio=null;
		System.out.println("Escribe el directorio donde deseas guardar los datos");
		String dir= sc.next();
		dir.replace('/', '\\');
		directorio = new File(dir);
		for (File x : directorio.listFiles()) {
			if (!x.isDirectory()) {
				BufferedReader br=new BufferedReader(new FileReader(a.toString()));
				BufferedWriter bw=new BufferedWriter(new FileWriter(x, true));
				while (br.ready()) {
					bw.write(br.readLine());
					bw.newLine();
				}
				br.close();
				bw.close();
			}
		}
		sc.close();
	}
}