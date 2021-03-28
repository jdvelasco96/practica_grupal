package Principal;

public class Main {

	private String nombre;
	private String dni;
	private int tlfn;
	private boolean conectado;
	

	public Main() {
	
		nombre=" ";
		dni=" ";
		tlfn=0;
		conectado=false;
	}	
	public Main(String nombre,String dni,int tlfn,boolean conectado) {
		
		this.nombre=nombre;
		this.dni=dni;
		this.tlfn=tlfn;
		this.conectado=conectado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getTlfn() {
		return tlfn;
	}
	public void setTlfn(int tlfn) {
		this.tlfn = tlfn;
	}
	public boolean isConectado() {
		return conectado;
	}
	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}
	public String toString() {
		
		return "- Nombre: " + getNombre() + "\n"
			 + "- DNI: " + getDni() + "\n"
			 + "- Telefono: " + getTlfn() + "\n"
			 + "- Conectado: " + isConectado();
	}
}

