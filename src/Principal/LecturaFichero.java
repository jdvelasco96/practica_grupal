package Principal;

import java.io.*;
import java.util.ArrayList;


public class LecturaFichero {
	
	// al metodo le pasamos un objeto de la clase file (una direccion) entonces nos mete en un array list cada linea del
	// archivo que lee y lo devuelve a la llamada donde tendremos que tratar al informacion como necesitemos.

	public ArrayList<String> leerFichero(File fichero) throws Exception {
		ArrayList<String> datos=new ArrayList<String>(); 
		BufferedReader br=null;
		br= new BufferedReader(new FileReader(fichero));
						
		while (br.ready()) {
			datos.add(br.readLine().trim());
		}
		System.out.println("Archivo leido correctamente");
		br.close();
		return datos;
	}
}