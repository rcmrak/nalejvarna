package Letoun;

public class Motorak extends Letadlo {
	
	String palivo;
	int pocetMotoru;
	int vykon;
	int dolet;
	
	public Motorak(String registrace, int rozpeti, int delka, int vyska, int posadka, double plochaKridla,
			int hmotnostPrazdna, int hmotnostMax, int rychlostVne, String palivo, int pocetMotoru, int vykon,
			int dolet) {
		super(registrace, rozpeti, delka, vyska, posadka, plochaKridla, hmotnostPrazdna, hmotnostMax, rychlostVne);
		this.palivo = palivo;
		this.pocetMotoru = pocetMotoru;
		this.vykon = vykon;
		this.dolet = dolet;
	}
	public Motorak(String registrace, int rozpeti, int delka, int vyska, int posadka, double plochaKridla,
			int hmotnostPrazdna, int hmotnostMax, int rychlostVne) {
		super(registrace, rozpeti, delka, vyska, posadka, plochaKridla, hmotnostPrazdna, hmotnostMax, rychlostVne);
		// TODO Auto-generated constructor stub
	}
	public String getPalivo() {
		return palivo;
	}
	public void setPalivo(String palivo) {
		this.palivo = palivo;
	}
	public int getPocetMotoru() {
		return pocetMotoru;
	}
	public void setPocetMotoru(int pocetMotoru) {
		this.pocetMotoru = pocetMotoru;
	}
	public int getVykon() {
		return vykon;
	}
	public void setVykon(int vykon) {
		this.vykon = vykon;
	}
	public int getDolet() {
		return dolet;
	}
	public void setDolet(int dolet) {
		this.dolet = dolet;
	}
	

	

}
