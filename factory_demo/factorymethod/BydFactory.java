package cn.voken.design_pattern.factory_demo.factorymethod;

public class BydFactory implements CarFactory {
	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Byd();
	}
}
