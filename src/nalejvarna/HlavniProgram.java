package nalejvarna;

import Letoun.*;

public class HlavniProgram {
	
	public void spustit() {
		//System.out.println("a je to");
		
		Vetron blanik = new Vetron("OK-4716", 16, 8, 2, 2, 19.15,300, 500, 250, 0.8, 28, false, true, true);
		Vlecna husky = new Vlecna("OK-HMB", 11,7,3,2,19,500,890,250,"natural",1,250,1600,120,2);
		Blanik nasBlanicek = new Blanik("L-13",3546,"stribrno cerna");
		
		System.out.println(nasBlanicek.toString()+"\n");
		System.out.println(blanik.toString()+"\n");
		System.out.println(husky.getRychlostVleku()+"km/h"+"\n");
	}
}