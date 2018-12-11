package cn.voken.design_pattern.factory_demo.abstractfactory;

public interface Engine {
	void run();
	void start();
}

class LuxuryEngine implements Engine {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("转得快.....");
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("启动快......");
	}
	
}

class LowEngine implements Engine {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("转得慢.....");
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("启动慢......");
	}
}
