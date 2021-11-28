
public abstract class Vozilo {
	
	private String naziv;
	private double cena;

	public Vozilo(String naziv, double cena) {
		super();
		this.naziv = naziv;
		this.cena = cena;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public double prodajnaCena() {
		return cena;
	}

	@Override
	public String toString() {
		return "Vozilo:"+ naziv + "\nCena:" + cena;
	}
	

}
