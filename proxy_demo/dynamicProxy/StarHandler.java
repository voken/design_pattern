package cn.voken.design_pattern.proxy_demo.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {

	Star realStar;
	
	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		Object object = null;
		
		System.out.println("真正的方法执行前");
		System.out.println("面谈, 签合同, 预付款, 订机票");
		
		if (method.getName().equals("sing")) {
			object = method.invoke(realStar, args);
		}
		
		System.out.println("真正的方法执行后");
		System.out.println("收尾款");
		return object;
	}


}
