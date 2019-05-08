public class Cuenta {

	private Integer numeroCuenta;
	private double saldo;
	private Persona propietario;

	// Constructor que recibe un Objeto
	public Cuenta(Integer numeroCuenta, double saldo, Persona propietario) throws Exception {

		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.propietario = (Persona) propietario;

		if (this.saldo < 0) {
			throw new Exception("El saldo ingresado no puede ser menor que 0");
		}
	}

	public Cuenta() {

	}

	public void transaccion(double cantidad, String tipoTransaccion) {

		if (tipoTransaccion == "retiro") {
			if (cantidad > this.saldo) {

				System.out.println("La cantidad a retirar es mayor al saldo de la cuenta.");

			} else {

				this.saldo -= cantidad;
				System.out.println("---------------------------------------");
				System.out.println("La operacion elegida es Retiro.");
				System.out.println("Retiraste : " + cantidad + ". Su nuevo saldo es : " + this.saldo + ".");
				System.out.println("---------------------------------------");

			}

		}

		if (tipoTransaccion == "deposito") {

			this.saldo += cantidad;
			System.out.println("---------------------------------------");
			System.out.println("La operacion elegida es Deposito.");
			System.out.println("Ingresaste : " + cantidad + ". Su nuevo saldo es : " + this.saldo + ".");
			System.out.println("---------------------------------------");

		}
	}

	public void mostrarDatos() {
		System.out.println("La cuenta N° " + numeroCuenta + " del propietario " + propietario.getApellido() + " "
				+ propietario.getApellido() + " tiene: $" + saldo);
	}

	public Integer getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setNumeroCuenta(Integer numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
