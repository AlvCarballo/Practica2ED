package es.Studium.TestBanco;

public class Cliente 
{
		private String dni;
		private String nombre;
		private String direccion;
		public Cliente() {
			dni="";
			nombre="";
			direccion=""; 
		}
		public Cliente (String d, String nom, String dir) 
		{
			dni=d;
			nombre=nom;
			direccion=dir;
			
		}
		
		public String getDni () {
			return dni;
		}
		public void setDni(String d) {
			dni=d;
		}
		public String getNombre () {
			return nombre;
		}
		public void setNombre(String nom) {
			nombre=nom;
		}
		public String getDireccion () {
			return direccion;
		}
		public void setDireccion(String dir) {
			direccion=dir;
		}
}
