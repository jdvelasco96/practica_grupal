package Principal;

public class Usuario {

		private String nombre;
		private String dni;
		private int tlfn;
		private String mail;
		private int edad;

		public Usuario() {
		
			nombre=" ";
			dni=" ";
			tlfn=0;
			mail=" ";
			edad=0;
			
		}	
		public Usuario(String nombre,String dni,int tlfn,String mail,int edad) {
			
			this.nombre=nombre;
			this.dni=dni;
			this.tlfn=tlfn;
			this.mail=mail;
			this.edad=edad;
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
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad=edad;
		}
		public String getVa() {
			return getNombre() + ";" + getDni() + ";" + getTlfn() + ";" + getMail() + ";" + getEdad();
		}
		public String toString() {
			
			return "- Nombre: " + getNombre() + "\n"
				 + "- DNI: " + getDni() + "\n"
				 + "- Telefono: " + getTlfn() + "\n"
				 + "- Correo: " + getMail() + "\n"
				 + "- Edad: " + getEdad();
		}
}
