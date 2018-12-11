package cn.voken.design_pattern.factory_demo.simplefactory;

/**
 * 没有工厂模式下
 * @author voken0370
 *
 */
public class Client { // 调用者
	public static void main(String[] args) {
		
		Car car1 = new Audi();
		Car car2 = new Byd();
		car1.run();
		car2.run();
		
	}
}
