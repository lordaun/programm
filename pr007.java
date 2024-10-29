class Mod {
        private int alpha;
                public int beta;
                int gamma;
                void setAlpha(int a) {
                        alpha = a;
                }
                int getAlpha() {
                        return alpha;
                }
}
class FallSoftArray{
	private int[] a;
	private int errval;
	public int length;

	public FallSoftArray(int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;
	}

	public int get(int index) {
		if(indexOK(index))
			return a[index];
		return errval;
	}
	public boolean put(int index, int val) {
		if(indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	} 

	private boolean indexOK(int index) {
		if(index >=0 & index <length)
			return true;
		return false;
	}
}
class pr007 {
        public static void main(String[] args) {
                Mod ob = new Mod();
                ob.setAlpha(77);
                System.out.println("Значение ob.alpha: " + ob.getAlpha());

                ob.beta = 242;
                ob.gamma = 34;

		System.out.println();
		FallSoftArray fs = new FallSoftArray(5, -999);

		int x;

		System.out.println("Скрытая от пользователя обработка ошибок:");
		for(int i=0; i<(fs.length * 2); i++)
			fs.put(i, i*10);

		for(int i=0; i<(fs.length * 2); i++) {
			x = fs.get(i);
			if(x != -999) System.out.print(x + " ");
		}
		System.out.println();

		for(int i=0; i <(fs.length * 2); i++)
			if(!fs.put(i, i*10))
				System.out.println("Индекс " + i + " выходит за границы массива");
		
		for(int i=0; i < (fs.length *2); i++) {
			x = fs.get(i);
			if(x != -999) System.out.print(x + " ");
			else 
				System.out.println("Индекс "+ i +" выходит за границы массива");
		}

		System.out.println();
        }
}
