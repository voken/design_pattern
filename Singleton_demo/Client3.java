package cn.voken.design_pattern.Singleton_demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

/**
 * 测试各种单例模式的效率
 * @author voken0370
 *
 */
public class Client3 {
	public static void main(String[] args) throws Exception{
		
		long start = System.currentTimeMillis();
		int threadNums = 10;
		
		final CountDownLatch countDownLatch = new CountDownLatch(threadNums);
		
		for (int i = 0; i < threadNums; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					for (int i = 0; i < 1000000; i++) {
//						Object object = Singleton.getInstance(); //饿汉式
//						Object object = Singleton2.getInstance(); //懒汉式
//						Object object = Singleton_Enum.INSTANCE; //枚举
						Object object = SingletonByStaticInnerClass.getInstance(); //静态内部类
					}
					countDownLatch.countDown();
				}
			}).start();
		}
		countDownLatch.await();
		long end = System.currentTimeMillis();
		System.out.println("总耗时: "+(end - start));
	}
}
