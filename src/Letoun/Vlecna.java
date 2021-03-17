package Letoun;

public class Vlecna extends Motorak{
	
	int rychlostVleku;
	int stoupaniVleku;
	
	public Vlecna(String registrace, int rozpeti, int delka, int vyska, int posadka, double plochaKridla,
			int hmotnostPrazdna, int hmotnostMax, int rychlostVne, String palivo, int pocetMotoru, int vykon, int dolet,
			int rychlostVleku, int stoupaniVleku) {
		super(registrace, rozpeti, delka, vyska, posadka, plochaKridla, hmotnostPrazdna, hmotnostMax, rychlostVne,
				palivo, pocetMotoru, vykon, dolet);
		this.rychlostVleku = rychlostVleku;
		this.stoupaniVleku = stoupaniVleku;
	}
	public int getRychlostVleku() {
		return rychlostVleku;
	}
	public void setRychlostVleku(int rychlostVleku) {
		this.rychlostVleku = rychlostVleku;
	}
	public int getStoupaniVleku() {
		return stoupaniVleku;
	}
	public void setStoupaniVleku(int stoupaniVleku) {
		this.stoupaniVleku = stoupaniVleku;
	}
	
	

}
