package cn.voken.design_pattern.Singleton_demo;

public class Singleton {
	//私有初始化方法
	private Singleton() {
		
	}
	
	//类加载，天然线程安全
	private static Singleton instance = new Singleton();
	//1. 饿汉式, 线程安全, 不用同步, 调用效率高, 资源利用率低
	public static Singleton getInstance() {
		return instance;
	}
	
}
