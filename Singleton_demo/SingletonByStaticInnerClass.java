package cn.voken.design_pattern.Singleton_demo;

public class SingletonByStaticInnerClass {
	//私有初始化方法
	private SingletonByStaticInnerClass() {
		
	}
	
	//4. 静态内部类(也是懒加载方式, 线程安全), 静态内部类被调用时才加载和初始化内部类
	//优点: 兼备并发高效和延迟加载的优势
	private static class SingletonClassinstance {
		private static final SingletonByStaticInnerClass instance = new SingletonByStaticInnerClass();
	}
	
	public static SingletonByStaticInnerClass getInstance() {
		return SingletonClassinstance.instance;
	}

}
