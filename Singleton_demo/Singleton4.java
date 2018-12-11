package cn.voken.design_pattern.Singleton_demo;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton4 implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//2. 懒汉式, 需要同步(线程不安全), 调用效率低, 资源利用率高
	private static Singleton4 instance;
	private Singleton4() {
		if (instance != null) {
			throw new RuntimeException();
		}
	}
	
	
	public static synchronized Singleton4 getInstance() {
		if (instance == null) {
			instance = new Singleton4();
		}
		return instance;
	}
	
	//反序列化时,直接调用该方法
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}
    
	//3. 双重检测锁
	
	
}
