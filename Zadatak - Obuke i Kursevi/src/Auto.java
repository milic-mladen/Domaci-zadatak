
public class Auto extends Vozilo {
	private double kubikaza;

	public Auto(String naziv, double cena, double kubikaza) {
		super(naziv, cena);
		this.kubikaza = kubikaza;
	}

	@Override
	public double prodajnaCena() {
		if (kubikaza > 2000) {
			return getCena() * 0.95;
		}
		return super.prodajnaCena();
	}

	@Override
	public String toString() {
		return super.toString() + "\nKubikaza: " + kubikaza;
	}
}
