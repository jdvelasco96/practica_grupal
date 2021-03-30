package Principal;

import java.util.Scanner;

public class Juego {
	
	Scanner ent= new Scanner(System.in);
	
	private String nombre;
	private String desc;
	private String categ;
	private int pegi;
	private String descPegi;
	
	public Juego() {
		
		nombre="";
		desc="";
		categ="";
		pegi=0;
		descPegi="";
	}
	public Juego(String nombre,String desc,String categ,int pegi,String descPegi) {
		this.nombre=nombre;
		this.desc=desc;
		this.categ=categ;
		this.pegi=pegi;
		this.descPegi=descPegi;
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
	public void setPegi(int pegi) {
		
		//3,7,12,16,18
		this.pegi = pegi;
	
	
	}
	public String getDescPegi() {
		return descPegi;
	
	
	}
	public void setDescPegi(String descPegi) {
		this.descPegi = descPegi;
	
	
	}
	public String toString() {
		
		return("Nombre: "+getNombre()+
				"\n Descripcion: "+getDesc()+
				"\n Categoria: "+getCateg()+
				"\n Pegi: "+getPegi()+
				"\n Descripcion de Pegi: "+getDescPegi());
	}
	
	
	
	
	
	
	

}