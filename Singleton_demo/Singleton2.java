package cn.voken.design_pattern.Singleton_demo;

public class Singleton2 {
	//私有初始化方法
	private Singleton2() {
		
	}
	
	
	//2. 懒汉式, 需要同步(线程不安全), 调用效率低, 资源利用率高
	private static Singleton2 instance = null;
	public static synchronized Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
    
	//3. 双重检测锁
	
	
}
