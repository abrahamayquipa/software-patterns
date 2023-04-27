package bridge.upc.pe;
import java.util.concurrent.TimeUnit;
public class Ensamblar extends Taller {

	public Ensamblar() {
		super();
	}
	
	@Override
	public void trabajo(Vehiculo vehiculo) {
		System.out.printf("Ensamblando.....");
		long timetotake = 200 * vehiculo.tiempoTrabajoMinimo();
		try {
			TimeUnit.MILLISECONDS.sleep(timetotake);
		} catch (InterruptedException exp) {

		}
		System.out.printf("Tiempo tomado:%d millis, hecho \n", timetotake);
	}
	
}
