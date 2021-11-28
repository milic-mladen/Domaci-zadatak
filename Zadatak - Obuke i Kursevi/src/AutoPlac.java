import java.util.LinkedList;

public class AutoPlac implements IUvoz {
	LinkedList<Vozilo> autoPlac = new LinkedList<>();

	@Override
	public void uvezi(Vozilo v) {
		autoPlac.add(v);

	}

	@Override
	public double vrednostSvihVozila() {
		double suma = 0;
		for (Vozilo vozilo : autoPlac) {
			suma += vozilo.getCena();
		}
		return suma;
	}

	public void ispisi() {
		System.out.println(vrednostSvihVozila());
	}

}
