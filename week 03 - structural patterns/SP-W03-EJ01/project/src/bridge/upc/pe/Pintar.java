package bridge.upc.pe;
import java.util.concurrent.TimeUnit;
public class Pintar extends Taller {
public Pintar() {
	super();
	
}

@Override
public void trabajo(Vehiculo vehiculo) {
	System.out.printf("Pintando.....");
	long timetotake = 100 * vehiculo.tiempoTrabajoMinimo();
	try {
		TimeUnit.MILLISECONDS.sleep(timetotake);
	} catch (InterruptedException exp) {

	}
	System.out.printf("Tiempo tomado:%d millis, hecho \n", timetotake);
}
}
