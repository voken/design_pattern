package cn.voken.design_pattern.Singleton_demo;

public class Client {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(Singleton_Enum.INSTANCE == Singleton_Enum.INSTANCE);
	}
}
