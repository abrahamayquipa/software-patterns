package bridge.upc.pe;
import java.util.concurrent.TimeUnit;
public class Reparar extends Taller{
public Reparar() {
	super();
}
@Override
public void trabajo(Vehiculo vehiculo) {
	System.out.printf("Reparando.....");
	long timetotake = 150 * vehiculo.tiempoTrabajoMinimo();
	try {
		TimeUnit.MILLISECONDS.sleep(timetotake);
	} catch (InterruptedException exp) {

	}
	System.out.printf("Tiempo tomado:%d millis, hecho \n", timetotake);
}
}
