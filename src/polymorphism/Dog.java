package polymorphism;

public class Dog extends Animal{
	public Dog() {
		setName("Dog");
	}
	@Override
	public void HaHaHa() {
		System.out.println(getName()+"大声的笑");
	}
	public void cry(String some) {
		System.out.println("为没什么作用伤心");
	}

}
