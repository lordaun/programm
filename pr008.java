class Factorial {
	int factR(int n) {
		int result;

		if(n==1) return 1;
		result = factR(n-1) * n;
		return result;
	}

	int factI(int n) {
		int t, result;
		result = 1;
		for(t=1; t<=n; t++)
			result *= t;
		return result;
	}
}
class StaticDemo {
	int x;
	static int y;

	int sum() {
		return x+y;
	}
}
class StaticBlock {
	static double rootOf2;
	static double rootOf3;
	static {
		System.out.println("Vnutri staticheskogo blocka");
		rootOf2= Math.sqrt(2.0);
		rootOf3= Math.sqrt(3.0);
	}
	StaticBlock(String msg) {
		System.out.println(msg);
	}
}
class Outer {
	int[] nums;
	Outer(int[] n) {
		nums = n;
	}
	
	void analyze() {
		Inner inOb = new Inner();
		System.out.println("Minimalnoe znacheniye: " + inOb.min());
		System.out.println("Maximalnoe znacheniye: " + inOb.max());
		System.out.println("Sredneye znacheniye: " + inOb.avg());
	}
	class Inner {
		int min() {
			int m = nums[0];
			for(int i=1; i<nums.length; i++)
				if(nums[i] < m) m = nums[i];
			return m;
		}
		int max() {
                        int m = nums[0];
                        for(int i=1; i<nums.length; i++)
                                if(nums[i] > m) m = nums[i];
                        return m;
                }
		int avg() {
                        int a = 0;
                        for(int i=0; i<nums.length; i++)
                                a += nums[i];
                        return a/nums.length;
                }
	}
}

class pr008 {
	public static void main(String[] args) {
		Factorial f = new Factorial();

		System.out.println("ВЫчисление факториала рекурсивным методом");
		System.out.println("Факториал 3 равен " + f.factR(3));
		System.out.println("Факториал 4 равен " + f.factR(4));
		System.out.println("Факториал 5 равен " + f.factR(5));
		
		System.out.println("");
		
		System.out.println("Вычесление факториала итеративным методом");
		System.out.println("Факториал 3 равен " + f.factI(3));
                System.out.println("Факториал 4 равен " + f.factI(4));
                System.out.println("Факториал 5 равен " + f.factI(5));

		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();

		ob1.x = 10;
		ob2.x = 20;

		System.out.println("ob1.x и ob2.x независимы другот друга");
		System.out.println("ob1.x: " + ob1.x + "\nob2.x " + ob2.x);
	
		System.out.println();

		System.out.println("Статическая переменная y является общей");
		StaticDemo.y = 19;
		System.out.println("Для y = 19");

		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		
		StaticDemo.y = 100;
		System.out.println("Для y = 100");

		System.out.println("ob1.sum(): " + ob1.sum());
                System.out.println("ob2.sum(): " + ob2.sum());

		System.out.println();
		StaticBlock ob = new StaticBlock("Vnutri konstructora");

		System.out.println("kvadratniy koren' iz 2: "+ StaticBlock.rootOf2);
		System.out.println("kvadratniy koren' iz 3: "+ StaticBlock.rootOf3);
		
		int[] x = {3, 2, 1, 5, 6, 9, 7, 2};
		Outer outOb = new Outer(x);

		outOb.analyze();
	}
}
