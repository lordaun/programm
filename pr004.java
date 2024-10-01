class Avtomobil {
	int pass;
	int v;
	double rash;
}
class pr004 {
	public static void main(String args[]) {
		Avtomobil lada = new Avtomobil();
		Avtomobil porshe = new Avtomobil();
		int rasst, rasst2;

		lada.pass = 4;
		lada.v = 40;
		lada.rash = 9.5;

		porshe.pass = 1;
		porshe.v = 100;
		porshe.rash = 14.8;

		rasst = (int) (lada.v/lada.rash *100);
		rasst2 = (int) (porshe.v/porshe.rash *100);

		System.out.println("Lada проедет " + rasst + "км. на полном баке");
		System.out.println("Porshe  проедет " + rasst2 + "км. на полном баке");
	}
}
