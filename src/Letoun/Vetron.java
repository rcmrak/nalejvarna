package Letoun;

import tools.Tools;

public class Vetron extends Letadlo { // rozsireni tridy letadlo o dalsi parametry

	double minOpadani;
	double klouzak;
	boolean vodnik;
	boolean vztlaky;
	boolean zatahovaciPodvozek;
	
	public Vetron(String registrace, int rozpeti, int delka, int vyska, int posadka, double plochaKridla,
			int hmotnostPrazdna, int hmotnostMax, int rychlostVne, double minOpadani, double klouzak, boolean vodnik,
			boolean vztlaky, boolean zatahovaciPodvozek) {
		super(registrace, rozpeti, delka, vyska, posadka, plochaKridla, hmotnostPrazdna, hmotnostMax, rychlostVne);
		this.minOpadani = minOpadani;
		this.klouzak = klouzak;
		this.vodnik = vodnik;
		this.vztlaky = vztlaky;
		this.zatahovaciPodvozek = zatahovaciPodvozek;
	}
	public Vetron(String registrace, int rozpeti, int delka, int vyska, int posadka, double plochaKridla,
			int hmotnostPrazdna, int hmotnostMax, int rychlostVne) {
		super(registrace, rozpeti, delka, vyska, posadka, plochaKridla, hmotnostPrazdna, hmotnostMax, rychlostVne);
		// TODO Auto-generated constructor stub
	}
	public double getMinOpadani() {
		return minOpadani;
	}
	public void setMinOpadani(double minOpadani) {
		this.minOpadani = minOpadani;
	}
	public double getKlouzak() {
		return klouzak;
	}
	public void setKlouzak(double klouzak) {
		this.klouzak = klouzak;
	}
	public boolean isVodnik() {
		return vodnik;
	}
	public void setVodnik(boolean vodnik) {
		this.vodnik = vodnik;
	}
	public boolean isVztlaky() {
		return vztlaky;
	}
	public void setVztlaky(boolean vztlaky) {
		this.vztlaky = vztlaky;
	}
	public boolean isZatahovaciPodvozek() {
		return zatahovaciPodvozek;
	}
	public void setZatahovaciPodvozek(boolean zatahovaciPodvozek) {
		this.zatahovaciPodvozek = zatahovaciPodvozek;
	}

	@Override
	// upravena zdedena metoda po tride OBJECT - jen ukazka, muzu si na to udelat svoji vlastni metodu
	public String toString()	// vraci string
	{ 
		String info = 
	"klouzak - "+getKlouzak()+"\n"
	+"posadka - "+getPosadka()+" osob"+"\n"
	+"nádrž na vodu - "+Tools.prelozBoolean(vodnik)+"\n"
	+"vztlaková klapka - "+Tools.prelozBoolean(vztlaky)+"\n"
	+"zatahovací podvozek - "+Tools.prelozBoolean(zatahovaciPodvozek)
	; // vytvoreni promenne String info a naliti dat
		return info;			// výstup metody ulozeny jako string
	}
		
	}
