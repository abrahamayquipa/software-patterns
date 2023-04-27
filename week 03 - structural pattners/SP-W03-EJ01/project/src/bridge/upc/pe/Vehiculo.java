package bridge.upc.pe;
import java.util.List;
import java.util.ArrayList;

public abstract class Vehiculo {

	protected List<Taller> talleres=new ArrayList();

	public Vehiculo() {
		super();
		}
	 
	public boolean ordenTrabajo(Taller taller) {
		return talleres.add(taller);
	}
	public abstract void fabricar();
	public abstract int tiempoTrabajoMinimo();
	
}
