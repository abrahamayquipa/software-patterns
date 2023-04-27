package bridge.upc.pe;

public class DemoBridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Vehiculo bici=new Bici();
		bici.ordenTrabajo(new Producir());
		bici.ordenTrabajo(new Ensamblar());
		bici.ordenTrabajo(new PruebaTaller());
		bici.fabricar();
	
		
		Vehiculo auto=new Auto();
		auto.ordenTrabajo(new Producir());
		auto.ordenTrabajo(new Ensamblar());
		auto.ordenTrabajo(new Pintar());
		auto.ordenTrabajo(new PruebaTaller());
		auto.fabricar();
	
		
		Vehiculo bus=new Bus();
		bus.ordenTrabajo(new Reparar());
		bus.ordenTrabajo(new Ensamblar());
		bus.ordenTrabajo(new PruebaTaller());
		bus.fabricar();
		
		
		
		
	}

}
