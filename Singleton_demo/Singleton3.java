package cn.voken.design_pattern.Singleton_demo;

public class Singleton3 {
	
	
	//2. 懒汉式, 需要同步(线程不安全), 调用效率低, 资源利用率高
	private static Singleton3 instance;
	private Singleton3() {
		//防止反射
		if (instance != null) {
			throw new RuntimeException();
		}
	}
	
	
	public static synchronized Singleton3 getInstance() {
		if (instance == null) {
			instance = new Singleton3();
		}
		return instance;
	}
    
	//3. 双重检测锁
	
	
}
