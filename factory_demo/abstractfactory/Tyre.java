package cn.voken.design_pattern.factory_demo.abstractfactory;

public interface Tyre {
	void revolve();
}


class LuxuryTyre implements Tyre {
	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("不易磨损......");
	}
}

class LowTyre implements Tyre {
	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("易磨损......");
	}
}
