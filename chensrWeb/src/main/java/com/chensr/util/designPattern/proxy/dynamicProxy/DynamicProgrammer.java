package com.chensr.util.designPattern.proxy.dynamicProxy;

public class DynamicProgrammer implements DynamicPeople {

	@Override
	public void codeing() {
		System.out.println("我在写代码...");
	}

	@Override
	public void doOtherThing(String things) {
		System.out.println(things+"...");
	}
}
