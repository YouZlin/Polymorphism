package polymorphism;

public class Cat extends Animal{
	public Cat() {
		setName("Cat");
	}
	@Override
	public void HaHaHa() {
		System.out.println(getName()+"大声的笑");
	}
	public void cry(int time) {
		System.out.println("然而只伤心了"+time+"秒钟");
	}
}
