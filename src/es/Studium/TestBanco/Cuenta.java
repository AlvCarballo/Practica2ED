package es.Studium.TestBanco;
import es.Studium.TestBanco.Cliente;
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
			public Cuenta (int n, int s, Cliente cli) 
			{
				nCuenta=n;
				saldo=s;
				cliente=cli; 
				
			}
			
			public int getNCuenta () {
				return nCuenta;
			}
			public void setNCuenta(int n) {
				nCuenta=n;
			}
			public int getSaldo () {
				return saldo;
			}
			public void setSaldo(int s) {
				saldo=s;
			}
			public Cliente getCliente () {
				return cliente;
			}
			public void setCliente (Cliente cli) {
				cliente=cli;
			}
			
	}
