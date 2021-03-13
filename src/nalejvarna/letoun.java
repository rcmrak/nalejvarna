package nalejvarna;

public class letoun {
	/**
	 * rozpeti, delka, plocha kridla, hmotnost
	 * @param rozpeti
	 * @param delka
	 * @param plochaKridla
	 * @param hmotnost
	 */
	
	public letoun(int rozpeti, int delka, int plochaKridla, int hmotnost) {
		super();
		this.rozpeti = rozpeti;
		this.delka = delka;
		this.plochaKridla = plochaKridla;
		this.hmotnost = hmotnost;
	}
	int rozpeti;
	int delka;
	int plochaKridla;
	int hmotnost;
	int brzDraha;
	int plosneZatizeni;
	int plochaVHangaru;
	final int rychlost = 80;
	
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
	public int getPlochaKridla() {
		return plochaKridla;
	}
	public void setPlochaKridla(int plochaKridla) {
		this.plochaKridla = plochaKridla;
	}
	public int getHmotnost() {
		return hmotnost;
	}
	public void setHmotnost(int hmotnost) {
		this.hmotnost = hmotnost;
	}
	public int getBrzDraha() {
		return rychlost*hmotnost/350; //350 je jakoze konstatna zpomaleni
	}
	public int getPlosneZatizeni() {
		return hmotnost/plochaKridla;
	}
	public int getPlochaVHangaru() {
		return rozpeti*delka;
	}
	
}
