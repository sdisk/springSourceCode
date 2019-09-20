package com.hq.bean;

/**
 * @description:
 * @author: Mr.Huang
 * @create: 2019-09-19 17:17
 **/
public class TestC {

	private TestA testA;

	public TestC() {
	}

	public void c() {
		testA.a();
	}

	public TestA getTestA() {
		return testA;
	}

	public void setTestA(TestA testA) {
		this.testA = testA;
	}
}
