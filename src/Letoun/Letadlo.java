package Letoun;

abstract class Letadlo {
	
	String registrace;
	int rozpeti;
	int delka;
	int vyska;
	int posadka;
	double plochaKridla;
	int hmotnostPrazdna;
	int hmotnostMax;
	int rychlostVne;
	
	
	public Letadlo(String registrace, int rozpeti, int delka, int vyska, int posadka, double plochaKridla,
			int hmotnostPrazdna, int hmotnostMax, int rychlostVne) {
		super();
		this.registrace = registrace;
		this.rozpeti = rozpeti;
		this.delka = delka;
		this.vyska = vyska;
		this.posadka = posadka;
		this.plochaKridla = plochaKridla;
		this.hmotnostPrazdna = hmotnostPrazdna;
		this.hmotnostMax = hmotnostMax;
		this.rychlostVne = rychlostVne;
	}
	public String getRegistrace() {
		return registrace;
	}
	public void setRegistrace(String registrace) {
		this.registrace = registrace;
	}
	public int getRozpeti() {
		return rozpeti;
	}
	public void setRozpeti(int rozpeti) {
		this.rozpeti = rozpeti;
	}
	public int getDelka() {
		return delka;
	}
	public void setDelka(int delka) {
		this.delka = delka;
	}
	public int getVyska() {
		return vyska;
	}
	public void setVyska(int vyska) {
		this.vyska = vyska;
	}
	public int getPosadka() {
		return posadka;
	}
	public void setPosadka(int posadka) {
		this.posadka = posadka;
	}
	public double getPlochaKridla() {
		return plochaKridla;
	}
	public void setPlochaKridla(double plochaKridla) {
		this.plochaKridla = plochaKridla;
	}
	public int getHmotnostPrazdna() {
		return hmotnostPrazdna;
	}
	public void setHmotnostPrazdna(int hmotnostPrazdna) {
		this.hmotnostPrazdna = hmotnostPrazdna;
	}
	public int getHmotnostMax() {
		return hmotnostMax;
	}
	public void setHmotnostMax(int hmotnostMax) {
		this.hmotnostMax = hmotnostMax;
	}
	public int getRychlostVne() {
		return rychlostVne;
	}
	public void setRychlostVne(int rychlostVne) {
		this.rychlostVne = rychlostVne;
	}
}
