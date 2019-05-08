
public class Principial {

	public static void main(String[] args) throws Exception {

		Persona p1 = new Persona("Matias", "Maradei", "1157325189");
		Persona p2 = new Persona("Cristian", "Diche", "1147788742");

		Cuenta c1 = new Cuenta(1, 4000, p1);
		Cuenta c2 = new Cuenta(2, 100, p2);

		c1.transaccion(100, "retiro");
		c1.mostrarDatos();

		c2.transaccion(1000, "deposito");
		c2.transaccion(100, "retiro");
		c2.mostrarDatos();

	}

}
