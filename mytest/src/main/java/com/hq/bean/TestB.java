package com.hq.bean;

/**
 * @description:
 * @author: Mr.Huang
 * @create: 2019-09-19 17:17
 **/
public class TestB {
	private TestC testC;

	public TestB() {
	}

	public void b() {
		testC.c();
	}

	public TestC getTestC() {
		return testC;
	}

	public void setTestC(TestC testC) {
		this.testC = testC;
	}
}
