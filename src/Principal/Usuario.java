package Principal;

public class Usuario {

		private String nombre;
		private String dni;
		private int tlfn;
		private String mail;
		

		public Usuario() {
		
			nombre=" ";
			dni=" ";
			tlfn=0;
			mail=" ";
		}	
		public Usuario(String nombre,String dni,int tlfn,String mail) {
			
			this.nombre=nombre;
			this.dni=dni;
			this.tlfn=tlfn;
			this.mail=mail;
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
		public String toString() {
			
			return "- Nombre: " + getNombre() + "\n"
				 + "- DNI: " + getDni() + "\n"
				 + "- Telefono: " + getTlfn() + "\n"
				 + "- Correo: " + getMail();
		}
}
