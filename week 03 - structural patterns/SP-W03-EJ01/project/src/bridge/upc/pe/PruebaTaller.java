package bridge.upc.pe;
import java.util.concurrent.TimeUnit;

public class PruebaTaller extends Taller{

	public PruebaTaller() {
		super();
	}
	
	@Override
	public void trabajo(Vehiculo vehiculo) {
		
		System.out.printf("Probando......");
		long timetotake = 50 * vehiculo.tiempoTrabajoMinimo();
		try {
			TimeUnit.MILLISECONDS.sleep(timetotake);
		} catch (InterruptedException exp) {

		}
		System.out.printf("Tiempo tomado:%d millis, hecho \n", timetotake);
		
	}

	
}
