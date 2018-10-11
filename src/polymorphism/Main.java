package polymorphism;

/**
 * 对于多态的简单例子
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("--------------------------");
		//Dog in Animal
		{
			Animal animal1 = new Dog();
			// 对未复写的方法调用到父类的方法
			animal1.eat("Bone");
			animal1.running("road");
			// 对于复写的方法,会被指向子类对象的方法中
			animal1.HaHaHa();
			// 对于子类独有的方法,需要转成子类对象才能够使用
			((Dog) animal1).cry("emmm~~~");
		}
		System.out.println("--------------------------");
		//Cat in Animal
		{
			Animal animal2 = new Cat();
			// 对未复写的方法调用到父类的方法
			animal2.eat("Fish");
			animal2.running("roof");
			// 对于复写的方法,会被指向子类对象的方法中
			animal2.HaHaHa();
			// 对于子类独有的方法,需要转成子类对象才能够使用
			((Cat) animal2).cry(3);
		}
		System.out.println("--------------------------");
	}

}
