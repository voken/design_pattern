package cn.voken.design_pattern.factory_demo.simplefactory;
/**
 * 简单工厂（静态工厂），不修改代码，无法进行扩展，违反开闭原则
 * @author voken0370
 *
 */
public class CarFactory {
	public static Car createCar(String CarType) {
		if ("奥迪".equals(CarType)) {
			return new Audi();
		} else if ("比亚迪".equals(CarType)) {
			return new Byd();
		} else {
			return null;
		}
	}
}
