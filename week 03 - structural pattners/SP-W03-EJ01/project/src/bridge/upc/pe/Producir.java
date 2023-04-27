package bridge.upc.pe;

import java.util.concurrent.TimeUnit;

public class Producir  extends Taller{
public Producir() {
	super();
}
	
	@Override
	public void trabajo(Vehiculo vehiculo) {
		System.out.printf("Produciendo.....");
		long timetotake = 300 * vehiculo.tiempoTrabajoMinimo();
		try {
			TimeUnit.MILLISECONDS.sleep(timetotake);
		} catch (InterruptedException exp) {

		}
		System.out.printf("Tiempo tomado:%d millis, hecho \n", timetotake);
	}
	
}
