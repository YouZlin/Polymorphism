package classic;

public class Example {
	
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();
		
		System.out.println("-----------------");
		/*
		 * 当前对象是A,只执行A的方法
		 */
		System.out.println("1--" + a1.show(b));// b : B ==> A , A Method : show(A);
		System.out.println("2--" + a1.show(c));// c : C ==> B --> A , A Method : show(A);
		System.out.println("3--" + a1.show(d));// d : D ==> B --> A , A Method : show(D);
		System.out.println("-----------------");
		/*
		 * 当前对象是A,没有强制转换成B,所以还是执行A的方法
		 */
		System.out.println("4--" + a2.show(b));// b : B ==> A , B Method : show(A);
		System.out.println("5--" + a2.show(c));// c : C ==> B --> A , B Method : show(A);
		System.out.println("6--" + a2.show(d));// d : D ==> B --> A , A Method : show(D);
		System.out.println("-----------------");
		/*
		 * 当前对象是B,
		 * 一般情况B的方法优先,
		 * 但若B的父类A的方法有对应的关系,而B的方法中不存在或者未复写,则应执行A的方法
		 */
		System.out.println("7--" + b.show(b));// b : B ==> A , B Method : show(B);
		System.out.println("8--" + b.show(c));// c : C ==> B --> A , B Method : show(B);
		System.out.println("9--" + b.show(d));// d : D ==> B --> A , A Method : show(D);
		System.out.println("-----------------");
		
		//对于继承的优先级:this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)
	}
	
	/*
	public class A {
		public String show(D obj) {
			return ("A and D");
		}

		public String show(A obj) {
			return ("A and A");
		}

	}

	public class B extends A {
		public String show(B obj) {
			return ("B and B");
		}

		public String show(A obj) {
			return ("B and A");
		}
	}

	public class C extends B {

	}

	public class D extends B {

	}
	*/
}
