package bridge.upc.pe;

public class Bici  extends Vehiculo{
	
	@Override
	public void fabricar() {
		
		
		System.out.println("Fabricando bicicleta.....");
		for (Taller t : talleres) {
			t.trabajo(this);
		}
		System.out.println("Finalizado.");
		System.out.println();
		
			
	}
	@Override
	public int tiempoTrabajoMinimo() {
		return 5;
	}
	
	
}
