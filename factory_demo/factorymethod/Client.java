package cn.voken.design_pattern.factory_demo.factorymethod;

public class Client {
	public static void main(String[] args) {
		Car c1 = new AudiFactory().createCar();
		c1.run();
		
		Car c2 = new BydFactory().createCar();
		c2.run();
	}
}
