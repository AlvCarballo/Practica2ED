package es.Studium.TestBanco;
public class Cliente 
/**
 * @author Alvca
 */
{
		private String dni;
		private String nombre;
		private String direccion;
		public Cliente() {
			dni="";
			nombre="";
			direccion=""; 
		}
		/**
		 * 
		 * @param d //DNI cliente
		 * @param nom //Nombre del cliente
		 * @param dir //direccion cliente
		 */
		public Cliente (String d, String nom, String dir) 
		{
			dni=d;
			nombre=nom;
			direccion=dir;
			
		}
		/**
		 *  Devuelve el dni del cliente
		 * @return 
		 */
		public String getDni () {
			return dni;
		}
		/**
		 * Dni del cliente
		 * @param d
		 */
		public void setDni(String d) {
			dni=d;
		}
		/**
		 * Devuelve el nombre del cliente
		 * @return
		 */
		public String getNombre () {
			return nombre;
		}
		/**
		 * Nombre del cliente
		 * @param nom
		 */
		public void setNombre(String nom) {
			nombre=nom;
		}
		/**
		 * Devuelve la dirección del cliente
		 * @return
		 */
		public String getDireccion () {
			return direccion;
		}
		/**
		 * Dirección del cliente
		 * @param dir
		 */
		public void setDireccion(String dir) {
			direccion=dir;
		}
}
