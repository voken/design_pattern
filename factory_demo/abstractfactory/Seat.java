package cn.voken.design_pattern.factory_demo.abstractfactory;

public interface Seat {
	void message();
}


class LuxurySeat implements Seat {
	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("可以自动按摩......");
	}
}


class LowSeat implements Seat {
	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("不可以按摩......");
	}
}
