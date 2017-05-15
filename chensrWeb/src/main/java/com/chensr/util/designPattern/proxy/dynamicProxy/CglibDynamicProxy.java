package com.chensr.util.designPattern.proxy.dynamicProxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibDynamicProxy implements MethodInterceptor{
	public Object b;
	
	public CglibDynamicProxy(Object b){
		this.b=b;
	}
	
	public Object getProxyInstance(){
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(b.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return en.create();

    }

	@Override
	public Object intercept(Object arg0, Method method, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		 System.out.println("开始...");

	        //执行目标对象的方法
	        Object returnValue = method.invoke(b, arg2);

	        System.out.println("提交...");

	        return returnValue;
	}
}
