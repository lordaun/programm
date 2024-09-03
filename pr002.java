class pr002{
	public static void main(String args[]) {
		byte b, bb, bbb; //8-bitnoe peremennya
		short s, ss, sss; //16-bitnoe peremennaya
		int i, ii, I; //32-bitnoe peremennaya
		long l, ll, L; //64-bitnoe peremennaya
		b = 127;
		bb = (byte) 130;
		s = 32000;
		ss = (short) 33000;
		System.out.println("bb = " + bb + "\nss = " + ss);
		sss = 100;
		bbb = (byte)sss;
		System.out.println("bbb = " + bbb + "\nsss = " + sss);
		ii = 700000; 
		int V = ii*ii*ii;
		System.out.println("obiem kuba "+ V);
		long VV = (long)ii*ii*ii;
		System.out.println("pravilniy obiem kuba "+ VV);
		
		double d;
		d = b/2;
		System.out.println("d= "+ d);
		double dd = (double)b/2;
		System.out.println("dd= "+ dd);

	}
}
