package polymorphism;

import polymorphism.action.Eat;
import polymorphism.action.Running;

public class Animal implements Eat,Running{
	
	String Name;//动物的名称
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	/**
	 * 打算复写测试是否调用父类
	 */
	public void HaHaHa() {
		System.out.println("父类Animal大声的笑");
	}
	
	/**
	 * 打算在子类中使用,但提交参数,查看是否调用
	 */
	public void cry() {
		System.out.println("Animal可能没有被调用到,会感到伤心");
	}
	
	@Override
	public void running(String where) {
		System.out.println("我是一只"+Name+",喜欢在"+where+"的夕阳下奔跑");
		
	}

	@Override
	public void eat(String food) {
		System.out.println("我是一只"+Name+",最喜欢吃"+food);
	}
}