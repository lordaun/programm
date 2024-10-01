class Avtomobil {
	int pass;
	int v;
	double rash;
}
class pr004 {
	public static void main(String args[]) {
		Avtomobil lada = new Avtomobil();
		int rasst;

		lada.pass = 4;
		lada.v = 40;
		lada.rash = 9.5;

		rasst = (int) (lada.v/lada.rash *100);
		
		System.out.println("Lada проедет " + rasst + "км. на полном баке");
	}
}
