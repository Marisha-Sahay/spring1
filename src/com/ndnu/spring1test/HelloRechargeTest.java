package com.ndnu.spring1test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ndnu.spring1.HelloRechargeIntf;

public class HelloRechargeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    HelloRechargeIntf helloRecharge = context.getBean(HelloRechargeIntf.class);
	   helloRecharge.sayHello();
	}

}
