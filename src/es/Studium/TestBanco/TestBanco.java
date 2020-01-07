package es.Studium.TestBanco;
import es.Studium.TestBanco.Cliente;
import es.Studium.TestBanco.Cuenta;
/**
 * 
 * @author Alvca
 *
 */
public class TestBanco {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/* Antonio y Beatriz se hacen cliente del banco */
		Cliente antonio = datosClienteAntonio();
		Cliente beatriz = datosClienteBeatriz();
 
		/* Por defecto, todas las cuentas nuevas tienen 100€ */
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);
 
		/* Antonio y Beatriz consultan el saldo */
		consultarSaldo(cuentaAntonio);
		consultarSaldo(cuentaBeatriz);
 
		/* Beatriz transfiere 50€ a Antonio */
		transferencia50(cuentaAntonio, cuentaBeatriz);
 
		consultarSaldo(cuentaAntonio);
		consultarSaldo(cuentaBeatriz);
 
		/* Antonio gana 100€ en una rifa y hace un ingreso en su cuenta */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 100);
 
		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 30);
 
		transferencia50(cuentaBeatriz, cuentaAntonio);
	}

	/**
	 * @param cuentaAntonio
	 */
	private static void consultarSaldo(Cuenta cuentaAntonio) {
		System.out.println("La cuenta de " + cuentaAntonio.getCliente().getNombre() + " tiene "
				+ cuentaAntonio.getSaldo() + " euros.");
	}

	/**
	 * @param cuentaAntonio
	 * @param cuentaBeatriz
	 */
	private static void transferencia50(Cuenta cuentaAntonio, Cuenta cuentaBeatriz) {
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 50);
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 50);
	}

	/**
	 * @return
	 */
	private static Cliente datosClienteBeatriz() {
		return new Cliente ("987654321A", "Beatriz Benítez", "Calle Sol, 4");
	}

	/**
	 * @return
	 */
	private static Cliente datosClienteAntonio() {
		return new Cliente ("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
	}
}
