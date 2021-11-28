
public class Kamion extends Vozilo {

	private double nosivost;

	public Kamion(String naziv, double cena, double nosivost) {
		super(naziv, cena);
		this.nosivost = nosivost;
	}

	@Override
	public double prodajnaCena() {
		if (nosivost > 10) {
			return getCena() + 1000;

		}
		return super.prodajnaCena();
	}

	@Override
	public String toString() {
		return super.toString() + "\nNosivost: " + nosivost;
	}
}
