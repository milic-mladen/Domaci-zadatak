import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Vozilo k1 = new Kamion("mercedes", 20000);
		// Vozilo a1 = new Auto("fabia", 8000);
		// I deo
		// System.out.println(k1.prodajnaCena());
		// System.out.println(a1.prodajnaCena());
		// II deo
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite podatke za auto1:");
		System.out.println("Unesite ime automobila:");
		String ime = sc.nextLine();
		System.out.println("Unesite cenu automobila: ");
		double cena = sc.nextDouble();
		System.out.println("Unesite kubikaza automobila: ");
		double kubikaza = sc.nextDouble();

		sc.nextLine();
		System.out.println("\n\nUnesite podatke za auto2:");
		System.out.println("Unesite ime automobila:");
		String ime2 = sc.nextLine();
		System.out.println("Unesite cenu automobila: ");
		double cena2 = sc.nextDouble();
		System.out.println("Unesite kubikaza automobila: ");
		double kubikaza2 = sc.nextDouble();

		sc.nextLine();
		System.out.println("\n\nUnesite podatke za kamion:");
		System.out.println("Unesite ime kamiona:");
		String ime3 = sc.nextLine();
		System.out.println("Unesite cenu kamiona: ");
		double cena3 = sc.nextDouble();
		System.out.println("Unesite nosivost kamiona: ");
		double nosivost = sc.nextDouble();

		Vozilo a1 = new Auto(ime, cena, kubikaza);
		a1.setCena(a1.prodajnaCena());
		Vozilo a2 = new Auto(ime2, cena2, kubikaza2);
		a2.setCena(a2.prodajnaCena());
		Vozilo k1 = new Kamion(ime3, cena3, nosivost);
		k1.setCena(k1.prodajnaCena());

		AutoPlac plac = new AutoPlac();
		plac.uvezi(a1);
		plac.uvezi(a2);
		plac.uvezi(k1);

		plac.ispisi();
	}
}
