package cn.voken.design_pattern.Singleton_demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 测试反射和反序列化破解单例模式
 * @author voken0370
 *
 */
public class Client2 {
	public static void main(String[] args) throws Exception{
//		Singleton s1 = Singleton.getInstance();
//		Singleton s2 = Singleton.getInstance();
//		
//		System.out.println(s1);
//		System.out.println(s2);
		
		
//		//1. 通过反射调用私有构造器
//		Class<Singleton3> clazz = (Class<Singleton3>) Class.forName("cn.voken.design_pattern.Singleton_demo.Singleton2");
//		Constructor<Singleton3> constructor = clazz.getDeclaredConstructor(null); // 获取无参数构造器
//		
//		constructor.setAccessible(true);
//		
//		Singleton3 s3 = constructor.newInstance();
//		Singleton3 s4 = constructor.newInstance();
//		
//		System.out.println(s3);
//		System.out.println(s4);
		
		
		//2. 通过反序列化构造多个对象
		
		Singleton4 s5 = Singleton4.getInstance();
		Singleton4 s6 = Singleton4.getInstance();
		
		System.out.println(s5);
		System.out.println(s6);
		
		//序列化
		FileOutputStream fileOutputStream = new FileOutputStream("./a.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(s5);
		objectOutputStream.close();
		fileOutputStream.close();
		
		//反序列化
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("./a.txt"));
		Singleton4 s7 = (Singleton4) objectInputStream.readObject();
		System.out.println(s7);
		
				
	}
}
