package Utiles;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class EscrituraFichero {
	// metodo para la copia de seguridad, se le pasa un arraylist con toda la informacion que se quiere guardar
	// y nos pide un directorio para guardar el archivo 
	public static void escribirFichero(ArrayList<String> a) throws Exception {
		Scanner sc= new Scanner(System.in);
		File directorio=null;
		System.out.println("Escribe el directorio donde deseas guardar los datos");
		
		directorio = new File(sc.next().replace('/','\\'));
		BufferedWriter bw=new BufferedWriter(new FileWriter(directorio, true));
				
		for (String z : a) {
			bw.write(z);
			bw.newLine();
		}
		System.out.println("Copia de seguridad realizada con exito en: "+directorio.getAbsolutePath());
		bw.close();
		sc.close();
	}
}