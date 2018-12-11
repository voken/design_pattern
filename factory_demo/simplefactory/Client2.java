package cn.voken.design_pattern.factory_demo.simplefactory;

/**
 * 简单工厂模式下
 * @author voken0370
 *
 */
public class Client2 { // 调用者
	public static void main(String[] args) {
		
		Car car1 = CarFactory.createCar("奥迪");
		Car car2 = CarFactory.createCar("宝马");
		car1.run();
		car2.run();
		
	}
}
