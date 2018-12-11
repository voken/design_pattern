package cn.voken.design_pattern.factory_demo.abstractfactory;

public interface CarFactory {
	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();

}


