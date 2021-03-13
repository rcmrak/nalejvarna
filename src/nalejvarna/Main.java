package nalejvarna;

public class Main {
	
 public static void main (String [] args){
	 
	 int blanikRozpeti = 16;
	 int blanikDelka = 9;
	 int blanikPlochaKridla = 19;
	 int blanikHmotnost = 300; //prazdna
	 
	 letoun Blanik = new letoun (blanikRozpeti,blanikDelka,blanikPlochaKridla,blanikHmotnost);
	 Blanik.setHmotnost(10000); //ve dvojim... nesmysl hodnota
	 
	 int plosneZatizeni = Blanik.getPlosneZatizeni();
	 int plocha = Blanik.getPlochaVHangaru();
	 
	 System.out.println("Blaník");
	 System.out.println("Plocha v hangáru je "+plocha+ "m2");
	 System.out.println("Plošné zatížení køídla "+plosneZatizeni+" kg/m2");
	 System.out.println("Velikost brzdících klapek je "+plochaKlapek(100,50)+" cm2");
	 
	 int vosaRozpeti = 15;
	 int vosaDelka = 7;
	 int vosaPlochaKridla = 12;
	 int vosaHmotnost = 380;
	 
	 letoun Vosa = new letoun(vosaRozpeti,vosaDelka,vosaPlochaKridla,vosaHmotnost);
	 plosneZatizeni = Vosa.getPlosneZatizeni();
	 plocha = Vosa.getPlochaVHangaru();
	 
	 System.out.println("\nVosa");
	 System.out.println("Plocha v hangáru je "+plocha+ "m2");
	 System.out.println("Plošné zatížení køídla "+plosneZatizeni+" kg/m2");
	 System.out.println("Velikost brzdicích klapek je "+plochaKlapek(150,15)+" cm2");
	 
	 int delkaDrahy;
	 
	 draha23 akmb23 = new draha23 ();
	 delkaDrahy = akmb23.getDelka();
	 
	 System.out.println("\ndélka dráhy AKMB 23 = "+delkaDrahy+" metrù");
	 
	 if ((Blanik.getBrzDraha()) < (akmb23.getDelka())){
		 System.out.println("Blanik - delka drahy staci");
	 }
			 
	 else
		 System.out.println("Blanik - skonci v poli...");
	 
 }
 
 public static int plochaKlapek(int delka, int sirka) {
	 int klapky = delka*sirka;
	 return klapky;
 }
}