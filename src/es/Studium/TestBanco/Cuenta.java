package es.Studium.TestBanco;
import es.Studium.TestBanco.Cliente;
/**
 * 
 * @author Alvca
 *
 */
public class Cuenta {
			private int nCuenta;
			private int saldo;
			private Cliente cliente;
		public Cuenta() 
		{
				nCuenta=0;
				saldo=0;
				cliente=new Cliente(); 
			}
		/**
		 * 
		 * @param n //número de cuenta
		 * @param s //saldo cuenta
		 * @param cli // cliente
		 */
			public Cuenta (int n, int s, Cliente cli) 
			{
				nCuenta=n;
				saldo=s;
				cliente=cli; 
				
			}
			/**
			 * Devuelve el número de cuenta del cliente
			 * @return
			 */
			public int getNCuenta () {
				return nCuenta;
			}
			/**
			 * Número de cuenta del cliente
			 * @param n
			 */
			public void setNCuenta(int n) {
				nCuenta=n;
			}
			/**
			 * Devuelve el saldo del cliente
			 * @return
			 */
			public int getSaldo () {
				return saldo;
			}
			/**
			 * Saldo del cliente
			 * @param s
			 */
			public void setSaldo(int s) {
				saldo=s;
			}
			/**
			 * Devuelve los datos del cliente
			 * @return
			 */
			public Cliente getCliente () {
				return cliente;
			}
			/**
			 * Datos del cliente
			 * @param cli
			 */
			public void setCliente (Cliente cli) {
				cliente=cli;
			}
			
	}
