package bridge.upc.pe;

public class Bus extends Vehiculo {

	@Override
	public void fabricar() {
		System.out.println("Fabricando Bus.....");

		for (Taller t : talleres) {
			t.trabajo(this);
		}
		System.out.println("Finalizado.");
		System.out.println();
	}

	@Override
	public int tiempoTrabajoMinimo() {
		return 20;
	}

}
