package Principal;

import java.util.Scanner;

public class Juego {
	
	Scanner ent= new Scanner(System.in);
	private int id;
	private String nombre;
	private String desc;
	private String categ;
	private int pegi;
	private String descPegi;
	private float precio;
	
	public Juego() {
		id = 0;
		nombre="";
		desc="";
		categ="";
		pegi=0;
		descPegi="";
		precio = 0;
	}
	
	public Juego(int id,String nombre,String desc,String categ,int pegi,String descPegi,float precio) {
		this.id = id;
		this.nombre=nombre;
		this.desc=desc;
		this.categ=categ;
		this.pegi=pegi;
		this.descPegi=descPegi;
		this.precio = precio;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getCateg() {
		return categ;
	}
	
	public String getVa() {
		
		return getId() + ";" + getNombre() 
			+ ";" + getDesc() + ";" + getCateg() 
			+ ";" + getPegi() + ";" + getDescPegi() 
			+ ";"+ getPrecio();
	}
	
	public void setCateg() {
		int num=0;
		System.out.println("Selecciona la categoria que corresponde"
				+ "\n 1-Accion	2-Arcade	3-Aventura	4-Estrategia"
				+ "\n 5-Simulacion	6-Deportes	7-Carreras	8-Superviviencia"
				+ "\n 9-Shooter	10-Rol");
		num=ent.nextInt();
		switch(num) {
		
			case(1):
				this.categ="Accion";
				break;
			case(2):
				this.categ="Arcade";
				break;
			case(3):
				this.categ="Aventura";
				break;
			case(4):
				this.categ="Estrategia";
				break;
			case(5):
				this.categ="Simulacion";
				break;
			case(6):
				this.categ="Deportes";
				break;
			case(7):
				this.categ="Carreras";
				break;
			case(8):
				this.categ="Supervivencia";
				break;
			case(9):
				this.categ="Shooter";
				break;
			case(10):
				this.categ="Rol";
				break;
		}	
	}
	
	public int getPegi() {
		return pegi;
	}

	public void setPegi() {
		int num=0;

		System.out.println("Introduce el Pegi del Juego"
				+ "\n 1-Pegi 3	2-Pegi 7	3-Pegi 12	4-Pegi 16	5-Pegi 18");
		
		num=ent.nextInt();
		switch(num) {
		
			case(1):
				this.pegi = 3;
				break;
			
			case(2):
				this.pegi = 7;
				break;
			
			case(3):
				this.pegi = 12;
				break;
			case(4):
				this.pegi = 16;
				break;
			case(5):
				this.pegi = 18;
				break;
		}
	}
	
	public String getDescPegi() {
		return descPegi;
	}
	
	public void setDescPegi(String descPegi) {
		// Lenguaje Soez, Violencia, Miedo, Juego, Sexo, Drogas, Discriminacion, Incluye Compras
		
		this.descPegi = descPegi;
	}
	
	@Override 
	public String toString() {
		
		return "ID: " + getId() + "\n" +
				"Nombre: "+getNombre()+
				"\n Descripcion: "+getDesc()+
				"\n Categoria: "+getCateg()+
				"\n Pegi: "+getPegi()+
				"\n Descripcion de Pegi: "+getDescPegi() + "\n"
				+ "----------------------------------------------------------------------- \n";
	}
}
