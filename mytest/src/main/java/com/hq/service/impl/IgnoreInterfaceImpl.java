package com.hq.service.impl;

import com.hq.service.IgnoreInterface;

import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author: Mr.Huang
 * @create: 2019-09-12 15:09
 **/
public class IgnoreInterfaceImpl implements IgnoreInterface {

	private List<String> list;

	private Set<String> set;

	public List<String> getList() {
		return list;
	}

	@Override
	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	@Override
	public void setSet(Set<String> set) {
		this.set = set;
	}

}
