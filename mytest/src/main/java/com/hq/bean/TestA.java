package com.hq.bean;

import com.hq.bean.TestB;
/**
 * @description: 构造器循环依赖 A->B B->C C->A,形成一个环，没有终点，就是死循环
 * @author: Mr.Huang
 * @create: 2019-09-19 17:17
 **/
public class TestA {
	private TestB testB;

	public TestA() {
	}

	public void a() {
		testB.b();
	}

	public TestB getTestB() {
		return testB;
	}

	public void setTestB(TestB testB) {
		this.testB = testB;
	}
}
