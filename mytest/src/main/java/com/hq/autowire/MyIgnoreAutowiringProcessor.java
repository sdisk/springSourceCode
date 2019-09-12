package com.hq.autowire;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.ArrayList;

/**
 * @description:
 * @author: Mr.Huang
 * @create: 2019-09-12 15:12
 **/
public class MyIgnoreAutowiringProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		//忽略ArrayList
		beanFactory.ignoreDependencyType(ArrayList.class);
	}
}
