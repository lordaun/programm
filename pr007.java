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
class ErrorMsg {
        String[] msgs = {
                "Ошибка вывода",
                "Ошибка ввода",
                "Переполнение диска",
                "Выход индекса за границы диапазона",
        };
        String getErrorMsg(int i13) {
                if (i13>=0 & i13<msgs.length) return msgs[i13];
                else return "Отсутствует код для ошибки";
        }
}
class Err {
	String msg;
	int severity;
	Err(String m, int s) {
		msg = m;
		severity = s;
	}
}
class ErrorInfo {
	String[] msg2 = {
		"Ошибка вывода",
                "Ошибка ввода",
                "Переполнение диска",
                "Выход индекса за границы диапазона",

	};
	int[] howBad = {3, 3, 2, 4};
	Err gerErrorInfo(int i14) {
		if(i14 >= 0 & i14 < msg2.length)
			return new Err(msgs2[i14], howBad[i14]);
		else
			return new Err("Отсутствует код для ошибки", 0);
	}
}
class Overload3 {
	int x;

	Overload3() {
		System.out.println("Внутри Overload3()");
		x = 0;
	}
	Overload3(int i19) {
                System.out.println("Внутри Overload3(int)");
                x = i19;
        }
	Overload3(double d19) {
                System.out.println("Внутри Overload3()double");
                x = (int) d19;
        }
	Overload3(int i19, j19) {
                System.out.println("Внутри Overload3(int, int)");
		x = i19*j19;
        }
}
class Summation {
	int sum;

	Summation(int num) {
		sum =0;
		for(int i20=1; i20 <= num; i20++)
			sum += i20;
	}
	Summation(Summation ob) {
		sum = ob.sum;
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
		CallByValue ob4 = new CallByValue();
		int a11 = 15, b11 = 20;
	
		System.out.println("a11 и b11 перед вызовом: " + a11 + " " + b11);

		ob4.noChange(a11, b11);
		System.out.println("a11 и b11 после вызова метода ob4.noChange: " + a11 + " " + b11);

		System.out.println();
		CallByRef ob6 = new CallByRef(15, 20);
	
		System.out.println("ob6.a12 и ob6.b12 перед вызовом: " + ob6.a12 + " " ob6.b12);
		ob6.change(ob6);
		System.out.println("ob6.a12 и ob6.b12 после вызова метода ob6.Change: " + ob6.a12 + " " + ob6.b12);

		System.out.println();

	        }
}
class CallByValue {
	void noChange(int i11, int j11) {
		i11 = i11 + j11;
		j11 = -j11;
	}
}
class CallByRef {
	int a12, b12;
	CallByRef (int i12, int j12){
		a12 = i12;
		b12 = j12;
	}

	void change(CallByRef ob5) {
		ob5.a12 = ob5.a12 + ob5.b12;
		ob5.b12 = -ob5.b12;
	}
}
