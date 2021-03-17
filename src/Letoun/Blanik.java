package Letoun;

public class Blanik extends Vetron { //rozsireni tridy vetron o dalsi parametry
	
	String typ;
	int nalet;
	String barva;
	
	public Blanik(String typ, int nalet, String barva) { //paramaetry tridy BlanikL13
		super("OK-4716", 16, 8, 2, 2, 19.5, 300, 500, 250,
				0.8, 28, false, true, true);
		this.typ = typ;
		this.nalet = nalet;
		this.barva = barva;
	
	}
	
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public int getNalet() {
		return nalet;
	}
	public void setNalet(int nalet) {
		this.nalet = nalet;
	}
	public String getBarva() {
		return barva;
	}
	public void setBarva(String barva) {
		this.barva = barva;
	}
	
	@Override
	public String toString() {
		String info =
				"registrace - "+super.getRegistrace()+"\n"
				+"typ - "+getTyp();
				return info;
				
	}
}
